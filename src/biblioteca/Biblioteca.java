import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Llibre> llibres;

    // Constructor crea una llista buida de llibres
    public Biblioteca() {
        this.llibres = new ArrayList<>();
    }

    // Afegeix un llibre a la biblioteca
    public void afegirLlibre(Llibre llibre) {
        llibres.add(llibre);
    }

    // Busca un llibre pel seu titol (sense diferenciar majúscules/minúscules)
    public Llibre buscarLlibre(String titol) {
        for (Llibre llibre : llibres) {
            if (llibre.getTitol().equalsIgnoreCase(titol)) {
                return llibre;
            }
        }
        return null; // Si no es troba el llibre retorna null
    }

    // Retorna la llista completa de llibres
    public List<Llibre> getLlibres() {
        return llibres;
    }
}
