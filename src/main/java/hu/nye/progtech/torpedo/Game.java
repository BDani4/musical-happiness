package hu.nye.progtech.torpedo;
import java.util.Scanner;
public class Game {

    public static String[][] mapPlayer = BattleMap.createPlayerMap();
    public static String[][] mapEnemy = BattleMap.createEnemyMap();

    public static void game() {
        System.out.println("Kerem add meg a neved a jatekhoz:\n");
        Scanner scannerPlayer = new Scanner(System.in);
        Player Player = new Player(scannerPlayer.nextLine());
        System.out.println(Player);
        BattleMap.PlayerMap(mapPlayer);
        for (int i = 1; i <= 5; i++) {
            Battleship battleship = new Battleship();
            for (int j = 1; j <= 1; j++) {
                System.out.println("A hajo koordinataja: (pl: D3)\n");
                var split = scannerPlayer.nextLine().split(" ");
                var CO = CoordinateParser(split[0]);
                battleship.setX1(Integer.parseInt(String.valueOf(CO.charAt(0))));
                battleship.setY1(Integer.parseInt(String.valueOf(CO.charAt(1))));
                mapPlayer[battleship.getY1()][battleship.getX1()] = "O";
            }
            BattleMap.PlayerMap(mapPlayer);
        }

        System.out.println("Kerem adja meg a nevet a 2. jatekos:\n");
        Scanner scannerEnemy = new Scanner(System.in);
        Player Enemy = new Player(scannerEnemy.nextLine());
        System.out.println(Enemy);
        BattleMap.EnemyMap(mapEnemy);
        for (int i = 1; i <= 5; i++) {
            Battleship battleship = new Battleship();
            for (int j = 1; j <= 1; j++) {
                System.out.println("A hajo koordinataja: (pl: D3)\n");
                var split = scannerEnemy.nextLine().split(" ");
                var CO = CoordinateParser(split[0]);
                battleship.setX1(Integer.parseInt(String.valueOf(CO.charAt(0))));
                battleship.setY1(Integer.parseInt(String.valueOf(CO.charAt(1))));
                mapEnemy[battleship.getY1()][battleship.getX1()] = "O";
            }
            BattleMap.EnemyMap(mapEnemy);
        }
        System.out.println("A mapok a felhelyezett hajokkal:");
        BattleMap.PlayerMap(mapPlayer);
        System.out.println("- - - - - - - - - - - - -");
        BattleMap.EnemyMap(mapEnemy);
        while(Shot.EnemyShips > 0 || Shot.PlayerShips > 0) {
            System.out.println("\n" + Player + " kovetkezik:\n");
            System.out.println("A lovedek koordinataja: (pl: D3)\n");
            Shot.shot();
            BattleMap.EnemyMap(mapEnemy);
            System.out.println("\n" + Enemy + " kovetkezik:\n");
            System.out.println("A lovedek koordinataja: (pl: D3)\n");
            Shot.shot();
            BattleMap.EnemyMap(mapPlayer);

        }
    }

    public static String CoordinateParser(String CO) {
        switch (CO.charAt(0)) {
            case 'A': {
                return new String("0" + CO.charAt(1));
            }
            case 'B': {
                return new String("1" + CO.charAt(1));
            }
            case 'C': {
                return new String("2" + CO.charAt(1));
            }
            case 'D': {
                return new String("3" + CO.charAt(1));
            }
            case 'E': {
                return new String("4" + CO.charAt(1));
            }
            case 'F': {
                return new String("5" + CO.charAt(1));
            }
            case 'G': {
                return new String("6" + CO.charAt(1));
            }
            case 'H': {
                return new String("7" + CO.charAt(1));
            }
            case 'I': {
                return new String("8" + CO.charAt(1));
            }
            case 'J': {
                return new String("9" + CO.charAt(1));
            }
            default: {
                return "00";
            }
        }
    }
}
