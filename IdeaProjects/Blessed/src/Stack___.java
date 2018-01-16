import java.util.*;
public class Stack___ {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        stack.push("RED");
        printstack(stack);
        stack.push("Blue");
        printstack(stack);
        stack.push("YELLOW");
        printstack(stack);

        stack.pop();
        printstack(stack);
        stack.pop();
        printstack(stack);
        stack.pop();
        printstack(stack);

        int  x= 667;
        Stack <Integer> s = new Stack<>();
        s.push(23);
        s.push(24);
        s.push(25);
        s.push(26);
        s.push(28);
        s.push(x);



        System.out.println();
        System.out.printf("%s \n ", s);
        System.out.println(  s.search(25));


    }
    public static void printstack(Stack<String>s){
        if(s.isEmpty())
            System.out.println("MAN, Your stack is empty");
        else
            System.out.printf("%s This is the top of the stack!!!\n",s );
    }
}
