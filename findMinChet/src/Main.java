import java.util.Scanner;

public class Main {

    static int findMinChet(int[] arr) {
        int myInf = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0 && (myInf == -1 || arr[i] < myInf))
            {
                myInf = arr[i];
            }
        }
        return myInf;
    }


    public static void main(String[] args)
    {
        int N;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println(findMinChet(arr));
    }
}