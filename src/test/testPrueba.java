package test;



import java.time.LocalDate;

import modelo.Genero;
import modelo.Incaa;
import modelo.Pelicula;




public class testPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Incaa sistema=new Incaa();
		Incaa pelisArgentinas=new Incaa();
		Genero genero1=new Genero(1,"Comedia");
		Genero genero2=new Genero(1,"Terror");
		LocalDate fecha=LocalDate.of(2023, 2, 12);
		
		Pelicula pelicula1=new Pelicula("Toy Story",genero1,fecha,300);
		
		
		try {
			sistema.agregarPelicula("Toy Story");
		
			sistema.modificarPelicula(1, "Cars");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(sistema.getLstPeliculas());
		}
		
		
		/*//agrego peliculas si estan repetidas en la lista tira excepcion
		try {
			sistema.agregarPelicula("Toy Story",genero1);
			sistema.agregarPelicula("Corazon Valiente",genero1);
			sistema.agregarPelicula("Monster Inc",genero2);
			pelisArgentinas.agregarPelicula("El secreto de sus ojos", genero1);
			pelisArgentinas.agregarPelicula("Granizo", genero1);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}

		//ver lista de peliculas
		System.out.println(sistema.getLstPeliculas());
		System.out.println(pelisArgentinas.getLstPeliculas());
		//Probando excepciones
		try {
			sistema.eliminarPelicula(5); // no existe esa pelicula en la lsita
			//System.out.println(sistema.traerPelicula(5)); No existe la pelicula 5
			//sistema.agregarPelicula("Monster Inc",genero2); Ya existe una igual
			//sistema.modificarPelicula(4, "Coco"); No existe el id 4
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {// aunque tire excepcion me imprime la lista igual
			System.out.println(sistema.getLstPeliculas());
		}*/
	
		
		
		
	}

}

