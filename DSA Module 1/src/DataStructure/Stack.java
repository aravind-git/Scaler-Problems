package DataStructure;

import java.util.Arrays;

public class Stack {

    String[] arr;
    int top;

    public Stack(int size) {
        arr = new String[size];
        top = -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
    }

    public void toString1() {
        Arrays.stream(arr).forEach(System.out::print);
    }

    public void push(String element) {
        if (top == arr.length - 1) {
            System.out.println("Stack is full");
            //System.exit(0);
        } else {
            if (top != -1 && arr[top].equals(element)) {
                --top;
            } else {
                arr[++top] = element;
            }
        }
    }

    String pop() {
        if (top == -1) {
            System.out.println("Stack Is empty");
            return "";
        } else {
            top--;
            return arr[top];
        }

    }

    String peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return "";
        } else {
            return arr[top];
        }
    }
}
