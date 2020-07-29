import java.util.Scanner;

public class InputPractice
{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter a sentence: ");
        String blah = kb.nextLine();
        System.out.println("Your input: " + blah);
        
        System.out.println("Enter an integer: ");
        int num = kb.nextInt();
        
        System.out.println("Enter a decimal: ");
        double numTwo = kb.nextDouble();
        
        System.out.println("Enter a singular word: ");
        String word = kb.next();
        
        System.out.println("Integer: " + num + "\nDecimal: " + numTwo + "\nWord " + word);
        

    }
}
