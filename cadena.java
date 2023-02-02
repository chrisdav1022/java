import java.util.Scanner;

public class cadena{
	public static void main(String args[]){

	String cadena_original = "", cadena_substraccion = "";
	int num_caracteres = 0, desde = 0, hasta = 0;
	Scanner in = new Scanner(System.in);

	System.out.print("Introduce una cadena de caracteres: ");
	cadena_original = in.nextLine();

	num_caracteres = cadena_original.length();

	System.out.println("la cadena " + cadena_original + " posee " + num_caracteres + " caracteres.");

	System.out.print("desde que punto quieres ver la cadena?: ");
	desde = in.nextInt();
	System.out.print("hasta que punto quieres ver la cadena?: ");
	hasta = in.nextInt();

	cadena_substraccion = cadena_original.substring(desde, hasta);
	System.out.println("La nueva cadena es: " + cadena_substraccion);
	}
}