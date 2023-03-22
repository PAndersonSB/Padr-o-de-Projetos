package builder;

public class Director {
	
	public Computador createComputador() {
		ComputadorBuilder builder = new ComputadorBuilder();
		builder.setTeclado();
		builder.setMouse();
		builder.setProcessador();
		builder.setFonteDeAlimentacao();
		return builder.getProduto();
	}
	
	public Notebook createNotebook() {
		NotebookBuilder builder = new NotebookBuilder();
		builder.setTeclado();
		builder.setMouse();
		builder.setProcessador();
		builder.setFonteDeAlimentacao();
		return builder.getProduto();
	}
	
}
