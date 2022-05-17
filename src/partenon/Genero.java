package partenon;

import java.io.Serializable;
import java.util.ArrayList;

public class Genero implements Serializable{
	private String nombre;
	private int numeroGenero;
	//para inicializar se utiliza a new ArrayList para iniciar desde cero
	private ArrayList<Ubicacion> ubicacion = new ArrayList<>();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumeroGenero() {
		return numeroGenero;
	}
	public void setNumeroGenero(int numeroGenero) {
		this.numeroGenero = numeroGenero;
	}
	public ArrayList<Ubicacion> getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(ArrayList<Ubicacion> ubicacion) {
		this.ubicacion = ubicacion;
	}
	@Override
	public String toString() {
		return "Genero [nombre=" + nombre + ", numeroGenero=" + numeroGenero
				+ ", ubicacion=" + ubicacion + "]";
	}
	

}
