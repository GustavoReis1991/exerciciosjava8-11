package exercicios;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int anos,a,a1,b,b1,c;
		System.out.println("Qual a sua idade em dias: ");
		anos=leia.nextInt();
		a=anos/365;
		a1=anos%365;
		b=a1/12;
		b1=a1%12;
		c=b1;
		System.out.println("\nVocê tem: "+a+" anos "+ b +" meses " + c +" dias de vida");
		leia.close();

	}

}
