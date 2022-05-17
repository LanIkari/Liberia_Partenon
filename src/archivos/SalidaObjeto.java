package archivos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SalidaObjeto extends ObjectOutputStream{

	public SalidaObjeto(OutputStream out) throws IOException {
		super(out);
		// TODO Auto-generated constructor stub
	}
	
	public SalidaObjeto() throws IOException{
		super();
	}

	@Override
	protected void writeStreamHeader() throws IOException {

	}

}
