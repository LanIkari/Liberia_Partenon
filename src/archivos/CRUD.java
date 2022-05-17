package archivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import partenon.Libro;

public class CRUD {
	private File nombreArchivo;

	public CRUD(String ruta) throws FileNotFoundException,IOException {
		this.nombreArchivo = new File(ruta);
	}
	
	public void crear(Object objeto) throws FileNotFoundException,IOException{
		FileOutputStream fw;
		fw = new FileOutputStream(nombreArchivo,true);
		ObjectOutputStream os = new ObjectOutputStream(fw);
		os.writeObject(objeto);
		os.close();
	}
	
	public void update(Object dato) throws IOException{
		FileOutputStream fw = new FileOutputStream(nombreArchivo,true);
		SalidaObjeto so = new SalidaObjeto(fw);
		so.writeObject(dato);
		so.reset();
		so.close();
	}
	
	public ArrayList<Object> read() throws FileNotFoundException,ClassNotFoundException{
		ArrayList<Object> arreglo = new ArrayList<>();
		try {
			FileInputStream fo = new FileInputStream(nombreArchivo);
			ObjectInputStream oi = new ObjectInputStream(fo);
			Object aux = oi.readObject();
			while(aux != null){
				if(aux instanceof Libro){
					arreglo.add(aux);
					//System.out.println(aux);
				}
				aux = oi.readObject();
			}
			oi.close();
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println("Fin archivo");
		}
		return arreglo;
	}
        
        
        public boolean existeArchivo(){
            return this.nombreArchivo.exists();
        }
        public void borrarArchivo(){
            this.nombreArchivo.delete();
        }
}
