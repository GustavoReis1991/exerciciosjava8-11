package exercicios;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		int a,b,c,resp;
		System.out.println("Quantos anos você tem?" + "\n Anos: ");
		a=leia.nextInt();
		System.out.println("\nMeses: ");
		b= leia.nextInt();
		System.out.println("\nDias: ");
		c= leia.nextInt();
		resp=a*365+b*12+c;
		System.out.println("\nVocê tem aproximadamente "+ resp + " dias de vida");
		leia.close();
	}

}
