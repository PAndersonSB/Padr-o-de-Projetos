package ifba.elementos.html;

import ifba.elementos.Corpo;

public class CorpoHTML implements Corpo {
	String texto;
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	@Override
	public String getOutput() {
		return "<p>" + getTexto() + "</p>";
	}

}
