import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Map<Integer,Integer> dictVertical = new HashMap<Integer,Integer>();
    static Map<Integer,Integer> dictHorizon = new HashMap<Integer,Integer>();

    static void dictVerticalPut(int Cord)
    {
        if(!dictVertical.containsKey(Cord))
            dictVertical.put(Cord, -1);
        dictVertical.put(Cord, dictVertical.get(Cord) + 1);
    }
    static void dictHorizonPut(int Cord)
    {
        if(!dictHorizon.containsKey(Cord))
            dictHorizon.put(Cord, -1);
        dictHorizon.put(Cord, dictHorizon.get(Cord) + 1);
    }

    static void input()
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        for(int i = 0; i < M; i++)
        {
            int xCord = in.nextInt();
            int yCord = in.nextInt();

            dictHorizonPut(xCord);
            dictVerticalPut(yCord);
        }
    }

    public static void main(String[] args)
    {
        input();

        int answer = dictVertical.values().stream().mapToInt(Integer::intValue).sum() +
                dictHorizon.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println(answer);




    }
}