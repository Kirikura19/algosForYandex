import java.util.ArrayList;
import java.util.List;

public class Main {
    static String[] makeWordSequenceArr(String wordSequence)
    {
        String[] wordSequenceArr = wordSequence.split(" ");
        return wordSequenceArr;
    }
    static int findMin(String[] wordSequenceArr)
    {
        int len = wordSequenceArr[0].split("").length;
        for(int i = 0; i < wordSequenceArr.length; i++)
        {
            if (wordSequenceArr[i].split("").length < len)
            {
                len = wordSequenceArr[i].split("").length;
            }
        }
        return len;
    }
    static List<String> findWordByLen(int len, String[] wordSequenceArr)
    {
        List<String> answer = new ArrayList<>();
        for(int i = 0; i < wordSequenceArr.length; i++)
        {
            if (wordSequenceArr[i].split("").length == len)
            {
                answer.add(wordSequenceArr[i]);
            }
        }
        return answer;
    }
    public static void main(String[] args)
    {
        String wordSequence = "Lorem ipsum dolor sit amet, " +
                "consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                "nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo " +
                "consequat. Duis aute irure dolor in reprehenderit in voluptate velit " +
                "esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat " +
                "cupidatat non proident, sunt in culpa qui officia deserunt mollit anim " +
                "id est laborum.";
        List<String> answer = findWordByLen((findMin(makeWordSequenceArr(wordSequence))), makeWordSequenceArr(wordSequence));

        System.out.println(answer.toString());
    }
}