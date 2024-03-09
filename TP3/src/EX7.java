import java.util.Arrays;
		import java.util.Scanner;
public class EX7 {
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
		        int somme = 0;
		        for (int element : tableau) {
		            somme += element;
		        }
		        double moyenne = (double) somme / taille;
		        int[] tableauCopie = Arrays.copyOf(tableau, taille);
		        System.out.println("Tableau copié (T2) : " + Arrays.toString(tableauCopie));
		        Arrays.sort(tableau);
		        System.out.println("Somme des éléments : " + somme);
		        System.out.println("Moyenne des éléments : " + moyenne);
		        System.out.println("Tableau trié dans l'ordre croissant : " + Arrays.toString(tableau));
		        l.close();
		    }
}
