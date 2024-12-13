import java.util.concurrent.TimeUnit;
import java.util.Random;

public class traghetto {

    public void trasportaGruppo(gruppo gruppo) throws InterruptedException {
        System.out.println("\nPartenza dal porto per " + gruppo.nazionalita);
        gruppo.arrivaAlPorto();
        gruppo.pagaBiglietto();
        gruppo.imbarca();
        gruppo.partenzaIsola();

        //viaggio< 2- 5 secondi
        Random random = new Random();
        int viaggioDurata = random.nextInt(4) + 2; //2 e 5
        TimeUnit.SECONDS.sleep(viaggioDurata);

        gruppo.ritornaAlPorto();
    }
}


