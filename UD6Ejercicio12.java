/**
 * @author Jose Luis Padilla Gonzalez
 * @version 08-07-2021
 */
import javax.swing.JOptionPane;
public class UD6Ejercicio12 {
		public static void Relleno(int num[],int multi) {
			
			for (int i = 0; i < num.length; i++) {
				int random = (int)Math.floor(Math.random()*((0+1)-(300+1))+(300));
				num[i]=random;
			}
			int contador=0;
			for (int i = 0; i < num.length; i++) {
				if(num[i]%multi==0) {
					contador++;
				}
			}
			int num2[]=new int[contador];
			contador=0;
			for (int i = 0; i < num.length; i++) {
				if(num[i]%multi==0) {
					num2[contador]=num[i];
					contador++;
				}
			}
			for (int i = 0; i < num.length; i++) {
				JOptionPane.showMessageDialog(null,"Posicion "+(i+1)+" = "+num[i]);
			}
			for (int i = 0; i < num2.length; i++) {
				JOptionPane.showMessageDialog(null,"Posicion "+(i+1)+" = "+num2[i]);
			}
		}
		
		public static void main(String[] args) {

			String textoNumero=JOptionPane.showInputDialog("Escribe el tamaño del array.");
			int numero=Integer.parseInt(textoNumero);
			String textoMult=JOptionPane.showInputDialog("Escribe el numero del divisor.");
			int multi=Integer.parseInt(textoMult);
			int num[]=new int[numero];
			Relleno(num,multi);
			
		}
	}
