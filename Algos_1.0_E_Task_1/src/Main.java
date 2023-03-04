import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int apartNew = in.nextInt(); // новый номер квартиры
        int flourAll = in.nextInt(); // этажей всего
        int apartOld = in.nextInt(); // старый номер квартиры
        int podOld = in.nextInt(); // старый номер подъезда
        int flourOld = in.nextInt(); // старый номер этажа

        89 20 41 1 11


        int flourNew = 0;
        int podNew = 0;
        int flours = 0;
        int curPod = 1;

        while(41 > 11*flours)
            flours++;
        if(apartNew > curPod * flourAll * flours)
            curPod++;






        if(flourAll == 1)
            podNew = 0;
        if(flourOld == 1 && podNew == 1)
            flourOld = 0;
        if(apartOld < flourOld * podOld)
            System.out.println("-1 -1");







    }
}