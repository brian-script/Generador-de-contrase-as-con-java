import java.util.Random;

public class generador {

	public void contraseña() {
		Random random = new Random();
		String caracteres = "qwertyuiopasdfghjklñzxcvbnm1234567890";
		int contador = 0;
		int digitos = 10;

		while (contador <= digitos) {
			
			String Contraseña = "";
	    	//System.out.println(caracteres.charAt(2));
			Contraseña = Contraseña + caracteres.charAt(2);
			contador = contador + 1;
			System.out.println(Contraseña);		
		}
	
	
	

	}

	public static void main(String[] args) {

		generador obj = new generador();
		obj.contraseña();

	}

}
