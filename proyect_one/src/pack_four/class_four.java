package pack_four;
import java.util.Scanner;
public class class_four {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double num, num2, result, resultD, decim=10, resultfinal, resultfinalD;

		System.out.println( "Introduce su numero:" );
		num = entrada.nextDouble();
		System.out.println( "Introduce segundo numero :" );
		num2 = entrada.nextDouble();

		result= num*num2;
		resultD=num/num2;
		resultfinal= Math.round(result*Math.pow(10, decim)/Math.pow(10, decim));
		resultfinalD= Math.round(resultD*Math.pow(10, decim)/Math.pow(10, decim));
		System.out.println("La primera operacion multiplicada es "+result+ " y en division es "+resultD);
		System.out.print( "el final de la operacion multiplicada es " + resultfinal +" y dividida es "+resultfinalD);
		}
		}


