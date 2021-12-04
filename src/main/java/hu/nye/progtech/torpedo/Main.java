package hu.nye.progtech.torpedo;
import java.util.Scanner;
import java.util.Spliterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kerem add meg a neved a jatekhoz:\n");
        Scanner scanner = new Scanner(System.in);
        Player player = new Player(scanner.nextLine());
        System.out.println(player);
        var map = BattleMap.createMap();
        BattleMap.printMap(map);
        for(int i=1;i<=5;i++){
            Battleship battleship = new Battleship();
            for(int j=1; j<=1; j++){
                System.out.println("\nA 2 egyseg meretu hajo koordinatai (pl A1 B1)\n");
                var split = scanner.nextLine().split(" ");
                var firstCO = CoordinateParser(split[0]);
                var secondCO = CoordinateParser(split[1]);
                battleship.setX1(Integer.parseInt(String.valueOf(firstCO.charAt(0))));
                battleship.setY1(Integer.parseInt(String.valueOf(firstCO.charAt(1))));
                battleship.setX2(Integer.parseInt(String.valueOf(secondCO.charAt(0))));
                battleship.setY2(Integer.parseInt(String.valueOf(secondCO.charAt(1))));
                map[battleship.getY1()][battleship.getX1()] = "O";
                map[battleship.getY2()][battleship.getX2()] = "O";
            }
            BattleMap.printMap(map);
        }
    }
    public static String CoordinateParser(String CO){
        switch (CO.charAt(0)){
            case 'A' : {
                return new String("0" + CO.charAt(1));
            }
            case 'B' : {
                return new String("1" + CO.charAt(1));
            }
            case 'C' : {
                return new String("2" + CO.charAt(1));
            }
            case 'D' : {
                return new String("3" + CO.charAt(1));
            }
            case 'E' : {
                return new String("4" + CO.charAt(1));
            }
            case 'F' : {
                return new String("5" + CO.charAt(1));
            }
            case 'G' : {
                return new String("6" + CO.charAt(1));
            }
            case 'H' : {
                return new String("7" + CO.charAt(1));
            }
            case 'I' : {
                return new String("8" + CO.charAt(1));
            }
            case 'J' : {
                return new String("9" + CO.charAt(1));
            }
            default : {
                return "00";
            }
        }

    }

}
