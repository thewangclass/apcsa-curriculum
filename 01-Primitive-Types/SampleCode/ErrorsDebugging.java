import java.util.Scanner;

public class ErrorsDebugging
{
    public static void main(String[] args){
        // Uncomment the line of code below to see a syntax error
        // System.out.println("This is a syntax error")
        
        // Uncomment the lines of code below to see a runtime error
        // The code below should take the user input and print Hello + input
        Scanner kb = new Scanner(System.in);
        String name = kb.nextLine();
        System.out.println("Hello Charles");
    }
}
