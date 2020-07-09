import java.util.*;

public class Java1DArrayGame {

    public static boolean canWin(int leap, int[] game) {
        return findForCurrentPostionUsingDFS(0, leap, game);
    }

    private static boolean findForCurrentPostionUsingDFS(int currIndex, int leap, int[] game) {
        if (currIndex == game.length-1) {
            return true;
        }
        if (currIndex+leap >= game.length) {
            return true;
        }
        List<Integer> connectedIndexes = new ArrayList<>();
        if (game[currIndex+1] == 0) {
            connectedIndexes.add(currIndex+1);
        }
        if (game[currIndex+leap] == 0) {
            connectedIndexes.add(currIndex+leap);
        }
        if (currIndex-1 >= 0 && game[currIndex-1] == 0) {
            connectedIndexes.add(currIndex-1);
        }

        boolean canTraverse = false;
        for (int i = 0; i<connectedIndexes.size(); i++) {
            return canTraverse || findForCurrentPostionUsingDFS(connectedIndexes.get(i), leap, game);
        }
        return canTraverse;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}