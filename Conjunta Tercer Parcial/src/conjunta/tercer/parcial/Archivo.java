package conjunta.tercer.parcial;

import com.csvreader.CsvWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Archivo {
    
        public static final String SEPARATOR=";";
	public static final String QUOTE="\"";

	
        public void generarArchivo(String table, String data){
        	String ruta = table+".csv";
		Boolean existe = new File(ruta).exists();
		
		try{
			
			CsvWriter csvEscribir = new CsvWriter (new FileWriter(ruta,true), ',');
			
				csvEscribir.write(data);
				//csvEscribir.write
				csvEscribir.endRecord();
	
			csvEscribir.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	
	public boolean busqueda(String codigo){
		
		BufferedReader br = null;
	     
	     try {
	        
	        br =new BufferedReader(new FileReader("Clientes.csv"));
	        String line = br.readLine();
	        while (null!=line) {
	           String [] fields = line.split(SEPARATOR);
                   //Revisar no direfencia entre 12 y 1 o 2
	           if(fields[8].equals(codigo))
                        return true;
	           //System.out.println(Arrays.toString(fields));
	           
	           line = br.readLine();
	        }
	        
	     } catch (Exception e) {
	   	  //Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, e);
	     } finally {
	        if (null!=br) {
	           //br.close();
	        }
	     }
		return false;
		
	}
        
        
	public void leerprovedores(String archivo, ArrayList<Provedor> provedores){
		
            BufferedReader br = null;
	     
	     try {
	        
	        br =new BufferedReader(new FileReader(archivo+".csv"));
	        String line = br.readLine();
	        while (null!=line) {
	           String [] fields = line.split(SEPARATOR);
                   Provedor t = new Provedor(fields[0],fields[1],fields[2]); 
                   t.toString();
                   provedores.add(t);
	           line = br.readLine();
	        }
	        
	     } catch (Exception e) {
	   	  //Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, e);
	     } finally {
	        if (null!=br) {
	           //br.close();
	        }
	     }
		
		
	}
        public void leerproductos(String archivo, ArrayList<Productos> productosarchivo){
		
            BufferedReader br = null;
	     
	     try {
	        br =new BufferedReader(new FileReader(archivo+".csv"));
	        String line = br.readLine();
	        while (null!=line) {
	           String [] fields = line.split(SEPARATOR);
                    System.out.println(fields[0]);
                   Productos t = new Productos(fields[0],fields[1],fields[2],fields[3],fields[4]); 
                   t.toString();
                   productosarchivo.add(t);
	           line = br.readLine();
	        }
	        
	     } catch (Exception e) {
	   	  //Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, e);
	     } finally {
	        if (null!=br) {
	           //br.close();
	        }
	     }
		
		
	}
	
}
