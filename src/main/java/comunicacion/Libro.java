package comunicacion;

public abstract class Libro extends Escrito {
	String co_autor;
	String editorial;
	String edicion;
	String interpretacion;
	
	public Libro(String origen, String titulo, String autor, int paginas,String co_autor,
			String editorial,String edicion,String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor=co_autor;
		this.editorial=editorial;
		this.edicion=edicion;
		this.interpretacion=interpretacion;
	}

}
