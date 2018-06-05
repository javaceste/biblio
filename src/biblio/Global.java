
package biblio;

public class Global {
    
    public String obtenerCadenaAleatoria(int longitud) {
        String str = "";
        String letrasPosibles = "ABCDEFGHIJKLMNOPQRSTUVXYZ";

        for (int i = 0; i < longitud; i++) {
            int posLetra = (int) (letrasPosibles.length() * Math.random()) + 1;
            char aleatorio = letrasPosibles.charAt(posLetra);
            str = str + aleatorio;
        }
        return str;

    }
    
}
