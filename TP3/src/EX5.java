import java.util.Scanner;
public class EX5 {
	public static void main(String[] args) {
		        Scanner l = new Scanner(System.in);
		        System.out.print("Veuillez entrer la taille du tableau : ");
		        int taille = l.nextInt();
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
		        for (int i = 0; i < taille / 2; i++) {
		            int temp = tableau[i];
		            tableau[i] = tableau[taille - 1 - i];
		            tableau[taille - 1 - i] = temp;
		        }
		        System.out.println("Tableau après inversion de l'ordre des éléments :");
		        for (int i = 0; i < tableau.length; i++) {
		            System.out.println("Élément " + (i + 1) + ": " + tableau[i]);
		        }
		        l.close();
		    }
	}
