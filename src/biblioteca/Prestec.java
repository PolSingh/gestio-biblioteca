import java.time.LocalDate;

public class Prestec {
    // Usuari que fa el prestec
    private Usuari usuari;

    // Llibre que es presta
    private Llibre llibre;

    // Data en què s'ha fet el préstec
    private LocalDate dataPrestec;

    // Data límit per retornar el llibre (2 setmanes desprée del préstec)
    private LocalDate dataRetorn;

    /**
     * Constructor de Prestec.
     * @param usuari L'usuari que agafa el llibre en préstec.
     * @param llibre El llibre prestat.
     * @param dataPrestec La data en què es fa el préstec.
     */
    public Prestec(Usuari usuari, Llibre llibre, LocalDate dataPrestec) {
        this.usuari = usuari;
        this.llibre = llibre;
        this.dataPrestec = dataPrestec;
        // Assigna la data de retorn 2 setmanes després del préstec
        this.dataRetorn = dataPrestec.plusWeeks(2);
    }

    // Getter per obtenir l'usuari del préstec
    public Usuari getUsuari() {
        return usuari;
    }

    // Getter per obtenir el llibre prestat
    public Llibre getLlibre() {
        return llibre;
    }

    // Getter per obtenir la data límit de retorn del llibre
    public LocalDate getDataRetorn() {
        return dataRetorn;
    }
}
