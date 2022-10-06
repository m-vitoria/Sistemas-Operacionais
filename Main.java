package SO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Frigideira fri = new Frigideira();
        PanelasBarro pan = new PanelasBarro();

        System.out.print("Enter the number of frying pan: ");
        fri.setFri(sc.nextInt());
        System.out.println();
        System.out.print("Enter the number of clay pot: ");
        pan.setPan(sc.nextInt());
        System.out.println();
    
        System.out.println(fri.toString());
        System.out.println(pan.toString());
        sc.close();
    }


}

