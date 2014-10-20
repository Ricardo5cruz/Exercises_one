package pack_three;
import java.util.Scanner;
public class class_three {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double num, log=10, result;

		System.out.println( "Introduce su numero:" );
		num = entrada.nextDouble();

		result= Math.log(num)/(Math.log(log));

		System.out.print( "el final de la operacion en logaritmo base 10 es " + result );
		}
		}