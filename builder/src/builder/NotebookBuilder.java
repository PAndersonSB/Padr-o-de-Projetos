package builder;

public class NotebookBuilder  implements FerramentaBuilder{
	
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
	
	public Notebook getProduto() {
		return new Notebook();
	}
}
