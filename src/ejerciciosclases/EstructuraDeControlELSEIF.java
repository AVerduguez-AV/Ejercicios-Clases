package ejerciciosclases;

public class EstructuraDeControlELSEIF {

	public static void main(String[] args) {
		//Creo una variable float para utilizar numeros decimales
		float promedio = 6.5f;
		
		//CONDICIONAL IF ANIDADOS 
		if(promedio > 6){ 
			System.out.println("Excelente promedio!");
		}else if (promedio > 5.5) {  
			System.out.println("Promedio bueno!");
		}else if (promedio > 5.0) {  
			System.out.println("Promedio regular!");
		}else {
			System.out.println("Promedio malo!");
		}

	}

}
