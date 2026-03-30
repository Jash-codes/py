import java.util.Scanner;

public class scanner {

    public static void main(String [] args){

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int num = obj.nextInt();

        System.out.println("Entered number : " + num);

        obj.close();

    }
    
}
