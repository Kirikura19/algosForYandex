import java.util.Scanner;

public class Main
{
    static void switchCond(int tRoom, int tCond, String mode)
    {
        switch (mode)
        {
            case("freeze"):
                if (tRoom < tCond)
                    System.out.println(tRoom);
                else
                    System.out.println(tCond);
                break;

            case("heat"):
                if(tRoom < tCond)
                    System.out.println(tCond);
                else
                    System.out.println(tRoom);
                break;

            case("auto"):
                System.out.println(tCond);
                break;

            case("fan"):
                System.out.println(tRoom);
                break;
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int tRoom = in.nextInt();
        int tCond = in.nextInt();
        String mode = in.next();

        switchCond(tRoom, tCond, mode);


    }
}