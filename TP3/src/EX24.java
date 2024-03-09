import java.util.Scanner;
public class EX24 {
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
		        int plusGrandEcart = 0;
		        for (int i = 0; i < taille - 1; i++) {
		            for (int j = i + 1; j < taille; j++) {
		                int ecart = Math.abs(tableau[i] - tableau[j]);
		                if (ecart > plusGrandEcart) {
		                    plusGrandEcart = ecart;
		                }
		            }
		        }
		        System.out.println("Le plus grand écart dans le tableau est : " + plusGrandEcart);
		        l.close();
	}
}
