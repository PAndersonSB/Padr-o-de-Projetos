
public class BaseDecorator extends Aquecedor{
	private Aquecedor aquecedor;
	
	public BaseDecorator(Aquecedor aquecedor) {
		this.aquecedor = aquecedor;
	}
	
	public void aquecer(String mensagem) {
		aquecedor.aquecer(mensagem);
	}
}
