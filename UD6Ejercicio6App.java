/**
 * @author Jose Luis Padilla Gonzalez
 * @version 08-07-2021
 */
import javax.swing.JOptionPane;

public class UD6Ejercicio6App {
	//El metodo cifra leera la longitud de caracteres que tiene el numero que recibira del metodo main y le devolvera el resultado.
	public static int cifra(String textoNum) {
		return textoNum.length();
	}
	//El metodo main pedira un numero por teclado y se lo enviara al metodo cifra, tras recibir una respuesta la imprimira por pantalla.
	public static void main(String[] args) {

		String textoNum=JOptionPane.showInputDialog("Escribe un numero.");
		JOptionPane.showMessageDialog(null,"El numero: "+textoNum+" tienes " + cifra(textoNum)+" cifras.");
	}

}
