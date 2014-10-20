package pack_one;
import java.util.Scanner;
public class class_one {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num, exp, result;
		String nombre;
		System.out.println( "Introduce su numero:" );
		num = entrada.nextInt();
		System.out.println( "Introduce numero para elevarlo:" );
		exp = entrada.nextInt();

		result= (int) Math.pow(num, exp);

		System.out.print( "el final de la operacion es " + result );
		}
		}