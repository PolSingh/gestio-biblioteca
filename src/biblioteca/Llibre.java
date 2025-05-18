public class Llibre {
    // Títol del llibre
    private String titol;

    // Autor del llibre
    private String autor;

    // Estat del llibre: true si està en préstec, false si esta disponible
    private boolean prestat;

    /**
     * Constructor per crear un llibre nou.
     * Per defecte, el llibre no està en préstec.
     *
     * @param titol Títol del llibre
     * @param autor Autor del llibre
     */
    public Llibre(String titol, String autor) {
        this.titol = titol;
        this.autor = autor;
        this.prestat = false;
    }

    // Getter per obtenir el títol
    public String getTitol() {
        return titol;
    }

    // Setter per modificar el títol
    public void setTitol(String titol) {
        this.titol = titol;
    }

    // Getter per obtenir l'autor
    public String getAutor() {
        return autor;
    }

    // Setter per modificar l'autor
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Indica si el llibre està prestat o no
    public boolean esPrestat() {
        return prestat;
    }

    // Marca el llibre com a prestat
    public void prestar() {
        prestat = true;
    }

    // Marca el llibre com a retornat (disponible)
    public void retornar() {
        prestat = false;
    }

    // Retorna una descripció del llibre
    @Override
    public String toString() {
        return titol + " de " + autor + (prestat ? " (En préstec)" : " (Disponible)");
    }
}
