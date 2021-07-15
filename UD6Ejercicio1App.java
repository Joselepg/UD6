/**
 * @author Jose Luis Padilla Gonzalez
 * @version 08-07-2021
 */
import javax.swing.JOptionPane;

public class UD6Ejercicio1App {

	//El metodo cuadrado calculara el área multiplicando la longitud horizontal por la longitud vertical pedidas por teclado y devolvera el resultado de la operacion.
	public static double cuadrado(double horizontal, double vertical) {
		return horizontal*vertical;
	}
	//El metodo circulo calculara el área utilizando la funcion (radio^2)*PI usando el radio pedido por teclado y devolvera el resultado de la operacion.
	public static double circulo(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}
	//El metodo triangulo calculara el área con la funcion (base*altura)/2 usando la base y altura pedidas por teclado y devolvera el resultado de la operacion.
	public static double triangulo(double base, double altura) {
		return (base * altura) / 2;
	}
	/**
	 * El metodo main nos pedira de que tipo de figura queremos calcular el área y dependiendo de nuestra respuesta volvera a preguntarnos por su radio, medidas, altura...
	 * Tras recibir todos los datos necesarios los enviara a los diferentes metodos y tras recibir la respuesta los imprimira.
	 * Si al preguntar por la figura respondemos una opcion que no es valida nos saltara un error.
	 */
	public static void main(String[] args) {
		String geo = JOptionPane.showInputDialog("Introduce el tipo de la figura.");
		switch (geo) {
		case "Circulo":
			String textRadio = JOptionPane.showInputDialog("Introduce el radio del circulo.");
			double radio = Double.parseDouble(textRadio);
			JOptionPane.showMessageDialog(null, "El Área de la figura es de: " + circulo(radio));
			break;
		case "Triangulo":
			String textAltura = JOptionPane.showInputDialog("Introduce la longitud de la altura del triangulo.");
			double altura = Double.parseDouble(textAltura);
			String textBase = JOptionPane.showInputDialog("Introduce la longitud de la base del triangulo.");
			double base = Double.parseDouble(textBase);
			JOptionPane.showMessageDialog(null, "El Área de la figura es de: " + triangulo(base, altura));
			break;
		case "Cuadrado":
			String textVertical = JOptionPane.showInputDialog("Introduce la longitud vertical del cuadrado.");
			double vertical = Double.parseDouble(textVertical);
			String textHorizontal = JOptionPane.showInputDialog("Introduce la longitud horizontal del cuadrado.");
			double horizontal = Double.parseDouble(textHorizontal);
			JOptionPane.showMessageDialog(null, "El Área de la figura es de: " + cuadrado(horizontal, vertical));
			break;
		default:
			JOptionPane.showMessageDialog(null, geo + " no es una figura valida.");
		}

	}

}
