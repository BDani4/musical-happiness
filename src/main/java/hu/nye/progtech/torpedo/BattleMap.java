package hu.nye.progtech.torpedo;

public class BattleMap {

    public static int[][] EnemyMap = new int[10][10];
    public static int[][] PlayerMap = new int[10][10];

    public static void PlayerMap(String[][] map){
        System.out.print("  ");
        for(int i=0;i<10;i++){
            System.out.print(Character.toString((char)65 + i) + " ");
        }
        System.out.println("");
        for(int i=0;i<10;i++){
            System.out.print(i + " ");
            for(int j=0;j<10;j++){

                System.out.print(map[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void EnemyMap(String[][] map){
        System.out.print("  ");
        for(int i=0;i<10;i++){
            System.out.print(Character.toString((char)65 + i) + " ");
        }
        System.out.println("");
        for(int i=0;i<10;i++){
            System.out.print(i + " ");
            for(int j=0;j<10;j++){

                System.out.print(map[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static String[][] createPlayerMap() {
        String[][] first_map = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                first_map[i][j] = ".";
            }
        }
        return first_map;
    }

    public static String[][] createEnemyMap() {
        String[][] second_map = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                second_map[i][j] = ".";
            }
        }
        return second_map;
    }
}