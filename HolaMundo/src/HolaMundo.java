
public class HolaMundo {

	public static void main(String[] args) {
		
		System.out.println("Hola mundo " + (9/2));
		System.out.println();
		
		new Coche();
		new Coche();
		new Coche();
		new Coche();
		
		System.out.println();
		System.out.println("FIN DE EJECUCIÓN");

		System.out.println("\nPIRÁMIDE ASTERISCOS:");
		
		
		int altura = 9 / 2;
		for (int i = 0; i < 5; i++) {
			System.out.println();
			
			for (int j = 0; j < 9; j++) {
				if (j > (altura + i) && j < (altura - i)) {
					System.out.print(" ");
				} else {
					System.out.print("* ");
				}
				altura++;
			}
		}
	}

}
