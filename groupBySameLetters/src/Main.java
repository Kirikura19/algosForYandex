import java.util.*;

public class Main
{

    public static String step(String[] temp)
    {
        Arrays.sort(temp);
        String tempSortedSeq = Arrays.toString(temp);
        return tempSortedSeq;
    }
    public static void main(String[] args)
    {

        Map<String,String> dictionary = new HashMap<String,String>();
        Scanner in = new Scanner(System.in);
        String[] seq = in.nextLine().split(", ");
        String[] temp;


        for(int i = 0; i < seq.length; i++)
        {
            temp = seq[i].split("");
            String tempSortedSeq = step(temp);

            if(!dictionary.containsKey(tempSortedSeq))
            {
                dictionary.put(tempSortedSeq, "");
            }
            dictionary.put(tempSortedSeq, dictionary.get(tempSortedSeq) + " " + seq[i]);
        }
        System.out.println(dictionary.toString());
    }
}