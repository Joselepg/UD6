/**
 * @author Jose Luis Padilla Gonzalez
 * @version 08-07-2021
 */
import javax.swing.JOptionPane;

public class UD6Ejercicio8App {

	//En el metodo mostrar recorreremos la array y la mostraremos por pantalla.
	public static void  mostrar(int num[]) {
		for (int i = 0; i < num.length; i++) {
			JOptionPane.showMessageDialog(null,"Posicion "+(i+1)+" = "+num[i]);
		}
	}
	//En el metodo relleno preguntaremos por pantalla el numero que queremos añadir y lo añadiremos en orden hasta que cumpla todas las posiciones que tiene el array.
	public static void relleno(int num[]) {
		for (int i = 0; i < num.length; i++) {
			String textoNumero=JOptionPane.showInputDialog("Escribe el numero que quieres poner.");
			num[i]=Integer.parseInt(textoNumero);
		}
	}
	//En el metodo main declararemos la array de 10 posiciones y ejecutaremos los metodos relleno y mostrar.
	public static void main(String[] args) {
		
		int num[]=new int[10];
		relleno(num);
		mostrar(num);
		
	}

}
