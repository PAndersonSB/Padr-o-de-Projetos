package builder;

public class NotebookBuilder  implements FerramentaBuilder{
	
	public String teclado;
	public String mouse;
	public String processador;
	public String fonteDeAlimentacao;
	
	public void setTeclado() {
		this.teclado = "teclado integrado / soldado";
		System.out.println(teclado);
	}
	public void setMouse () {
		this.mouse = "touchpad";
		System.out.println(mouse);
	}
	public void setProcessador () {
		this.Processador = "Processador integrado / soldado";
		System.out.println(processador);
	}
	public void setFonteDeAlimentacao() {
		this.onteDeAlimentacao = "Bateria interna";
		System.out.println(FonteDeAlimentacao);
	}
	
	public Notebook getProduto() {
		return new Notebook();
	}
}
