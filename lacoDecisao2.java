package LacosCondicionais;

import java.util.Scanner;

public class lacoDecisao2 {

	public static void main(String[] args) {

		int v;
				
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n digite um número ");
		v = ler.nextInt();
		
		if (v % 2 ==0 && v >=0) {
			System.out.println("O numero é par e positivo");
		} else if (v > 0 && v % 2!=0) {
			System.out.println("O número é impar e positivo");
		} else if (v < 0 && v % 2==0) {
			System.out.println("O número é par e negativo");
		} else { 
			System.out.println("O número é impar e negativo");
			
	}
}
}	