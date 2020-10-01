import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Paswoord {
    public static void main(String[] args) {

        // Maak een werkende login systeem.

        System.out.printf("%n――――――――――――――――――――――――%n");
        System.out.printf("<<< Welkom bij Gave Systeem 3000+! >>>%n");
        System.out.printf("――――――――――――――――――――――――%n");
        System.out.printf("Om in ons systeem te kunnen loggen dan heb je een gebruikersnaam met bijbehorende wachtwoord nodig.%n" +
                "%nOp dit moment beschikken wij over drie gebruikersaccounts waaronder:%n" +
                "1. Voormalige president van de Verenigde Staten in 2009 tot 2017.%n" +
                "2. The King of Pop.%n" +
                "3. Een van de meest beroemdste wetenschapper dankzij zijn relativiteitstheorie.%n" +
                "Hint: Hun voornamen zijn eveneens de gebruikersnamen met hun bijbehorende achternamen als wachtwoorden. Wel de correcte case gebruiken voor hun 'Namen' a.u.b.!%n");

        var count = 0;
        boolean check = false;
        var userName1 = "Barack";
        var userName2 = "Michael";
        var userName3 = "Albert";

        while (!check) {
            System.out.printf("%nVoer a.u.b. uw gebruikersnaam in:%n");
            var input = new Scanner(System.in);
            var inputUsername = input.next();

            // Gebruiker 1.

            if (inputUsername.equals(userName1)) {
                System.out.printf("Correct! Gebruiker %s gevonden.%n", inputUsername);
                var password1 = "Obama";
                System.out.printf("%nVoer nu uw wachtwoord in:%n");
                var inputPassword = input.next();
                if (inputPassword.equals(password1)) {
                    System.out.printf("%nProficiat! U bent nu ingelogd als gebruiker %s.%n", inputUsername);
                    check = true;
                }
            }

            // Gebruiker 2.

            else
                if (inputUsername.equals(userName2)) {
                    System.out.printf("Correct! Gebruiker %s gevonden!%n", inputUsername);
                    var password2 = "Jackson";
                    System.out.printf("%nVoer nu uw wachtwoord in:%n");
                    var inputPassword = input.next();
                    if (inputPassword.equals(password2)) {
                        System.out.printf("%nProficiat! U bent nu ingelogd als gebruiker %s.%n", inputUsername);
                        check = true;
                    }
                }

                // Gebruiker 3.

                else
                if (inputUsername.equals(userName3)) {
                    System.out.printf("Correct! Gebruiker %s gevonden!%n", inputUsername);
                    var password3 = "Einstein";
                    System.out.printf("%nVoer nu uw wachtwoord in:%n");
                    var inputPassword = input.next();
                    if (inputPassword.equals(password3)) {
                        System.out.printf("%nProficiat! U bent nu ingelogd als gebruiker %s.%n", inputUsername);
                        check = true;
                    }
                }

                // Einde gebruikers.

                else {
                if (count == 2) {
                System.out.printf("%nU hebt helaas drie keer een verkeerde gebruikersnaam of wachtwoord ingetoetst.%n" +
                        "Wacht maar lekker één minuutje! :)%n");
                Countdown obj;

//                    Scanner input = new Scanner(System.in);
//                    System.out.print("Input seconds => : ");
//                    interval = input.nextInt();
//                    int delay = 1000;
//                    int period = 1000;
//                    final Timer time = new Timer();
//                    System.out.println(interval);
//                    time.scheduleAtFixedRate(new TimerTask() {
//
//                        public void run() {
//                            if (interval == 0) {
//                                System.out.println("work finished");
//                                time.cancel();
//                                time.purge();
//                            } else {
//                                System.out.println(setInterval());
//                            }
//                        }
//                    }, delay, period);
//
            }
                System.out.printf("Helaas was uw invoer niet correct!%n");
                count++;
            }
        }

    }
}


