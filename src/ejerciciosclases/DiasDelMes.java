package ejerciciosclases;

import java.util.Scanner;

public class DiasDelMes {
	public static void main(String[] args) {

		/* int numeroMes = 5;
		   int anio = 1990;   */
		
		int numeroMes = 0;
		int anio= 0;
		
		//Le pido al usuario que ingrese valores por teclado
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un mes del año del 1 al 12:"); 
		numeroMes = scanner.nextInt();
		
		System.out.println("Ingrese un año:"); 
		anio = scanner.nextInt();
		
		//Meses que tienen 30 dìas-> 11-4-6-9
		if (numeroMes == 11  || numeroMes == 4  || numeroMes == 6  || numeroMes == 9 ) { //OR o || Solo basta con que una comparacion sea true
			System.out.println("El mes tiene 30 dias");
		//Meses que tiene 31 dias-> 1-3-5-8-10-12-7
		} else if (numeroMes == 1  || numeroMes == 3  || numeroMes == 5  || numeroMes == 8 || numeroMes == 10 || numeroMes == 12 || numeroMes == 7) { //OR o || Solo basta con que una comparacion sea true
			System.out.println("El mes tiene 31 dias");
		//Año bisiesto
		} else if (anio % 400 == 0 || (anio % 4 == 0 && !(anio % 100 == 0))) {
			System.out.println("El mes tiene 29 dias");
		} else {
			System.out.println("El mes tiene 28 dias");
		}
			
	}
}


//poner 12 opciones o doce case y que devuelva el mes en string