package ss_11_stack_queue.bai_tap.invertElement_Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ArrayOfStringReserve {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi bất kì: ");
        String string = scanner.nextLine();

        String[] stringArr = string.split(" ");
        System.out.println(Arrays.toString(stringArr));

        for (String item : stringArr) {
            stack.push(item);
        }

        string = "";
        while (!stack.isEmpty()) {
            string += stack.pop() + " ";
        }
        System.out.println(string);
    }
}
