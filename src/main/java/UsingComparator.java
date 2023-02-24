import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Checker implements Comparator<Player> {
    public int compare(Player p1, Player p2){
        if(p1.score>p2.score){
            return -1;
        }else if(p1.score<p2.score){
            return 1;
        }else{
            return p1.name.compareTo(p2.name);
        }
    }
}
class CheckerComparable implements Comparable<Player>{

    @Override
    public int compareTo(Player player) {
        return 0;
    }
}

class Player implements Comparable<Player>{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Player o) {
        return 0;
    }
}
class PlayerNot{
    String name;
    int score;

    PlayerNot(String name, int score){
        this.name = name;
        this.score = score;
    }

}

class UsingComparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        //PlayerNot[] playerNot = new PlayerNot[n];
        Checker checker = new Checker();
        //CheckerComparable checkerCom = new CheckerComparable();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
            //playerNot[i] = new PlayerNot(scan.next(), scan.nextInt());
        }
        scan.close();
        System.out.println("1." + player.toString());
        Arrays.sort(player);
        System.out.println("2." + player.toString());
        Arrays.stream(player).sorted();
        System.out.println("3." + player.toString());

        Arrays.sort(player);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }

    }
}