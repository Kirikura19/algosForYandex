import java.util.*;

public class Main
{
    public static int findMin(int[] arr)
    {
        int min = arr[0] + 1;
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i]< min)
            {
                min = arr[i];
            }
        }
        return min;
    }
    public static int findMax(int[] arr)
    {
        int max = arr[0] - 1;
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i]> max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static List<Integer> countingSort(int[] arr)
    {
        List<Integer> answer = new ArrayList<>();
        int min = findMin(arr);
        int max = findMax(arr);
        int[] countingArr = new int[max-min+1];
        for(int i = 0; i < arr.length; i++)
            countingArr[arr[i] - min] += 1;
        for(int i = 0; i < countingArr.length; i++)
            for(int j = 0; j < countingArr[i]; j++)
                answer.add(min + i);
        return answer;
    }

    public static void main(String[] args)
    {
        int count;
        Scanner in = new Scanner(System.in);
        count = in.nextInt();
        int[] arr = new int[count];
        for(int i = 0; i < count; i++)
        {
            arr[i] = in.nextInt();
        }
        List<Integer> answer = countingSort(arr);
        System.out.println(answer.toString());
    }
}