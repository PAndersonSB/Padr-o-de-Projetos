package ifba.elementos.html;

import ifba.elementos.Cabecalho;

public class CabecalhoHTML implements Cabecalho {
	String titulo;
	String empresa;
	
	@Override
	public String getTitulo() {
		return titulo;
	}

	@Override
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String getEmpresa() {
	    return empresa;
	}

	@Override
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	@Override
	public String getOutput() {
		return "<html><head><title>" + getTitulo() + "</title></head><body>\n" +
				"<h1>" + getTitulo() + "</h1>\n" +
				"<h2>" + getEmpresa() + "</h2>\n";
	}
}
