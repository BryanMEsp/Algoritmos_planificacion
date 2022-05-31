import java.io.*;
import java.io.File;
public class Lector {
	
	public String[] leerTxt() {
	
		String directoryName = System.getProperty("user.dir");
		File file = new File(directoryName+"//datos.txt");
		String path = file.getPath();
		
		String Guardar = "";
		String arreglo[] = null; 
		String strng= ""; 
		
		try {
			BufferedReader obj = new BufferedReader(new FileReader(path));
			
			while((strng = obj.readLine()) != null) {
		    Guardar = Guardar + strng + "\n"; 
	        	 
			}
			 
			arreglo = Guardar.split("\\r?\\n");
		    
;			
		}catch(Exception e) {System.err.println("No se encontro el archivo");}
		
		return arreglo;
	}
}
