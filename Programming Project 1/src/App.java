import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        //Scanner keyboard = new Scanner(System.in);  
        //System.out.println("Enter Ciphertext: ");

        //String ciphertext = keyboard.nextLine(); 

        String string = "I am really busy right now";

        String deciphertext = string.replaceAll("I", "l");

        System.out.println(deciphertext);
        
}
    }

