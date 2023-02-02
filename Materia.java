public class Materia{
	public static void main(String args[]){
		int mate = 5;
		int biol = 5;
		int quim = 7;
		int prom = 0;

		prom = (mate + biol + quim) / 3;

		if(prom >= 6){
			System.out.println(prom + " aprobó");
		}else{
			System.out.println(prom + " reprobo");
		}

	}
}