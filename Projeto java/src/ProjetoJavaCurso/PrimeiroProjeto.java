package ProjetoJavaCurso;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class PrimeiroProjeto {
	
	public static void main(String[] args) {
		
		Date relogio = new Date();
		System.out.println("teste realizado no dia: " + relogio.toString());
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		System.out.println("A resolu��o da sua m�quina �: " +d.width + " x " +d.height);
		
		 Locale loc = Locale.getDefault();
	        System.out.println ("o seu computador est� em: " + loc.getDisplayLanguage() + "!");
		
	}

}
