/**
 * @author Jose Luis Padilla Gonzalez
 * @version 08-07-2021
 */
import javax.swing.JOptionPane;

public class UD6Ejercicio4App {
	//El metodo factorial calculara el factorial del numero recibido del metodo main.
	public static int factorial(int num) {
		int total=1;
		for (int i=1;i <= num; i++) {
			total=total*i;
		}
		return total;
	}
	//El metodo main pedira un numero y se lo enviara al metodo factorial, tras recibir una respuesta imprimira por pantalla el resultado del metodo factorial.
	public static void main(String[] args) {
		String textoNum=JOptionPane.showInputDialog("Escribe un numero.");
		int num=Integer.parseInt(textoNum);
		JOptionPane.showMessageDialog(null,"El resultado es: " + factorial(num));

	}

}
