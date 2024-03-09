import java.util.Scanner;
public class EX2 {
	public static void main(String[] args) {
		        Scanner l = new Scanner(System.in);
		        int[] tableau = new int[10];
		        System.out.println("Veuillez entrer 10 éléments pour le tableau :");
		        for (int i = 0; i < tableau.length; i++) {
		            System.out.print("Élément " + (i + 1) + ": ");
		            tableau[i] = l.nextInt();
		        }
		        System.out.println("Éléments du tableau :");
		        for (int i = 0; i <10; i++) {
		            System.out.println("Élément " + (i + 1) + ": " + tableau[i]);
		        }
		        l.close();
	}
	}
