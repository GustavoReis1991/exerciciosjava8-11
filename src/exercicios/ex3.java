package exercicios;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int tempo,x,y,x1,y1,z;
		System.out.println("Duração do evento em segundos: ");
		tempo= leia.nextInt();
		x=tempo/3600;
		x1=tempo%3600;
		y=x1/60;
		y1=x1%60;
		z=y1;
		System.out.println("\nDuração: "+ x+" horas "+ y +" minutos "+ z +" segundos");
		leia.close();
	}

}
