/**
 * @author Jose Luis Padilla Gonzalez
 * @version 08-07-2021
 */
import javax.swing.JOptionPane;

public class UD6Ejercicio7App {
	//Declaramos las variables DOLAR, YEN y LIBRA con su valor equivalente a 1€.
	private static final double DOLAR=1.28611;
	private static final double YEN=129.852;
	private static final double LIBRA=0.86;
	/**El metodo camDivisa hara un calculo con una de las tres variables de divisa dependiendo de cual hemos pedido para el cambio(dolar, yen o libra) y nos imprimira una respuesta por pantalla con el resultado,
	 * nos saltara un error si no es una divisa compatible con el programa.
	 */
	public static void camDivisa(float euro, String divisa) {
		if(divisa.equals("Dolar")) {
			double total=euro*DOLAR;
			JOptionPane.showMessageDialog(null,euro+" € son "+total+" $.");
		} else if(divisa.equals("Yen")) {
			double total=euro*YEN;
			JOptionPane.showMessageDialog(null,euro+" € son "+total+" ¥.");
		} else if(divisa.equals("Libra")) {
			double total=euro*LIBRA;
			JOptionPane.showMessageDialog(null,euro+" € son "+total+" £.");
		} else {
			JOptionPane.showMessageDialog(null,"Error, recuerda poner la divisa con mayuscula inicial y en singular. Ej: Euro.");
		}
	}
	//En el metodo main pediremos por pantalla las variables que necesitaremos para ejecutar el metodo camDivisa, pediremos tanto el numero en euros como a que tipo de divisa queremos cambiar y despues ejecutara el metodo camDivisa.
	public static void main(String[] args) {
		String textoEuro=JOptionPane.showInputDialog("Escribe el numero en Euros.");
		float euro=Integer.parseInt(textoEuro);
		String divisa=JOptionPane.showInputDialog("¿A que divisa quieres pasar?");
		camDivisa(euro, divisa);
	}

}
