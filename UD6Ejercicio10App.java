/**
 * @author Jose Luis Padilla Gonzalez
 * @version 08-07-2021
 */
import javax.swing.JOptionPane;

public class UD6Ejercicio10App {
	//El metodo mostrar recorrera el array y nos mostrara las posiciones por pantalla.
	public static void  mostrar(int num[]) {
		for (int i = 0; i < num.length; i++) {
			JOptionPane.showMessageDialog(null,"Posicion "+(i+1)+" = "+num[i]);
		}
	}
	//El metodo Verificar comprueba que el numero que recibe como parametro es un numero primo.
	public static boolean Verificar(int random) {
		
		int contador = 2;
		while (contador < random) {
			if (random % contador == 0) {
				return false;
			} else {
				contador++;
			}
		}
		return true;
	}
	//El metodo Primero genera un numero aleatorio entre el int a, el inicio y el int b, el final del rango que deseamos.
	public static int Primo(int a, int b) {
		
		int random = (int)Math.floor(Math.random()*((a+1)-(b+1))+(b));
		
		return random;
	}
	/**El metodo relleno utiliza el metodo Verificar para comprobar que el numero random generado por el metodo Primo es un numero primo y si es asi añadirlo al array, si no es asi ejecuta un bucle hasta generar uno.
	 * Tambien nos indicara cual es el mayor numero primo en el array y lo imprimira por pantalla.
	 */
	public static void relleno(int num[], int a, int b) {
		boolean bucle;
		int random;
		int mayor=num[0];
		for (int i = 0; i < num.length; i++){
		    bucle = true;
		    while (bucle){
		        random = Primo(a, b);
		        if (Verificar(random) == true){
		            num[i]=random;
		            bucle = false;
		        }
		    }
		}
		for(int i=1;i<num.length;i++) {
			if (num[i]>mayor) {
				mayor=num[i];
			}
		}
		JOptionPane.showInternalMessageDialog(null,"El numero mas grande es: "+mayor);
	}
	//El metodo main preguntara por la informacion del tamaño del array y el rango de numeros que deseamos, despues ejecutara los metodos relleno y mostrar.
	public static void main(String[] args) {
		String textoNumero=JOptionPane.showInputDialog("Escribe el tamaño del array.");
		int numero=Integer.parseInt(textoNumero);
		numero=Integer.parseInt(textoNumero);
		String textoA=JOptionPane.showInputDialog("Escribe el inicio del rango deseado.");
		int a=Integer.parseInt(textoA);
		String textoB=JOptionPane.showInputDialog("Escribe el final del rango deseado.");
		int b=Integer.parseInt(textoB);
		int num[]=new int[numero];
		num=new int[numero];
		relleno(num,a,b);
		mostrar(num);
		
	}

}
