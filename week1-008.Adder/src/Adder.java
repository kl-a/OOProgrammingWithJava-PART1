
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number:");
        int int1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number:");
        int int2 = Integer.parseInt(reader.nextLine());
        
        String result =  "Sum of thte numbers:" + (int1 + int2);
        System.out.println(result);
           
        // Implement your program here. Remember to ask the input from user
    }
}
