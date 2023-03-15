package ifba.app;

import java.util.Date;

import ifba.elementos.Cabecalho;
import ifba.elementos.Corpo;
import ifba.elementos.Rodape;
import ifba.elementos.markdown.CabecalhoMarkdown;
import ifba.elementos.markdown.CorpoMarkdown;
import ifba.elementos.markdown.RodapeMarkdown;

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
