package Git;

import java.util.Scanner;

public class Test {
	 public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	     Calculatrice calc = new Calculatrice();

	     System.out.println("Bienvenue dans la calculatrice Java !");
	     System.out.print("Entrez le premier nombre : ");
	     double num1 = scanner.nextDouble();

	     System.out.print("Entrez l'opérateur (+, -, *, /) : ");
	     char operateur = scanner.next().charAt(0);

	     System.out.print("Entrez le deuxième nombre : ");
	     double num2 = scanner.nextDouble();

	     double resultat;
	     try {
	         switch (operateur) {
	             case '+':
	                 resultat = calc.addition(num1, num2);
	                 break;
	             case '-':
	                 resultat = calc.soustraction(num1, num2);
	                 break;
	             case '*':
	                 resultat = calc.multiplication(num1, num2);
	                 break;
	             case '/':
	                 resultat = calc.division(num1, num2);
	                 break;
	             default:
	                 System.out.println("Opérateur non valide !");
	                 return;
	         }
	         System.out.println("Résultat : " + resultat);
	     } catch (ArithmeticException e) {
	         System.out.println(e.getMessage());
	     }
	 }
	}

