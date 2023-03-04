import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[] Rect = new int[4];
    static int[] input()
    {
        Rect = new int[4];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < Rect.length; i++)
            Rect[i] = in.nextInt();
        return Rect;
    }
    static int[] combinations(int[] Rect)
    {
        int[] combs = new int[4];
        combs[0] = (Math.max(Rect[0], Rect[3]) * (Rect[1] + Rect[2]));
        combs[1] = (Math.max(Rect[0], Rect[2]) * (Rect[1] + Rect[3]));
        combs[2] = (Math.max(Rect[1], Rect[3]) * (Rect[0] + Rect[2]));
        combs[3] = (Math.max(Rect[1], Rect[2]) * (Rect[0] + Rect[3]));
        return combs;
    }
    static void output(int[] combs)
    {
        if(Arrays.stream(combs).min().getAsInt() == combs[0])
        {
            System.out.println(Math.max(Rect[0], Rect[3]) + " " + (Rect[1] + Rect[2]));
            System.exit(0);
        }
        if(Arrays.stream(combs).min().getAsInt() == combs[1])
        {
            System.out.println(Math.max(Rect[0], Rect[2]) + " " + (Rect[1] + Rect[3]));
            System.exit(0);
        }
        if(Arrays.stream(combs).min().getAsInt() == combs[2])
        {
            System.out.println(Math.max(Rect[1], Rect[3]) + " " + (Rect[0] + Rect[2]));
            System.exit(0);
        }
        if(Arrays.stream(combs).min().getAsInt() == combs[3])
        {
            System.out.println(Math.max(Rect[1], Rect[2]) + " " + (Rect[0] + Rect[3]));
            System.exit(0);
        }

    }
    public static void main(String[] args)
    {
        output(combinations(input()));
    }
}