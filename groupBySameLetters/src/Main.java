import java.util.*;

public class Main
{
    public static void main(String[] args)
    {

        Map<String,String> dictionary = new HashMap<String,String>();
        Scanner in = new Scanner(System.in);
        String[] seq = in.nextLine().split(", ");
        String[] temp;
        String tempSortedSeq;


        for(int i = 0; i < seq.length; i++)
        {
            temp = seq[i].split("");
            Arrays.sort(temp);
            tempSortedSeq = Arrays.toString(temp);
            if(!dictionary.containsKey(tempSortedSeq))
            {
                dictionary.put(tempSortedSeq, "");
            }
            dictionary.put(tempSortedSeq, dictionary.get(tempSortedSeq) + " " + seq[i]);
        }
        System.out.println(dictionary.toString());
    }
}