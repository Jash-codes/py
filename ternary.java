import java.util.Scanner;

public class ternary {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        

        System.out.print("Enter your age : ");
        int age = obj.nextInt();

        String check = (age > 18) ? "valid" : "not-valid";

        System.out.println(check);


        obj.close();

    }
    
}
