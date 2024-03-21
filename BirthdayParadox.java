import java.util.Scanner;

public class BirthdayParadox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of guests: ");
        int n = scan.nextInt();

        double probabilityNoSharedBirthday = 1.0;

        for (int i = 1; i <= n; i++) {
            probabilityNoSharedBirthday *= (365.0 - i + 1) / 365.0;
        }

        double probabilitySharedBirthday = 1 - probabilityNoSharedBirthday;

        System.out.println("Probability that none share a birthday: " + probabilityNoSharedBirthday);
        System.out.println("Probability that at least two share a birthday: " + probabilitySharedBirthday);

        if (probabilityNoSharedBirthday < 0.5) {
            int guestsFor50PercentChance = 1;
            double cumulativeProbability = 1;
            while (cumulativeProbability >= 0.5) {
                cumulativeProbability *= (365.0 - guestsFor50PercentChance) / 365.0;
                guestsFor50PercentChance++;
            }
            System.out.println("Number of guests for >50% chance of no shared birthday: " + guestsFor50PercentChance);
        } else 
            System.out.println("The provided number of guests already gives more than a 50% chance of no shared birthday.");

    }
}
