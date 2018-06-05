
package biblio;

import biblio.controllers.Adaptador;
import biblio.model.entities.Autor;
import biblio.model.entities.Obra;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    
    public static Adaptador adaptador;

    public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
        
        FileInputStream fis = new FileInputStream("config/defecto.properties");
        Properties defaultProps = new Properties();
        
        defaultProps.load(fis);
        String url = defaultProps.getProperty("dataSource");
        
        adaptador = new Adaptador(url);
        
        Scanner teclado = new Scanner(System.in);
//        System.out.print("Introduzca el nombre del autor: ");
//        String nombre = teclado.nextLine();
//        Autor a = new Autor(nombre);
//        a.alta();
        
        System.out.print("Introduzca el titulo de la obra: ");
        String titulo = teclado.nextLine();
        System.out.print("Introduzca el año de la obra: ");
        int anyo = teclado.nextInt();
        Obra o = new Obra(titulo,anyo);
        o.alta();
        
        adaptador.cerrarConexion();
        
    }
    
}
