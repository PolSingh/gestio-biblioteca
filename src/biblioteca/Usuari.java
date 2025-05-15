import java.util.ArrayList;
import java.util.List;

public class Usuari {
    // Nom del lector/usuari de la biblioteca
    private String nom;

    // Llista de llibres que l'usuari té actualment en préstec
    private List<Llibre> llibresPrestats;

    /**
     * Constructor de la classe Usuari.
     * Inicialitza el nom i crea una llista buida de llibres prestats.
     * @param nom Nom de l’usuari
     */
    public Usuari(String nom) {
        this.nom = nom;
        this.llibresPrestats = new ArrayList<>();
    }

    // Getter per obtenir el nom de l'usuari
    public String getNom() {
        return nom;
    }

    // Setter per canviar el nom de l'usuari
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Retorna la llista de llibres prestats per aquest usuari
    public List<Llibre> getLlibresPrestats() {
        return llibresPrestats;
    }

    /**
     * Afegeix un llibre a la llista de llibres prestats
     * @param llibre Llibre que s'ha prestat
     */
    public void afegirLlibre(Llibre llibre) {
        llibresPrestats.add(llibre);
    }

    /**
     * Elimina un llibre de la llista de llibres prestats (quan es retorna)
     * @param llibre Llibre retornat
     */
    public void retornarLlibre(Llibre llibre) {
        llibresPrestats.remove(llibre);
    }

    /**
     * Retorna una descripció en text de l’usuari (útil per imprimir)
     */
    @Override
    public String toString() {
        return "Usuari: " + nom;
    }
}
