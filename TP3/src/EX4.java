import java.util.Scanner;

public class EX4 {
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
		        System.out.println("Tableau initial :");
		        for (int i = 0; i < tableau.length; i++) {
		            System.out.println("Élément " + (i + 1) + ": " + tableau[i]);
		        }
		        int nouvelleTaille = 0;

		        for (int i = 0; i < tableau.length; i++) {
		            if (tableau[i] != 5) {
		                tableau[nouvelleTaille] = tableau[i];
		                nouvelleTaille++;
		            }
		        }
		        System.out.println("Tableau après suppression des occurrences de 5 :");
		        for (int i = 0; i < nouvelleTaille; i++) {
		            System.out.println("Élément " + (i + 1) + ": " + tableau[i]);
		        }
		        l.close();
		    }
		}
