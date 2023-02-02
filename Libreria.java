import java.util.Scanner;

public class Libreria{
	public static void main(String args[]){

		Scanner line = new Scanner(System.in);
		/* las comillas se ponen vacias ya que 
		son las que van a resibir los datos ingresados
		 por teclado */
	 	String nombre = "";		
		int num1 = 0, num2 = 0, num3 = 0, result = 0;
		
		System.out.println("cual es tu nombre?");
		nombre = line.nextLine();

		System.out.println("escriba el primer valor de suma:");
		num1 = line.nextInt();

		System.out.println("escriba el primer valor de suma:");
		num2 = line.nextInt();

		System.out.println("escriba el segundo valor de suma:");
		num3 = line.nextInt();

		result = num1 + num2 + num3;

		System.out.println("Hola " + nombre + " el resultado es: " + result);
	}
}