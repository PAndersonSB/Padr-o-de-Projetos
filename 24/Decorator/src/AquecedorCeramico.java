
public class AquecedorCeramico extends BaseDecorator{
	
	public AquecedorCeramico() {
		super(new Aquecedor());
		
	}
	
	public void aquecer(String mensagem) {
		super.aquecer(mensagem);
	}
}
