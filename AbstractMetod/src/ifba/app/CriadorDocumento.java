package ifba.app;

import java.util.Date;

public abstract class CriadorDocumento {
	protected Cabecalho cabecalho;
	protected Corpo corpo;
	protected Rodape rodape;
	
	public abstract String geraDocumentacao();
}
