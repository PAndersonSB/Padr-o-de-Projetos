package ifba.app;

import java.util.Date;

import ifba.elementos.Cabecalho;
import ifba.elementos.Corpo;
import ifba.elementos.Rodape;
import ifba.elementos.html.CabecalhoHTML;
import ifba.elementos.html.CorpoHTML;
import ifba.elementos.html.RodapeHTML;

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
