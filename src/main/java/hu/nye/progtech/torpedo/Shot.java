package hu.nye.progtech.torpedo;
import java.util.Scanner;
import static hu.nye.progtech.torpedo.BattleMap.EnemyMap;
import static hu.nye.progtech.torpedo.BattleMap.PlayerMap;
import static hu.nye.progtech.torpedo.Game.*;

public class Shot {

    private static String Turn= "Player";
    public static int EnemyShips = 5;
    public static int PlayerShips = 5;
    private static int setX1(int parseIntX) {
        return parseIntX;
    }
    private static int setY1(int parseIntY) {
        return parseIntY;
    }

    public static void shot() {
        Scanner SX = new Scanner(System.in);
            Player Player = new Player(SX.nextLine());
        var split = SX.nextLine().split(" ");
        var SO = CoordinateParser(split[0]);
        int parseIntX = Integer.parseInt(String.valueOf(SO.charAt(0)));
        int parseIntY = Integer.parseInt(String.valueOf(SO.charAt(1)));
        int shotX = setX1(parseIntX);
        int shotY = setY1(parseIntY);
        Shot.setX1(parseIntX);
        Shot.setY1(parseIntY);

        if (Turn.equals("Player")) {
            if (EnemyMap[shotX][shotY] == 'O') {
                System.out.println("Talalat! Ujra lohetsz");
                EnemyMap[shotX][shotY] = 'X';
                EnemyShips--;
            } else if (EnemyMap[shotX][shotY] == 'X') {
                System.out.println("Ide mar lottel!");
                Turn = "Enemy";
            } else if (EnemyMap[shotX][shotY] == '.') {
                System.out.println("Nem talalt!");
                Turn = "Enemy";
            } else {
                if (PlayerMap[shotX][shotY] == 'O') {
                    System.out.println("Talalat! Ujra lohetsz");
                    PlayerMap[shotX][shotY] = 'X';
                    PlayerShips--;
                } else if (PlayerMap[shotX][shotY] == 'X') {
                    System.out.println("Ide mar lottel!");
                    Turn = "Player";
                } else if (PlayerMap[shotX][shotY] == '.') {
                    System.out.println("Nem talalt");
                    Turn = "Player";
                }
            }
        }

    }
}