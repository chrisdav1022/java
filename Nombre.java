import java.util.Scanner;

public class Nombres{
	public static void main(String args[]){
	
	String nombre_uno = "", nombre_dos = "";
	Scanner entrada = ner Scanner(System.in);

	System.out.print("Ingresa el primer nombre: ")
	nombre_uno = entrada.nextLine();

	System.out.print("Ingresa el segundo nombre: ");
	nombre_dos = entrada.nextLine();

	if(nombre_uno.equals (nombre_dos)){
		System.out.prinln("Los nombre son iguales.")
		}else{
			System.out.println("Los nombres son diferentes.")
		}
	}

}