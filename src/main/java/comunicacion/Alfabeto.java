package comunicacion;

public abstract class Alfabeto extends Pictograma{
	String[] letras = new String[26];
	String interpretacion;
	
	public Alfabeto(String origen,String[] letras,String interpretacion) {
		super(origen);
		this.letras=letras;
		this.interpretacion=interpretacion;
		
	}
	 public String[] getLetras() {
		 return letras;
	 }
	 
	 public void setLetras(String[] letras) {
		 this.letras=letras;
	 }
	 
	 public void setInterpretacion(String interpretacion) {
			this.interpretacion = interpretacion;
		}
	

}
