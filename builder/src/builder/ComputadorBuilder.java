package builder;

public class ComputadorBuilder implements FerramentaBuilder{
	
	public String teclado;
	public String mouse;
	public String processador;
	public String fonteDeAlimentacao;
	
	public void setTeclado() {
		
	}
	public void setMouse () {
		
	}
	public void setProcessador () {
		
	}
	public void setFonteDeAlimentacao() {
		
	}
	public Computador getProduto() {
		return new Computador();
	}

}
