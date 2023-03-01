import java.util.Scanner;

public class Main
{
    static int[] input()
    {
        int[] metal = new int[3];
        Scanner in = new Scanner(System.in);
        metal[0] = in.nextInt();
        metal[1] = in.nextInt();
        metal[2] = in.nextInt();
        return metal;
    }

    static void makeMetal()
    {
        int[] metal = input();
        int q = 0;
        while(metal[0] >= metal[1])
        {
            metal[0] = metal[0] - metal[1];
            int temp = metal[1];
            while(temp > 0)
            {
                if(temp >= metal[2])
                {
                    temp = temp - metal[2];
                    q++;
                }
                else
                {
                    metal[0] += temp;
                    temp = 0;
                }

            }
        }
        System.out.println(q);
    }

    public static void main(String[] args)
    {
        makeMetal();
    }
}