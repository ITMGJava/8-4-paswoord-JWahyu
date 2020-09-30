import java.util.Timer;
import java.util.TimerTask;

// Timer van 60 seconden.

public class Countdown {
    Timer timer;

    public Countdown(int seconds) {
        timer = new Timer();
        timer.schedule(new countTime(), seconds*1000);
    }

    class countTime extends TimerTask {
        public void run() {
            System.out.printf("%nU mag weer inloggen!%n");
            timer.cancel(); //Terminate the timer thread
        }
    }

    public static void main(String args[]) {
        new Countdown(5);
        System.out.printf("%nU hebt helaas drie keer een verkeerde gebruikersnaam of wachtwoord ingetoetst.%n" +
                "Wacht maar lekker vijf seconden! :)%n");
    }
}