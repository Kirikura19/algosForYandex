import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static int[] enterArray()
    {
        int len;
        Scanner in = new Scanner(System.in);
        len = in.nextInt();
        int[] h = new int[len];
        for(int i = 0; i < len; i++)
        {
            h[i]= in.nextInt();
        }
        return h;
    }

    public static int findMaxPos(int[] h)
    {
        int max = -1;
        int pos = -1;

        for(int i = 0; i < h.length; i++)
        {
            if(h[i] > max)
            {
                max = h[i];
                pos = i;
            }
        }

        return pos;
    }

    public static int findWaterBlocks(int[] h, int pos)
    {

        int water = 0;
        int highest = h[0];
        for(int i = 1; i < pos; i++)
        {
            if (highest >= h[i])
            {
                water += highest - h[i];
            }
            if(h[i] > highest)
            {
                highest = h[i];
            }
        }

        highest = h[h.length-1];

        for(int i = h.length-1; i > pos; i--)
        {
            if (highest >= h[i])
            {
                water += highest - h[i];
            }
            if(h[i] > highest)
            {
                highest = h[i];
            }
        }

        return water;
    }


    public static void main(String[] args)
    {
        System.out.println(findWaterBlocks(enterArray(), findMaxPos(enterArray())));
    }
}