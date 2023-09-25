package fa;

public class facade {
	Impresora impresora = new Impresora();
	public facade() {
		impresora.setColor(true);
		impresora.setHoja("A4");
		impresora.setTexto("Documento");
		impresora.setTipoDocumento("PDF");
	}
	
	public void visualiza() {
		impresora.imprimirDocumento();
	}
}
