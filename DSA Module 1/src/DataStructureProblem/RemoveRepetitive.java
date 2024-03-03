package DataStructureProblem;

import DataStructure.Stack;

public class RemoveRepetitive {
    //abbcbbcacx -> ax
    // If the top equals incoming then remove

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push("a");
        stack.push("b");
        stack.push("b");
        stack.push("c");
        stack.push("b");
        stack.push("b");
        stack.push("c");
        stack.push("a");
        stack.push("c");
        stack.push("x");
        stack.toString1();


    }
}
