package hu.nye.progtech.torpedo;

public class BattleMap {

    public static void printMap(String[][] map){
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

    public static String[][] createMap() {
        String[][] first_map = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                first_map[i][j] = ".";
            }
        }
        return first_map;
    }

    public static boolean isEnoughSpaceForShip(){


        return true;
    }
}