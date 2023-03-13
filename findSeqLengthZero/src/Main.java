import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int findQntZeroPath(int[] arrSeqPrefSum)
    {
        int qnt = 0;
        System.out.println(Arrays.toString(arrSeqPrefSum));
        for(int i = 0; i < arrSeqPrefSum.length - 1; i++)
        {
            if(arrSeqPrefSum[i] == arrSeqPrefSum[i+1])
            {
                q += 1;
                while(arrSeqPrefSum[i] != arrSeqPrefSum[i+1])
                {
                    i++
                }
            }
        }
    }
    public static  int[] makePrefixSum(int[] arrSeq)
    {
        int[] arrSeqPrefSum = new int[arrSeq.length + 1];
        arrSeqPrefSum[0] = 0;
        for(int i = 1; i < arrSeqPrefSum.length; i++)
        {
            arrSeqPrefSum[i] = arrSeq[i-1] + arrSeqPrefSum[i-1];
        }
        return arrSeqPrefSum;
    }
    public static int[] enterSeq()
    {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] arrSeq = new int[length];
        for(int i = 0; i < length; i++)
        {
            arrSeq[i] = in.nextInt();

        }
        return arrSeq;
    }

    public static void main(String[] args)
    {

        System.out.println(findQntZeroPath(makePrefixSum(enterSeq())));
    }
}