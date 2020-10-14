package comunicacion;

public abstract class Tesis extends Escrito {
	String idea;
	String[] argumentos = new String[2];
	String conclusion ;
	String referencias;
	String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas,String idea,
			String[] argumentos,String conclusion,String referencias,String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea=idea;
		this.argumentos=argumentos;
		this.conclusion=conclusion;
		this.referencias=referencias;
		this.interpretacion=interpretacion;
	}
	
	public String getIdea() {
		return idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
	}
}
