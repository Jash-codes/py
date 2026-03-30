

public class sam {

    public static void main(String[] args) {

        boolean ab = true;
        boolean cd = false;

        byte z = 127;

        char b = 'A';

        short d = 32767;

        int x = 1234;
        long y = 123456776125311L;

        float f = 3.14f;

        double df = 8.1356d;

        System.out.println("ab : " + ab);
        System.out.println(cd);
        System.out.println(z); 
        System.out.println(b);
        System.out.println(d);
        System.out.println(x);
        System.out.println(y);
        System.out.println(f);
        System.out.println(df);

        //Non  Primitive

        String myname = "Jash";

        System.out.println("my name is : " + myname);

        int [] my_array = {1,2,3,4,5};

        System.out.println(Arrays.toString(my_array));
        
        String [] my_string = {"jash" , "max"};
        System.out.println(Arrays.toString(my_string));
       
    }

}