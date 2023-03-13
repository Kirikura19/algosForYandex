import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        String  seq = "ALKJADSBFAJFALKFJASKLF";
        String[] seqArr = seq.split("");
        int[] lenArr = new int[100];
        int k = 0;

        for(int i = 0; i < seqArr.length - 1; i++)
        {
            if(seqArr[i].equals("A"))
            {
                for(int j = i; j < seqArr.length - 1; j++)
                {
                    if(!seqArr[j+1].equals("F"))
                    {
                        lenArr[k] += 1;
                    }
                    else
                    {
                        k = +1;
                        i = j+1;
                        break;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(lenArr));
    }
}