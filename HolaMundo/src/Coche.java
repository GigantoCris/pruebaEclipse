
public class Coche {

	private String mensaje = "Soy el coche n� ";
	static private int contador = 1;
	
	public Coche() {
		System.out.println(mensaje + contador++);
	}
	
}
