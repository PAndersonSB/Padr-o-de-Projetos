
public class Context {
	private Soma soma;
	
	public void setSoma(Soma soma) {
		this.soma = soma;
	}
	public void doSomething() {
		soma.somar(1,2);
	}
}
