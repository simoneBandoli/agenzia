public class simulazioneViaggi {

    public static void main(String[] args) {
        // Crea i gruppi
        gruppo francesi = new gruppo("francesi");
        gruppo tedeschi = new gruppo("tedeschi");
        gruppo spagnoli = new gruppo("spagnoli");

        // Crea il traghetto e i log
        traghetto traghetto = new traghetto();
        viaggio viaggi = new viaggio();

        try {
            //trasporto dei gruppi
            traghetto.trasportaGruppo(francesi);
            viaggi.aggiungiViaggio("Francesi - Partenza, Imbarco e Arrivo all'isola");

            traghetto.trasportaGruppo(tedeschi);
            viaggi.aggiungiViaggio("Tedeschi - Partenza, Imbarco e Arrivo all'isola");

            traghetto.trasportaGruppo(spagnoli);
            viaggi.aggiungiViaggio("Spagnoli - Partenza, Imbarco e Arrivo all'isola");

            //log dei viaggi 
            viaggi.scriviLog();

        } catch (InterruptedException e) {
            System.out.println("Errore nell'esecuzione del viaggio.");
        }
    }
}
