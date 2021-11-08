package exercicios;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		double cc,cf,pd,i;
		System.out.println("Qual custo de fabrica do carro: ");
		cf= leia.nextDouble();
		i=0.45*cf;
		cc=(cf+i)/0.72;
		System.out.println("\nCusto ao consumidor: " + cc+ " reais");
		leia.close();

	}

}
