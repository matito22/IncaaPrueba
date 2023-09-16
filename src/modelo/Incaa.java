package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Incaa {
	private List<Pelicula> lstPeliculas;
	


	@Override
	public String toString() {
		return "Incaa [catalogo=" + lstPeliculas + "]";
	}

	public List<Pelicula> getLstPeliculas() {
		return lstPeliculas;
	}


	public Incaa() {
		this.lstPeliculas = new ArrayList<Pelicula>();
	}
	
	public boolean agregarPelicula(String pelicula) throws Exception {
		int id=1;
		System.out.println("Estoy aca");
		for(int i=0;i<lstPeliculas.size();i++) {
			if(lstPeliculas.get(i).getPelicula()==pelicula) {
				throw new Exception("Ya existe una pelicula con ese nombre");
			}
		}
		System.out.println("Estoy aca");
		if(lstPeliculas.size()>0) {
			id=lstPeliculas.get(lstPeliculas.size()-1).getIdPelicula()+1;
		}
		
		Pelicula peliAux=traerPelicula(pelicula);
		lstPeliculas.add(peliAux);
		return true;
	}
	
	public Pelicula traerPelicula(int idPelicula) throws Exception {
		Pelicula peliAux=null;
		int i=0;
		while(peliAux==null && i<lstPeliculas.size()) {
			if(lstPeliculas.get(i).getIdPelicula()== idPelicula) {
				peliAux=lstPeliculas.get(i);
			}
			i++;
			}
		if(peliAux==null) {
			throw new Exception("La pelicula no existe en la lista");
		}
		return peliAux;
		
	}
	
	public Pelicula traerPelicula(String partePelicula) {
		Pelicula peliAux=null;
		int i=0;
		
		while(peliAux==null && i<lstPeliculas.size()) {
			if(lstPeliculas.get(i).getPelicula()== partePelicula) {
				peliAux=lstPeliculas.get(i);
				
			}
			i++;
		}
		return peliAux;
	}
	public List<Pelicula> traerPelicula(Genero genero) {
		List<Pelicula> pelisAux=new ArrayList<Pelicula>();
		int i=0;
		
		while(i<lstPeliculas.size()) {
			if(lstPeliculas.get(i).getGenero()== genero) {
				pelisAux.add(lstPeliculas.get(i));
				
			}
			i++;
		}
		return pelisAux;
	}
	
	
	public void modificarPelicula(int idPelicula,String pelicula) throws Exception {
		Pelicula peliAux=traerPelicula(idPelicula);
		peliAux.setPelicula(pelicula);
	}
	
	public void eliminarPelicula(int idPelicula) throws Exception {
		Pelicula peliAux=traerPelicula(idPelicula);
		lstPeliculas.remove(peliAux);
	}
	
	public List<Pelicula> traerPelicula(LocalDate fecha){
		List<Pelicula> listAux=new ArrayList<Pelicula>();
		for(int i=0;i<lstPeliculas.size();i++) {
			if(lstPeliculas.get(i).getFechaDeEstreno()== fecha) {
				listAux.add(lstPeliculas.get(i));
			}
		}
		return listAux;
	}
	

}
