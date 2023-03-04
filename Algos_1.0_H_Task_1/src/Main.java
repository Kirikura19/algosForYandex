import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void checkExist(int minFirstTrain, int minSecondTrain, int maxFirstTrain, int maxSecondTrain)
    {
        if(Math.max(minFirstTrain, minSecondTrain) > Math.min(maxFirstTrain, maxSecondTrain))
        {
            System.out.println(-1);
            System.exit(0);
        }
    }
    public static int makeMaxTrain(int quantity, int time)
    {
        return (quantity + 1) * time + quantity;
    }
    public static int makeMinTrain(int quantity, int time)
    {
        return (quantity - 1) * time + quantity;
    }
    public static void output(int min, int max)
    {
        System.out.println(min + " " + max);
    }
    public static void serviceTrain(int quantity1, int quantity2, int time1, int time2)
    {
        int maxFirstTrain = makeMaxTrain(quantity1, time1);
        int maxSecondTrain = makeMaxTrain(quantity2, time2);

        int minFirstTrain = makeMinTrain(quantity1, time1);
        int minSecondTrain = makeMinTrain(quantity2, time2);

        int min = 0;
        int max = 0;

        checkExist(minFirstTrain, minSecondTrain, maxFirstTrain, maxSecondTrain);

        min = Math.max(minFirstTrain, minSecondTrain);
        max = Math.min(maxFirstTrain, maxSecondTrain);

        output(min, max);
    }
    public static void input()
    {
        Scanner in = new Scanner(System.in);

        int time1 = in.nextInt();
        int time2 = in.nextInt();
        int quantity1 = in.nextInt();
        int quantity2 = in.nextInt();
        serviceTrain(quantity1, quantity2, time1, time2);
    }
    public static void main(String[] args)
    {
        input();
    }
}