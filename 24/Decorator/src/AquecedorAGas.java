
public class AquecedorAGas extends BaseDecorator{
	
	public AquecedorAGas() {
		super(new Aquecedor());
		
	}
	
	public void aquecer(String mensagem) {
		super.aquecer(mensagem);
	}
}
