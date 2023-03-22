package builder;

public class ComputadorBuilder implements FerramentaBuilder{
	
	public String teclado;
	public String mouse;
	public String processador;
	public String fonteDeAlimentacao;
	
	public void setTeclado() {
		this.teclado = "teclado com conexão usb";
		System.out.println(teclado);
	}
	public void setMouse () {
		this.mouse = "mouse com conexão usb";
		System.out.println(mouse);
	}
	public void setProcessador () {
		this.processador = "processador colocado por encaixe";
		System.out.println(processador);
	}
	public void setFonteDeAlimentacao() {
		this.FonteDeAlimentacao = "Fonte de alimentação modular";
		System.out.println(FonteDeAlimentacao);
	}
	public Computador getProduto() {
		return new Computador();
	}

}
