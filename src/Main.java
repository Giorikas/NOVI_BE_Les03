import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // VARS
        Integer[] arrNum = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] arrNumVoluit = {"nul", "één", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen"};
        boolean correctInput = false;

        // OBJECTS
        Translator vertaler = new Translator(arrNum, arrNumVoluit);
        int inputDictionary = readInput();
        while (correctInput=false){
            inputDictionary = readInput();
            System.out.println("chosen number = " + inputDictionary);
            if ((inputDictionary < 0)||(inputDictionary >9)){correctInput=false;}else {correctInput=true;};
        }
        String numWritten = vertaler.numDictionary(inputDictionary);
    }

    public static int readInput() {

        System.out.println("Enter number 0-9 you want to see written in dutch.");
        Scanner scInt = new Scanner(System.in);

        while (!scInt.hasNextInt()) {
            System.out.println("Just enter 0, 1, 2, 3, 4, 5, 6, 7, 8 or 9.");
            scInt.next();
        }
        return scInt.nextInt();

    }


        /* deze regel mag je weg halen voor de bonus opdracht. Onderstaande code is voor de bonus opdracht.
        HashSet<Integer> secretnumber = randomnumbergenerator();
        String stringnumber =  setToStringConverter(secretnumber);
        System.out.println(stringnumber);
        feedback();
         deze regel mag je weg halen voor de bonus opdracht */


    /*
     Deze methode is voor de bonus opdracht.
     */
    public static void feedback(String stringnumber) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder feedback = new StringBuilder();
        System.out.println("take a guess");
        String guess = scanner.nextLine();
        if (Objects.equals(guess, stringnumber)) {
            System.out.println("gefeliciteerd je hebt het goed");
        } else {
            for (int i = 0; i < 4; i++) {
                if (guess.substring(i, i + 1).equals(stringnumber.substring(i, i + 1))) {
                    feedback.append("+");
                } else if (stringnumber.contains(guess.substring(i, i + 1))) {
                    feedback.append("0");
                } else {
                    feedback.append("X");
                }
            }
        }
        System.out.println(feedback.toString());
    }
}
