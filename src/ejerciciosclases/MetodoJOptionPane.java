package ejerciciosclases;

import javax.swing.JOptionPane;

public class MetodoJOptionPane {
	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre:");
		String apellido = "Verduguez";

		int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad:"));
		
		//Mensaje que se imprime por pantalla
		JOptionPane.showMessageDialog(null, nombre + " " + apellido + " " + edad);
		
	}

}


