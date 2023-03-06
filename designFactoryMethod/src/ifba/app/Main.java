package ifba.app;

public class Main {

	public static void main(String[] args) {
		CriadorDocumento criador = new CriaDocumentoMarkdown();
		System.out.println(criador.geraDocumentacao());
	}

}
