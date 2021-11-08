package exercicios;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		double a,b,c,m;
		System.out.println("Nota 1= ");
		a=leia.nextDouble();
		System.out.println("\nNota 2= ");
		b=leia.nextDouble();
		System.out.println("\nNota 3= ");
		c=leia.nextDouble();
		m=(a*2+b*3+c*5)/10;
		System.out.println("\nMedia= "+ m);
		leia.close();

	}

}
