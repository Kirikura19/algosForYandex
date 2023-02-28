import java.util.Scanner;

public class Main {

    static int[] findMax(int[] arr) {
        int myInf1 = Math.max(arr[0], arr[1]);
        int myInf2 = Math.min(arr[0], arr[1]);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > myInf1) {
                myInf2 = myInf1;
                myInf1 = arr[i];
            }
            if (arr[i] < myInf1 && myInf2 < arr[i]) {
                myInf2 = arr[i];
            }
        }
        int[] answ = new int[]{myInf1, myInf2};
        return answ;
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
        int[] answ = findMax(arr);
        System.out.println(answ[0] + " " + answ[1]);
    }
}