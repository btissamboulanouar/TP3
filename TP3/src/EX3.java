import java.util.Scanner;

public class EX3 {
	public static void main(String[] args) {
		        Scanner l = new Scanner(System.in);
		        int taille;
		        do {
		            System.out.print("Veuillez entrer la taille du tableau (entre 10 et 50) : ");
		            taille = l.nextInt();
		        } while (taille < 10 || taille > 50);
		        int[] tableau = new int[taille];
		        System.out.println("Veuillez entrer les valeurs pour le tableau :");
		        for (int i = 0; i < tableau.length; i++) {
		            System.out.print("Élément " + (i + 1) + ": ");
		            tableau[i] = l.nextInt();
		        }
		        System.out.println("Éléments du tableau :");
		        for (int i = 0; i < tableau.length; i++) {
		            System.out.println("Élément " + (i + 1) + ": " + tableau[i]);
		        }
		        l.close();
	}
}
