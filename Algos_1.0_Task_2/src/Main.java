import java.util.Scanner;

public class Main {

    static void checkTriangle(int firstEdge, int secondEdge, int thirdEdge)
    {

        boolean a = ((firstEdge + secondEdge) > thirdEdge) &&
                ((thirdEdge + secondEdge) > firstEdge) &&
                ((firstEdge + thirdEdge) > secondEdge);

        if (a)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int firstEdge = in.nextInt();
        int secondEdge = in.nextInt();
        int thirdEdge = in.nextInt();

        checkTriangle(firstEdge, secondEdge, thirdEdge);

    }
}