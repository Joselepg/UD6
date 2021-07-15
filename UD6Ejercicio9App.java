/**
 * @author Jose Luis Padilla Gonzalez
 * @version 08-07-2021
 */
import javax.swing.JOptionPane;

public class UD6Ejercicio9App {

	//El metodo mostrar recorrera la array e imprimira por pantalla la posicion y su numero asignado, despues mostrara por pantalla la suma de todos los numeros.
	public static void  mostrar(int num[]) {
		int suma=0;
		for (int i = 0; i < num.length; i++) {
			suma+=num[i];
			JOptionPane.showMessageDialog(null,"Posicion "+(i+1)+" = "+num[i]);
		}
		JOptionPane.showMessageDialog(null,"La suma total es: "+suma);
	}
	//En el metodo relleno rellenaremos todas las posiciones del array con numeros aleatorios entre 0 y 9.
	public static void relleno(int num[]) {
		for (int i = 0; i < num.length; i++) {
			int random = (int)Math.floor(Math.random()*((0+1)-(9+1))+(9));
			num[i]=random;
		}
		}
	//En el metodo main preguntaremos por el tamaño que deseamos y crearemos un array con ese numero como tamaño, despues ejecutaremos los metodos relleno y mostrar.
	public static void main(String[] args) {

		String textoNumero=JOptionPane.showInputDialog("Escribe el tamaño del array.");
		int numero=Integer.parseInt(textoNumero);
		int num[]=new int[numero];
		relleno(num);
		mostrar(num);
		
	}
}
