package exercicios;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		double a,b,c,d,e,f,x,y;
		System.out.println("a: ");
		a=leia.nextDouble();
		System.out.println("b: ");
		b=leia.nextDouble();
		System.out.println("c: ");
		c=leia.nextDouble();
		System.out.println("d: ");
		d=leia.nextDouble();
		System.out.println("e: ");
		e=leia.nextDouble();
		System.out.println("f: ");
		f=leia.nextDouble();
		x=(c*e-b*f)/(a*e-b*d);
		y=(a*f-c*d)/(a*e-b*d);
		System.out.println("\nx= "+ x+ "y= "+ y);
		leia.close();

	}

}
