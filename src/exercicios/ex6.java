package exercicios;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		double x1,x2,y1,y2,d,a,b,c;
		System.out.println("x1: ");
		x1=leia.nextDouble();
		System.out.println("y1: ");
		y1=leia.nextDouble();
		System.out.println("x2: ");
		x2=leia.nextDouble();
		System.out.println("y2: ");
		y2=leia.nextDouble();
		a= Math.pow((x2-x1), 2);
		b=Math.pow((y2-y1), 2);
		c=a+b;
		d= Math.sqrt(c);
		System.out.println("\nDistância: " + d);
		leia.close();

	}

}
