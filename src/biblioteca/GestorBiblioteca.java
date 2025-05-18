import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorBiblioteca {
    // Llista que guarda tots els préstecs realitzats
    private List<Prestec> prestecs;

    /**
     * Constructor que inicialitza la llista de préstecs.
     */
    public GestorBiblioteca() {
        this.prestecs = new ArrayList<>();
    }

    /**
     * Metode per prestar un llibre a un usuari.
     * Si el llibre no està prestat, es crea un nou préstec i s'afegeix a la llista.
     * També es marca el llibre com a prestat i es relaciona amb el usuari.
     *
     * @param usuari L'usuari que demana el llibre
     * @param llibre El llibre que es vol prestar
     */
    public void prestarLlibre(Usuari usuari, Llibre llibre) {
        if (!llibre.esPrestat()) {
            // Marquem el llibre com a prestat
            llibre.prestar();

            // Creem el préstec amb la data actual
            Prestec prestec = new Prestec(usuari, llibre, LocalDate.now());

            // Afegim el préstec a la llista de préstecs
            prestecs.add(prestec);

            // Afegim el llibre a la llista de llibres prestats per aquest usuari
            usuari.afegirLlibre(llibre);

            // Mostrem confirmació per pantalla
            System.out.println(usuari.getNom() + " ha agafat el llibre: " + llibre.getTitol());
        } else {
            // Si el llibre ja està prestat, mostrem un missatge
            System.out.println("Aquest llibre ja està prestat.");
        }
    }

    /**
     * Getter per obtenir la llista de préstecs
     */
    public List<Prestec> getPrestecs() {
        return prestecs;
    }
}


