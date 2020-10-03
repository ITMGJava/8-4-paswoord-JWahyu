import java.util.Scanner;

public class PaswoordBestaandeGebruikers {
    public static void main(String[] args) throws InterruptedException {

        // Maak een werkende login systeem.
        System.out.printf("%n―――――――――――――――――――――――――――%n");
        System.out.print("<<< Welkom bij GAVE INLOG SYSTEEM 3000! >>>");
        System.out.printf("%n―――――――――――――――――――――――――――%n");

        // Scanfuncties definiëren.
        var input = new Scanner(System.in);

        // INITIALISATIE OPTIE BESTAANDE GEBRUIKERS.

        // Intro optie bestaande gebruikers..
        System.out.printf("Om in ons systeem te kunnen loggen dan heb je een gebruikersnaam met bijbehorende wachtwoord nodig.%n" +
                "%nOp dit moment beschikken wij over drie gebruikersaccounts waaronder:%n" +
                "1. Voormalige president van de Verenigde Staten in 2009 tot 2017.%n" +
                "2. The King of Pop.%n" +
                "3. Een van de meest beroemdste wetenschapper dankzij zijn relativiteitstheorie.%n" +
                "Hint: Hun voornamen zijn eveneens de gebruikersnamen met hun bijbehorende achternamen als wachtwoorden.%n");

        // Definieer bestaande gebruikers.
        var usernameExisting1 = "Barack";
        var usernameExisting2 = "Michael";
        var usernameExisting3 = "Albert";

        // Definieer bestaande gebruikers.
        int attemptPredefined = 3;
        boolean checkPredefined = false;
        while (!checkPredefined) {
            if (attemptPredefined != 0) {
                System.out.printf("%nU hebt nog %d poging(en) over! Voer a.u.b. uw gebruikersnaam in:%n", attemptPredefined);
                var inputUsernameExisting = input.next();

                // Gebruiker 1.
                if (inputUsernameExisting.equals(usernameExisting1)) {
                    System.out.printf("Correct! Gebruiker %s gevonden.%n", inputUsernameExisting);
                    var passwordExisting1 = "Obama";
                    System.out.printf("%nU hebt nog %d poging(en) over! Voer nu uw wachtwoord in:%n", attemptPredefined);
                    var inputPasswordExisting = input.next();
                    if (inputPasswordExisting.equals(passwordExisting1)) {
                        System.out.printf("Proficiat! U bent nu ingelogd als gebruiker %s.%n", inputUsernameExisting);
                        checkPredefined = true;
                    } else {
                        System.out.printf("Incorrecte wachtwoord. Probeer het nogmaals.%n");
                        attemptPredefined--;
                        checkPredefined = false;
                    }
                }

                // Gebruiker 2.

                else
                if (inputUsernameExisting.equals(usernameExisting2)) {
                    System.out.printf("Correct! Gebruiker %s gevonden!%n", inputUsernameExisting);
                    var passwordExisting2 = "Jackson";
                    System.out.printf("%nU hebt nog %d poging(en) over! Voer nu uw wachtwoord in:%n", attemptPredefined);
                    var inputPasswordExisting = input.next();
                    if (inputPasswordExisting.equals(passwordExisting2)) {
                        System.out.printf("Proficiat! U bent nu ingelogd als gebruiker %s.%n", inputUsernameExisting);
                        checkPredefined = true;
                    } else {
                        System.out.printf("Incorrecte wachtwoord. Probeer het nogmaals.%n");
                        attemptPredefined--;
                        checkPredefined = false;
                    }
                }

                // Gebruiker 3.

                else
                if (inputUsernameExisting.equals(usernameExisting3)) {
                    System.out.printf("Correct! Gebruiker %s gevonden!%n", inputUsernameExisting);
                    var passwordExisting3 = "Einstein";
                    System.out.printf("%nU hebt nog %d poging(en) over! Voer nu uw wachtwoord in:%n", attemptPredefined);
                    var inputPasswordExisting = input.next();
                    if (inputPasswordExisting.equals(passwordExisting3)) {
                        System.out.printf("Proficiat! U bent nu ingelogd als gebruiker %s.%n", inputUsernameExisting);
                        checkPredefined = true;
                    } else {
                        System.out.printf("Incorrecte wachtwoord. Probeer het nogmaals.%n");
                        attemptPredefined--;
                        checkPredefined = false;
                    }
                }

                // Einde gebruikers.

                else {
                    attemptPredefined--;
                    System.out.printf("Incorrecte gebruikersnaam. Probeer het nogmaals. U hebt nog %d poging(en) over!%n", attemptPredefined);
                    checkPredefined = false;
                }

            } // Einde if (attemptPredefined != 0)

            else {
                System.out.printf("%nU hebt helaas 3 keer een verkeerde gebruikersnaam of wachtwoord ingetoetst.%n" +
                        "Wacht maar lekker 5 seconden! :)%n");
                Thread.sleep(5000);
                attemptPredefined = attemptPredefined + 3;
                checkPredefined = false;
            }

        } // Einde while (!checkPredefined);

        System.out.printf("%n―――――――――――――――――――――――――――――――――%n");
        System.out.print("<<< GAVE INLOG SYSTEEM 3000 wordt nu afgesloten. >>>");
        System.out.printf("%n―――――――――――――――――――――――――――――――――%n");
        // EINDE OPTIE BESTAANDE GEBRUIKERS.

    } // Einde public static void main.
} // Einde public class Paswoord.

