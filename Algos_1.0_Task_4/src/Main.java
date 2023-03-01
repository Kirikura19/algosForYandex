import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if(c < 0)
        {
            System.out.println("NO SOLUTION");
            System.exit(0);
        }
        if(a == 0 && b >= 0)
        {
            if(Math.sqrt(b) == c)
            {
                System.out.println("MANY SOLUTIONS");
                System.exit(0);
            }
            else
            {
                System.out.println("NO SOLUTION");
                System.exit(0);
            }
        }
        if(a == 0 && b < 0)
        {

            System.out.println("NO SOLUTION");
            System.exit(0);

        }



        if(a!= 0)
        {
            int x = (c*c - b)/a;
            System.out.println(x);
        }
        else
        {
            System.out.println("NO SOLUTION");
            System.exit(0);
        }

    }
}