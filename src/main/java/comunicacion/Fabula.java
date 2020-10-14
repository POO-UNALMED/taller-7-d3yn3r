package comunicacion;

public abstract class Fabula extends Escrito {
	String ensenanza;
	String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas,String enseñanza,String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza=enseñanza;
		this.interpretacion=interpretacion;
	}
	
	public String getEnseñanza() {
		return ensenanza;
	}
	
	public void setEnsenanza(String ensenanza) {
		this.ensenanza=ensenanza;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	

}
