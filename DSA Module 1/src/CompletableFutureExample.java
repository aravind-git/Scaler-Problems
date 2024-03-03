import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

    public static void main(String[] args) {
        int n = 3; // Number of CompletableFuture instances
        // Create and combine CompletableFuture instances using thenApply
        CompletableFuture<String> combinedFuture = CompletableFuture.supplyAsync(() -> "Result from Future 1");
        for (int i = 2; i <= n; i++) {
            int current = i;
            combinedFuture = combinedFuture.thenApply(result -> result + " Result from Future " + current);
        }
        // Get the combined result
        String finalResult = combinedFuture.join();
        // Do something with the combined result
        System.out.println("Combined Result: " + finalResult);
    }
}
