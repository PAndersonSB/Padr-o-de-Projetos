
public class AquecedorEletrico extends BaseDecorator{
	
	public AquecedorEletrico() {
		super(new Aquecedor());
		
	}
	
	public void aquecer(String mensagem) {
		super.aquecer(mensagem);
	}
	
}
