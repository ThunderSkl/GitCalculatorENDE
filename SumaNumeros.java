package package3;

import java.util.Scanner;

public class SumaNumeros {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca un número:");
		int num1=sc.nextInt();
		System.out.println("Introduce otro número:");
		int num2=sc.nextInt();
		
		int num=num1+num2;
		
		System.out.println("El la suma de los dos numeros es: "+num);
		sc.close();
	}

}
