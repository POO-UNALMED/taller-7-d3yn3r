package comunicacion;

public abstract class Fabula extends Escrito {
	String ense�anza;
	String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas,String ense�anza,String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ense�anza=ense�anza;
		this.interpretacion=interpretacion;
	}

}
