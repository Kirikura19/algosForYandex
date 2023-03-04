import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double K = scanner.nextDouble();
        double M = scanner.nextDouble();

        int blanksCount = (int) (N / K);
        int detailsCount = (int) (blanksCount * (K / M));
        int remainingSpillage = (int) (N - blanksCount * K);

        while (remainingSpillage >= K - M && remainingSpillage >= K) {
            blanksCount++;
            remainingSpillage -= (int) (K - M);
            detailsCount += (int) (K / M);
        }

        System.out.println("Количество полученных деталей: " + detailsCount);
    }
}