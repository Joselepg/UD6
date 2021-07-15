/**
 * @author Jose Luis Padilla Gonzalez
 * @version 08-07-2021
 */
import javax.swing.JOptionPane;

public class UD6Ejercicio2App {
	//El metodo numRandom nos generara un numero random dentro del rango que hemos proporcionado y lo devolvera.
	public static int numRandom(int num1,int num2) {
		return (int)Math.floor(Math.random()*(num1-(num2+1))+(num2));
	}
	//El metodo main nos pedira cuantos numeros queremos y el rango de numeros que abarcara la respuesta, despues pedira al metodo numRandom numeros aleatorios dentro del rango hasta cumplir las veces que hemos especificado.
	public static void main(String[] args) {
		String textoTimes=JOptionPane.showInputDialog("Indica cuantos numeros quieres.");
		int times=Integer.parseInt(textoTimes);
		String textoA=JOptionPane.showInputDialog("Indica el numero inicial.");
		int a=Integer.parseInt(textoA);
		String textoB=JOptionPane.showInputDialog("Indica el numero final.");
		int b=Integer.parseInt(textoB);
		for (int i = 0; i < times; i++) {
			JOptionPane.showMessageDialog(null,"Numero: " + numRandom(a,b));
		}
		
	}

}
