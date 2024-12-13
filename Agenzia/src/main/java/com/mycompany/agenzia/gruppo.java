
public class gruppo {
    String nazionalita;
    int numTuristi;
    String status;

    public gruppo(String nazionalita) {
        this.nazionalita = nazionalita;
        this.numTuristi = 25;
        this.status = "in viaggio";
    }

    public void arrivaAlPorto() {
        status = "arrivato al porto";
        System.out.println(nazionalita.substring(0, 1).toUpperCase() + nazionalita.substring(1) + " arrivano al porto.");
    }

    public void pagaBiglietto() {
        status = "pagato il biglietto";
        System.out.println(nazionalita.substring(0, 1).toUpperCase() + nazionalita.substring(1) + " pagano il biglietto.");
    }

    public void imbarca() {
        status = "imbarcato";
        System.out.println(nazionalita.substring(0, 1).toUpperCase() + nazionalita.substring(1) + " salgono sul traghetto.");
    }

    public void partenzaIsola() {
        status = "partiti per l'isola";
        System.out.println(nazionalita.substring(0, 1).toUpperCase() + nazionalita.substring(1) + " partono per l'isola.");
    }

    public void ritornaAlPorto() {
        status = "ritornati al porto";
        System.out.println(nazionalita.substring(0, 1).toUpperCase() + nazionalita.substring(1) + " ritorna al porto.");
    }
}
