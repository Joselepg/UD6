/**
 * @author Jose Luis Padilla Gonzalez
 * @version 08-07-2021
 */
import javax.swing.JOptionPane;
public class UD6Ejercicio11App {
	//El metodo Mostrar recorrera los tres arrays posicion por posicion y los mostrara por pantalla.
	public static void  Mostrar(int num[],int num2[], int num3[]) {
		for (int i = 0; i < num.length; i++) {
			JOptionPane.showMessageDialog(null,"Posicion "+(i+1)+" Array1 = "+num[i]);
		}
		for (int i = 0; i < num.length; i++) {
			JOptionPane.showMessageDialog(null,"Posicion "+(i+1)+" Array2 = "+num2[i]);
		}
		for (int i = 0; i < num.length; i++) {
			JOptionPane.showMessageDialog(null,"Posicion "+(i+1)+" Array3 = "+num3[i]);
		}
	}
	/**El metodo Relleno recorrera el Array num y lo rellenara con numeros aleatorios del 0 al 100,
	 * despues tambien recorrera el Array num2 y lo rellenara con numeros de una posicion aleatoria dentro del Array num.
	 */
	public static void Relleno(int num[], int num2[], int numero) {
		for (int i = 0; i < num.length; i++) {
			int random = (int)Math.floor(Math.random()*((0+1)-(100+1))+(100));
			num[i]=random;
		}
		for (int i = 0; i < num2.length; i++) {
			int random = (int)Math.floor(Math.random()*((0+1)-(numero+1))+(numero));
			num2[i]=num[random];
		}
		}
	/**El metodo Multi recorrera los Array num y num2 y multiplicara los numeros de una misma posicion,
	 * despues el resultado de esa multiplicacion lo pondra en la misma posicion de la que probienen los dos numeros multiplicados.
	 * 
	 */
	public static void Multi(int num[], int num2[], int num3[]) {
		for (int i = 0; i < num2.length; i++) {
			num3[i]=num[i]*num2[i];
		}
	}
	/**El metodo main pedira un numero para indicar el tamaño de las Arrays 
	 * despues declarara las tres Arrays y ejecutara los metodos Relleno, Multi y Mostrar.
	 * 
	 */
	public static void main(String[] args) {

		String textoNumero=JOptionPane.showInputDialog("Escribe el tamaño del array.");
		int numero=Integer.parseInt(textoNumero);
		int num[]=new int[numero];
		int num2[]=new int[numero];
		int num3[]=new int[numero];
		Relleno(num,num2,numero);
		Multi(num,num2,num3);
		Mostrar(num,num2,num3);
		
	}

	}

