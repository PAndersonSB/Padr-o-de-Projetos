package ifba.app;

public class Main {

	public static void main(String[] args) {
		CriadorDocumentacao criador = new CriaDocumentoHTML();
		System.out.println(criador.geraDocumentacao());
	}

}
