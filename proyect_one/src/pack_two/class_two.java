package pack_two;
import java.util.Scanner;
public class class_two {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double num, resultC, result;

		System.out.println( "Introduce su numero:" );
		num = entrada.nextDouble();

		result= Math.sin(Math.toRadians(num));
		resultC= Math.cos(Math.toRadians(num));

		System.out.print( "el final de la operacion en Seno es " + result + " y en coseno " +
				resultC  );
		}
		}