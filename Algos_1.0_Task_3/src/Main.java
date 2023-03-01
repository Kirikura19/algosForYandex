import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static String[] changeFormat(String tempTargetPhone)
    {
        tempTargetPhone = tempTargetPhone.replaceAll("\\+7", "8");

        String[] tempTargetPhoneArr = tempTargetPhone.split("[()-]");

        String[] finalPhone = String.join("", tempTargetPhoneArr).split("");


        if(finalPhone.length != 11)
        {
            String[] finalPhoneChanged = new String[11];
            finalPhoneChanged[0] = "8";
            finalPhoneChanged[1] = "4";
            finalPhoneChanged[2] = "9";
            finalPhoneChanged[3] = "5";
            for(int i = 1; i <= finalPhone.length; i++)
            {
                finalPhoneChanged[3 + i] = finalPhone[i-1];
            }
            return finalPhoneChanged;
        }
        return finalPhone;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String targetPhone = in.nextLine();

        String[] targetPhoneArr = changeFormat(targetPhone);

        for(int i = 0; i < 3; i++)
        {
            String tempTargetPhone = in.nextLine();

            if(Arrays.equals(targetPhoneArr, changeFormat(tempTargetPhone)))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}