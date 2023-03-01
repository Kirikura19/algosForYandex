import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k1 = in.nextInt(); // новый номер квартиры

        int m = in.nextInt(); // этажей всего
        int k2 = in.nextInt(); // номер квартиры
        int p2 = in.nextInt(); // номер подъезд
        int n2 = in.nextInt(); // номер этажа



        int f = 0; // квартир на этаже

        int p1, n1; // Подъезд, этаж

        while (n2 * f < k2) {
            f++;
        }

        p1 = p2;

        while (k1 > m * p1 * f)
        {
            p1++;
        }

        n1 = 1;
        if(m != 1)
        {
            while (k1 > ((p1-1)*m*f) + (n1 * f))
            {
                n1++;
            }

        }




        System.out.println(p1 + " " + n1);


    }
}