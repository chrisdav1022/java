public class Anidadas{
	public static void main(String args[]){

		int ope = 2;
		int num1 = 8;
		int num2 = 4;
		int result = 0;

		
		if(ope == 1){
			result = num1 + num2;
			System.out.println("El resultado es: " + result);	 
		}else if (ope == 2){
			result = num1 - num2;
			System.out.println("El resultado es: " + result);
		}else if (ope == 3){
			result = num1 * num2;
			System.out.println("El resultado es: " + result);
		}else if (ope == 4){
			result = num1 / num2;
			System.out.println("El resultado es: " + result);
		}else{
			System.out.println("la opcion no existe");
		}
	}
}