/**
 * @author Jose Luis Padilla Gonzalez
 * @version 08-07-2021
 */
import javax.swing.JOptionPane;

public class UD6Ejercicio3App {
	//El metodo primo comprobara si el numero que hemos dado es o no es un numero primo y devolvera un boolean para confirmalo.
	public static boolean primo(int num) {
		int contador = 2;
		boolean primo = true;
		while (contador < num) {
			if (num % contador == 0) {
				primo = false;
				return primo;
			} else {
				contador++;
			}
		}
		return primo;
	}
	//El metodo main pedira un numero para enviarselo al metodo primo, tras pasar por el metodo primo y recibir la respuesta de si es o no primo, respondera dependiendo de si el boolean es true o false.
	public static void main(String[] args) {
		String textoNum=JOptionPane.showInputDialog("Escribe un numero.");
		int num=Integer.parseInt(textoNum);
		if(primo(num)==true) {
			JOptionPane.showMessageDialog(null,"El "+num+" es primo.");
		}
		else if(primo(num)==false) {
			JOptionPane.showMessageDialog(null,"El "+num+" no es primo.");
		}
	}

}
