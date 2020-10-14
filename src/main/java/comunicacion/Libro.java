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
	
	public String getCo_autor() {
		return co_autor;
	}
	
	public void setCo_autor(String co_autor) {
		this.co_autor=co_autor;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public void setEditorial(String editorial) {
		this.editorial=editorial;
	}
	
	public String getEdicion() {
		return edicion;
	}
	
	public void setEdicion(String edicion) {
		this.edicion=edicion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int palabrasPagina) {
		return this.getPaginas() * palabrasPagina * 2;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String sol = this.resumen() + "\n";
		sol += this.co_autor + "\n";
		sol += this.editorial + "\n";
		sol += this.edicion;
		return sol;
	}
	

}
