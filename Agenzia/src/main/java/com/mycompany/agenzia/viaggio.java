import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class viaggio {
    List<String> logViaggi = new ArrayList<>();

    public void aggiungiViaggio(String viaggio) {
        logViaggi.add(viaggio);
    }

    public void scriviLog() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("viaggi.txt", true))) {
            writer.println("Data: " + java.time.LocalDate.now());
            for (String viaggio : logViaggi) {
                writer.println(viaggio);
            }
        } catch (IOException e) {
            System.out.println("Errore nel scrivere il file di log.");
        }
    }
}
