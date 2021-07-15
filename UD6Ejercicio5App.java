/**
 * @author Jose Luis Padilla Gonzalez
 * @version 08-07-2021
 */
import javax.swing.JOptionPane;

public class UD6Ejercicio5App {
	/**El metodo binario calculara el numero binario dividiendo el numero que reciba del metodo main entre dos y poniendo el resto de esa division en un String hasta que el numero acabe siendo menos que dos,
	 * despues devolvera un String con el resultado el cual sera el numero pedido pasado a binario.
	 */
	public static String binario(int num) {
		String numBinario="";
		while(num>=2) {
			numBinario=num%2+numBinario;
			num=num/2;
		}
		return 1+numBinario;
	}
	//El metodo main pedira un numero por teclado y se lo enviara a el metodo binario para pasar el numero a binario, una vez reciba una respuesta del metodo binario imprimira el resultado por pantalla.
	public static void main(String[] args) {
		String textoNum=JOptionPane.showInputDialog("Escribe un numero.");
		int num=Integer.parseInt(textoNum);
		JOptionPane.showMessageDialog(null,"El resultado es: " + binario(num));
	}

}
