package ifba.app;

import java.util.Date;


public class CriaDocumentoHTML extends CriadorDocumento{
	
	public CriaDocumentoHTML () {
		Cabecalho cabecalho= new CabecalhoHTML();
		cabecalho.setTitulo("Padroes de projeto");
		cabecalho.setEmpresa("Insituto Federal da Bahia");
		
		Corpo corpo = new CorpoHTML();
		corpo.setTexto("Aula de padroes de projeto.");
		
		Rodape rodape= new RodapeHTML();
		rodape.setData(new Date() );
	}
	
	public  String geraDocumentacao() {
		return cabecalho.getOutput() + corpo.getOutput() + rodape.getOutput();
	}
	

}