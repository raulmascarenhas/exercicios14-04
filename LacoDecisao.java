package LacosCondicionais;

import java.util.Scanner;

public class LacoDecisao {

	public static void main(String[] args) {

		float v1,v2,v3,result;
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n digite o valor de A ");
		v1 = ler.nextFloat();
		System.out.println("\n digite o valor de B ");
		v2 = ler.nextFloat();
		System.out.println("\n digite o valor de c ");
		v3 = ler.nextFloat();
		
		result = v1 + v2 ;
		System.out.printf("\n a soma é: ",result);
		
		if(result> v3) {
			System.out.println("\n a soma de v1 + v2 é maior que v3 ");
				
			}
		else if(result< v3) {
			System.out.println("\n a soma de v1 + v2 é menor que v3 ");	
			}
		else if (result == v3) {
			System.out.println("\n a soma de v1 +v2 é igual a v3 ");
		}
			
		}
		
}