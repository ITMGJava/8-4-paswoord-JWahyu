// import java.util.Arrays;
import java.util.Scanner;


public class Paswoord {
    public static void main(String[] args) throws InterruptedException {

        // Maak een werkende login systeem.
        System.out.printf("%n―――――――――――――――――――――――――――%n");
        System.out.print("<<< Welkom bij GAVE INLOG SYSTEEM 3000! >>>");
        System.out.printf("%n―――――――――――――――――――――――――――%n");

        // Scanfuncties definiëren.
        var input = new Scanner(System.in);

//        // INITIALISATIE ARRAY EXPERIMENT.
//        // Array gebruiker definiëren.
//        String[] username1 = new String[5];
//
//        // Invoer gebruiker in array.
//        for (int i = 0; i < 2; i++) {
//            username1[i] = input.nextLine();
//        }
//
//        // Gebruikers weergeven.
//        System.out.println(Arrays.toString(username1));

//        boolean inputEnd = false;
//        int index = 0;
//        while (!inputEnd && input.hasNextLine()) {
//
//            String sentence = input.nextLine();

//            inputEnd = true;

//            {
//                username[index] = input.nextLine();
//                index++;
//                for (int i = 0; i < username.length-1; i++) {
//                    String words = username[i];
//                    if(words != null) {
//                        System.out.println(words);
        // EINDE ARRAY EXPERIMENT.


        // INITIALISATIE OPTIE INLOGSYSTEEM MET LEGE DATABASE.

        // Intro optie inlogsysteem lege database.
        System.out.printf("%nUw database van gebruikers is op dit moment nog leeg. Graag deze aanmaken a.u.b.%n");

        // Invoer nieuwe gebruikersnaam.
        System.out.printf("%nVoer a.u.b. een gewenste gebruikersnaam in:%n");
        var user1 = input.next();

        // Invoer nieuwe wachtwoord.
        System.out.printf("%nHoi %s! Voer nu een gewenste wachtwoord in:%n", user1);
        var password1 = input.next();

        // Bevestig wachtwoord.
        boolean checkPasswordCreate = false;
        int attemptPasswordCreate = 3;
        while (!checkPasswordCreate) {
            if (attemptPasswordCreate != 0) {
                    System.out.printf("%nBevestig het door u ingevoerde wachtwoord:%n");
                    var confirmPassword = input.next();

                    if (confirmPassword.equals(password1)) { // Wachtwoord bevestiging: komen WEL overeen.
                        System.out.printf("Succes! Uw gebruikersnaam met bijbehorende wachtwoord is aangemaakt. Onthoud ze goed!%n");
                        checkPasswordCreate = true;
                    } else { // Wachtwoord bevestiging: komen NIET overeen.
                        attemptPasswordCreate--;
                        System.out.printf("Uw wachtwoorden komen niet overeen. U hebt nog %d poging(en) over!%n", attemptPasswordCreate);
                        checkPasswordCreate = false;
                    }

            } // Einde if (attemptPasswordCreate != 0)

            else { // Bevestiging wachtwoord: incorrect x3 = wacht 5 seconden.
                System.out.printf("%nU hebt helaas 3 keer een verkeerde wachtwoord ingevuld.%n" +
                                "Wacht maar lekker 5 seconden! :)%n");
                Thread.sleep(5000);
                attemptPasswordCreate = attemptPasswordCreate + 3;
                checkPasswordCreate = false;
                }

        } // Einde while (!checkPasswordCreate)

        System.out.printf("%n―――――――――――――――――――――――――――――%n");
        System.out.print("U kunt nu inloggen met uw aangemaakte account!");
        System.out.printf("%n―――――――――――――――――――――――――――――%n");

        // Inloggen met ingevoerde gebruikersnaam en wachtwoord.
        int attemptUsername = 3;
        boolean checkUsername = false;
        while (!checkUsername) {
            if (attemptUsername != 0) { // Invoer bestaande gebruiker.
                System.out.printf("%nVoer a.u.b. uw bestaande gebruikersnaam in:%n");
                var confirmUsername = input.next();

                if (confirmUsername.equals(user1)) { // Invoer bestaande gebruiker: correct.
                    System.out.printf("Welkom terug %s!%n", user1);
                    checkUsername = true;

                    // Bevestig wachtwoord als Nested While Loop
                    int attemptPassword = 3;
                    boolean checkPassword = false;
                    while (!checkPassword) {
                        if (attemptPassword != 0) { // Invoer bijbehorende wachtwoord.
                            System.out.printf("%nVoer nu het bijbehorende wachtwoord in voor gebruiker %s:%n", user1);
                            var confirmPassword = input.next();

                            if (confirmPassword.equals(password1)) { // Invoer bijbehorende wachtwoord: correct.
                                System.out.printf("Succes! U bent nu ingelogd als gebruiker %s.%n", user1);
                                checkPassword = true;
                            } else { // Invoer bijbehorende wachtwoord: incorrect.
                                attemptPassword--;
                                System.out.printf("Incorrect wachtwoord. Probeer het nogmaals. U hebt nog %d poging(en) over!%n", attemptPassword);
                                checkPassword = false;
                            }
                        } else { // Invoer wachtwoord: incorrect x3 = wacht 5 seconden.
                                System.out.printf("%nU hebt helaas 3 keer een verkeerde wachtwoord ingevuld.%n" +
                                        "Wacht maar lekker 5 seconden! :)%n");
                                Thread.sleep(5000);
                                attemptPassword = attemptPassword + 3;
                                checkPassword = false;
                        }
                    } // Einde while (!checkPassword)

                } else { // Invoer bestaande gebruiker: incorrect.
                    attemptUsername--;
                    System.out.printf("Gebruiker niet gevonden! Probeer het nogmaals. U hebt nog %d poging(en) over!%n", attemptUsername);
                    checkUsername = false;
                }
            } else { // Invoer wachtwoord: incorrect x3 = wacht 5 seconden.
                System.out.printf("%nU hebt helaas 3 keer een verkeerde gebruikersnaam ingevuld.%n" +
                        "Wacht maar lekker 5 seconden! :)%n");
                Thread.sleep(5000);
                attemptUsername = attemptUsername + 3;
                checkUsername = false;
            }
        } // Einde while (!checkUsername);

        System.out.printf("%n―――――――――――――――――――――――――――――――――%n");
        System.out.print("<<< GAVE INLOG SYSTEEM 3000 wordt nu afgesloten. >>>");
        System.out.printf("%n―――――――――――――――――――――――――――――――――%n");
        // EINDE OPTIE INLOGSYSTEEM MET LEGE DATABASE.

    } // Einde public static void main.
} // Einde public class Paswoord.