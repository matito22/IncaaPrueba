package modelo;

import java.time.LocalDate;

public class Pelicula {

	@Override
	public String toString() {
		return "\n Pelicula [idPelicula=" + idPelicula + ", pelicula=" + pelicula + ", genero=" + genero.getGenero() + ",Estreno="+ fechaDeEstreno + ",Precio=" + precio + "]";
	}
	private int idPelicula;
	private String pelicula;
	private Genero genero;
	private LocalDate fechaDeEstreno;
	private double precio;
	
	public LocalDate getFechaDeEstreno() {
		return fechaDeEstreno;
	}
	public void setFechaDeEstreno(LocalDate fechaDeEstreno) {
		this.fechaDeEstreno = fechaDeEstreno;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	public boolean equals(Pelicula pe) {
		return this.getPelicula()==pe.getPelicula();
	}
	
	public int getIdPelicula() {
		return idPelicula;
	}
	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}
	public String getPelicula() {
		return pelicula;
	}
	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}
	public Pelicula(String pelicula,Genero genero,LocalDate fechaDeEstreno,double precio) {
		super();
		this.idPelicula = idPelicula;
		this.pelicula = pelicula;
		this.genero=genero;
		this.fechaDeEstreno=fechaDeEstreno;
		this.precio=precio;
	}
	
	
	
	
}
