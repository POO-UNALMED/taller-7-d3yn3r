package comunicacion;

public abstract class Periodico extends Escrito {
	String fecha;
	String primicia;
	String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas,
			String fecha,String primicia,String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha=fecha;
		this.primicia=primicia;
		this.interpretacion=interpretacion;
		
	}

}
