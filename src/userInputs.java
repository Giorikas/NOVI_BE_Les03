import java.util.Scanner;
public class userInputs {



    private static boolean theShowMustGoOn() {
        Scanner sc = new Scanner(System.in);
        System.out.print("|    Do you wish to go another round (Y/N)?      | >>");
        String striiing = sc.next();
        String str = striiing.toUpperCase();
        System.out.println(str);

        while (!(str.equals("N")) && !(str.equals("Y"))) {
            System.out.println("Invalid input\nY or N will suffice...");
            str =sc.nextLine();
            System.out.println(str);
        }
        if (str.equals("Y")){
            return true;}
        else{
            return false;}

    }


}
