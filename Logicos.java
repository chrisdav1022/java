import java.util.Scanner;

public class Logicos{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		String nombre = "";
		int clave = 0, antiguedad = 0;


		System.out.println("******************");
		System.out.println("sistema vacacional");
		System.out.println("******************\n\n");


		System.out.print("¿Cual es el nombre del trabajador?: ");
		nombre = entrada.nextLine();
		System.out.println("");

		System.out.print("¿Cuanto tiempo de servicio tiene el trabajador?: ");
		antiguedad = entrada.nextInt();
		System.out.println("");

		System.out.print("¿Cual es la clave del trabajador?: ");
		clave = entrada.nextInt();
		System.out.println("");

		if (clave == 1){

			if(antiguedad == 1){
				System.out.println("el trabajador " + nombre + " tienes 6 dias de vacas");
			} else if (antiguedad >= 2 && antiguedad <= 6){
				System.out.println("el trabajador " + nombre + " tienes 14 dias de vacas");
			} else if (antiguedad >= 7){
				System.out.println("el trabajador " + nombre + " tienes 20 dias de vacas");
			} else {
				System.out.println("el trabajador " + nombre + " aun no tiene vacas, asi que salado :v");
			}
		} else if(clave == 2){
			if(antiguedad == 1){
				System.out.println("el trabajador " + nombre + " tiene 7 dias de vacas");
			} else if (antiguedad >= 2 && antiguedad <= 6){
				System.out.println("el trabajador " + nombre + " tiene 15 dias de vacas");
			} else if (antiguedad >= 7){
				System.out.println("el trabajador " + nombre + " tiene 22 dias de vacas");
			} else {
				System.out.println("el trabajador " + nombre + " aun no tiene vacas, asi que salado :v");
			}
		
		} else if(clave == 3){
			if(antiguedad == 1){
				System.out.println("el trabajador " + nombre + " tiene 10 dias de vacas");
			} else if (antiguedad >= 2 && antiguedad <= 6){
				System.out.println("el trabajador " + nombre + " tienes 20 dias de vacas");
			} else if (antiguedad >= 7){
				System.out.println("el trabajador " + nombre + " tienes 30 dias de vacas");
			} else {
				System.out.println("el trabajador " + nombre + " aun no tiene vacas, asi que salado :v");
			}
		} else {
			System.out.println("Error!, no existe el departamento");
		}
	}
}

