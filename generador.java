import java.util.Random;

public class generador {

	public void contraseña() {
		Random random = new Random();
		String caracteres = "qwertyuiopasdfghjklñzxcvbnm1234567890QWERTYUIOPASDFGHJKLÑZXCVBNM";
		int contador = 0;
		int digitos = 10;
		String Contraseña = "";

		while (contador <= digitos) {
				
			Contraseña = Contraseña + caracteres.charAt(random.nextInt(caracteres.length()));
			contador = contador + 1;
					

		}
	
		System.out.println("Contraseña Generado: " + Contraseña);
	

	}

	public static void main(String[] args) {
		
		System.out.println("***Generador de Contraseñas***\n");

		generador obj = new generador();
		obj.contraseña();

	}

}
