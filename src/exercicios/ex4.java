package exercicios;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		double d,r,s;
		Scanner leia = new Scanner(System.in);
		System.out.println("A: ");
		a=leia.nextInt();
		System.out.println("\nB: ");
		b=leia.nextInt();
		System.out.println("\nC: ");
		c=leia.nextInt();
		r= Math.pow((a+b), 2);
		s= Math.pow((b+c), 2);
		d=(r+s)/2;
		System.out.println("\nD= " + d);
		leia.close();

	}

}
