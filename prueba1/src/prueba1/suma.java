package prueba1;

import javax.swing.JOptionPane;

public class suma {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int suma = 0;
		
		String str = JOptionPane.showInputDialog("Introduzca el primer n�mero: ");
		num1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca el segundo n�mero: ");
		num2 = Integer.parseInt(str);
		
		suma = num1 + num2;
		
		System.out.println("La suma de los n�meros es: " + suma);
	}

}
