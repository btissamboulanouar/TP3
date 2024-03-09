import java.util.Scanner;
public class EX6 {
	public static void main(String[] args) {
		        Scanner l = new Scanner(System.in);
		        System.out.print("Veuillez entrer la taille du tableau : ");
		        int taille = l.nextInt();
		        int[] tableau = new int[taille];
		        System.out.println("Veuillez entrer les valeurs pour le tableau :");
		        for (int i = 0; i < taille; i++) {
		            System.out.print("Élément " + (i + 1) + ": ");
		            tableau[i] = l.nextInt();
		        }
		        System.out.println("Tableau initial :");
		        for (int i = 0; i < taille; i++) {
		            System.out.println("Élément " + (i + 1) + ": " + tableau[i]);
		        }
		        int[] tableauPositives = new int[taille];
		        int[] tableauNegatives = new int[taille];
		        int indexPositives = 0, indexNegatives = 0;
		        for (int i = 0; i < taille; i++) {
		            if (tableau[i] > 0) {
		                tableauPositives[indexPositives++] = tableau[i];
		            } else if (tableau[i] < 0) {
		                tableauNegatives[indexNegatives++] = tableau[i];
		            }
		        }
		        System.out.println("Tableau des composantes positives (TP) :");
		        afficherTableau(tableauPositives, indexPositives);
		        System.out.println("Tableau des valeurs négatives (TN) :");
		        afficherTableau(tableauNegatives, indexNegatives);
		        l.close();
		    }
		    private static void afficherTableau(int[] tableau, int tailleEffective) {
		        for (int i = 0; i < tailleEffective; i++) {
		            System.out.println(tableau[i]);
		        }
		    }
		}
