package partenon;

import java.io.Serializable;
import java.util.ArrayList;

public class Ubicacion implements Serializable{
	private String estantes;
	private int filas;
	
	public String getEstantes() {
		return estantes;
	}
	public void setEstantes(String estantes) {
		this.estantes = estantes;
	}
	public int getFilas() {
		return filas;
	}
	public void setFilas(int filas) {
		this.filas = filas;
	}
        
	@Override
	public String toString() {
		return "Ubicacion [estantes=" + estantes + ", filas=" + filas + "]";
	}

}
