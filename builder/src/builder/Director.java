package builder;

public class Director {
	private FerramentaBuilder builder ;
	
	public Director(FerramentaBuilder builder) {
		this.builder = builder;
	}
	
	public Ferramenta createFerramenta() {
		builder.setTeclado();
		builder.setMouse();
		builder.setProcessador();
		builder.setFonteDeAlimentacao();
		return builder.getProduto();
	}
	
	}
	
}
