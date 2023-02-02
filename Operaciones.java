public class Operaciones{
	public static void main(String args[]){
		int num1 = 4;
		int num2 = 4;
		int res = 0;

		res = num1 + num2 / 2;
		System.out.println("incorrecto " + res);

		res = (num1 + num2) / 2;
		System.out.println("correcto " + res);
	}
}