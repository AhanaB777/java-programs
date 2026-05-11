import java.util.Scanner;

/*cricket academy records players name, runs:
Program to find:
    1. Highest Score
    2. Avg runs
    3. Sort players by Score
    4. Search players

*/
class B {
    Scanner sc = new Scanner(System.in);

    void dispPl(String pl[]) {
        System.out.println("Players are: ");
        for (int i = 0; i < pl.length; i++) {
            System.out.print(pl[i] + " ");
        }
        System.out.println();
    }

    void dispRuns(int runs[]) {
        System.out.println("Runs of players are: ");
        for (int i = 0; i < runs.length; i++) {
            System.out.print(runs[i] + " ");
        }
        System.out.println();
    }

    String[] getInputPlayers() {
        // Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of players: ");
        n = sc.nextInt();
        String[] pl = new String[n];
        System.out.println("Enter player names: ");
        for (int i = 0; i < n; i++) {
            pl[i] = sc.next();
        }
        return pl;
    }

    int[] getInputRuns(int n) {
        // Scanner sc = new Scanner(System.in);
        int[] runs = new int[n];
        System.out.println("Enter scores of " + n + " players: ");
        for (int j = 0; j < n; j++) {
            runs[j] = sc.nextInt();
        }
        return runs;
    }

    int getMaxRuns(int runs[]) {
        int maxRun = runs[0];
        for (int i = 1; i < runs.length; i++) {
            if (runs[i] > maxRun) {
                maxRun = runs[i];
            }
        }
        return maxRun;
    }

    float getAvgRuns(int runs[]) {
        float a;
        int s = 0;
        for (int i = 0; i < runs.length; i++) {
            s += runs[i];
        }
        a = (float) s / runs.length;
        return a;
    }

    void sortPlayersByScore(String players[], int runs[]) {
        for (int i = 0; i < players.length - 1; i++) {
            for (int j = 0; j < players.length - 1 - i; j++) {
                if (runs[j] < runs[j + 1]) {
                    int temp = runs[j];
                    runs[j] = runs[j + 1];
                    runs[j + 1] = temp;

                    String pl = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = pl;
                }
            }
        }
        System.out.println("The players ranked by scores are: ");
        for (int i = 0; i < players.length; i++) {
            System.out.print(players[i] + " ");
        }
        System.out.println();
    }

    void SearchPlayer(String players[]) {
        // Scanner sc = new Scanner(System.in);
        String pl;
        System.out.println("Enter player name: ");
        pl = sc.next();
        for (int i = 0; i < players.length; i++) {
            if (players[i].equals(pl)) {
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not found");

    }

}

public class cricket {
    public static void main(String[] args) {

        String[] players;
        int[] runs;

        B obj = new B();

        players = obj.getInputPlayers();
        obj.dispPl(players);

        int num = players.length;
        runs = obj.getInputRuns(num);
        obj.dispRuns(runs);

        int m;
        m = obj.getMaxRuns(runs);
        System.out.println("Maximum runs: " + m);

        float avg;
        avg = obj.getAvgRuns(runs);
        System.out.println("Average Runs: " + avg);

        obj.sortPlayersByScore(players, runs);

        obj.SearchPlayer(players);

    }

}
