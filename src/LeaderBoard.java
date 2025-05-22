import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public  class LeaderBoard {
    public static void main(String[] args) {
        List<Integer> ranked = new ArrayList<>();
        ranked.add(100);
        ranked.add(100);
        ranked.add(50);
        ranked.add(40);
        ranked.add(40);
        ranked.add(20);
        ranked.add(10);
        List<Integer> player = new ArrayList<>();
        player.add(5);
        player.add(25);
        player.add(50);
        player.add(120);

        List<Integer> result = FindRank(ranked , player);
        System.out.println(result);
    }

    public static List<Integer> FindRank(List<Integer> ranked , List<Integer> player) {
        Set<Integer> uniqueRankSet = new LinkedHashSet<>(ranked);
        List<Integer> uniqueRank = new ArrayList<>(uniqueRankSet);
        List<Integer> playerRank = new ArrayList<>();

        int leaderBoard = uniqueRank.size() - 1;
        for(int score : player) {
            while (leaderBoard >= 0 && score >= uniqueRank.get(leaderBoard)) {
                leaderBoard--;
            }
            playerRank.add(leaderBoard + 2);
        }
    return  playerRank;
    }
}


