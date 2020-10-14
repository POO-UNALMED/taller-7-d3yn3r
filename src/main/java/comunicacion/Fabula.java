package comunicacion;

public abstract class Fabula extends Escrito {
	String enseñanza;
	String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas,String enseñanza,String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.enseñanza=enseñanza;
		this.interpretacion=interpretacion;
	}

}
