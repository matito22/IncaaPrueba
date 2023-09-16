package modelo;



public class Genero {
	
	private int idGenero;
	private String genero;
	
	public boolean equals(Genero ge) {
		return this.getIdGenero()==ge.getIdGenero();
	}
	public int getIdGenero() {
		return idGenero;
	}
	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Genero(int idGenero, String genero) {
		super();
		this.idGenero = idGenero;
		this.genero = genero;
	}

}
