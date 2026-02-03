package PracticaGitHub;

import java.util.Scanner;

public class PracticaGit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cómo estás? ");
        String opcion = sc.nextLine();

        System.out.println("Usted está: "+opcion);

        //Modificado en GitHub
        System.out.printl("¿Está seguro que se siente bien?");
        String opcion2 = sc.nextLine().toLowerCase;

        if (opcion2.equals("si")) {
            System.out.println("Usted no está bien");
        } else {
            System.out.println("Gracias por no mentir");
        }

        
        
    }
}
