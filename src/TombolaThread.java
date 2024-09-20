import java.util.concurrent.TimeUnit;
import java.util.Random;
public class TombolaThread extends Thread {
    Random r = new Random ();
    String nomeTombola;
   public void creaNome(String nome){
       nomeTombola = nome;
   }


    public void pescaNumero() {

        int numeroPescato = 1 + r.nextInt(90);

        System.out.println(nomeTombola + ":numero pescato nella "+  + numeroPescato);
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch(Exception e) {
            System.out.println(e);
        }

    }

    public void run() {
        while(true) {
            pescaNumero();
        }
    }

    public static void main(String[] args) {
        TombolaThread p1 = new TombolaThread();
        TombolaThread p2 = new TombolaThread();

        p1.creaNome("tombola1");
        p2.creaNome("tombola2");

        p1.start();
        p2.start();
        System.out.println("Premere ENTER per chiudere");

    }
}