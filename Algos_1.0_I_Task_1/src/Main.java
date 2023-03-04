import java.util.Scanner;

public class Main
{
    public static void input()
    {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        int E = in.nextInt();
        kingOfTheIf(A, B, C, D, E);
    }
    public static void output()
    {
        System.out.println("YES");
        System.exit(0);
    }
    public static void kingOfTheIf(int A, int B, int C, int D, int E)
    {
        if( (D >= A && E >= B) || (D >= B && E >= A) )
        {
            output();
        }
        if( (D >= A && E >= C) || (D >= C && E >= A) )
        {
            output();
        }
        if( (D >= B && E >= C) || (D >= C && E >= B) )
        {
            output();
        }
        System.out.println("NO");
    }
    public static void main(String[] args)
    {
        input();
    }
}