package fa;

public class Impresora {
	private String tipoDocumento;
	private String hoja;
	private boolean color;
	private String texto;

	public String getTipoDocumento() {
		return tipoDocumento;
	}
	
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	public String getHoja() {
		return hoja;
	}
	
	public void setHoja(String hoja) {
		this.hoja = hoja;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}

	public boolean isColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}

	public void imprimirDocumento() {
		System.out.println("Impresora [tipoDocumento=" + tipoDocumento + ", hoja=" + hoja + ", color=" + color + ", texto=" + texto + "]"); 
	}
}
