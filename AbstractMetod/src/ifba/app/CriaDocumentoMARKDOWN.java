package ifba.app;

import java.util.Date;

public class CriaDocumentoMarkdown extends CriadorDocumento{
	
	public  CriaDocumentoMarkdown() {
		Cabecalho cabecalho= new CabecalhoMarkdown();
		cabecalho.setTitulo("Padroes de projeto");
		cabecalho.setEmpresa("Insituto Federal da Bahia");
		
		Corpo corpo = new CorpoMarkdown();
		corpo.setTexto("Aula de padroes de projeto.");
		
		Rodape rodape= new RodapeMarkdown();
		rodape.setData(new Date() );
	}
	
	public  String geraDocumentacao() {
		
		return cabecalho.getOutput() + corpo.getOutput() + rodape.getOutput();
	}

}