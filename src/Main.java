import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables defined
        int remain, birthYear;
        String zodiac = "";

        //New scanner created.
        Scanner inp = new Scanner(System.in);

        //Data retrieved from user.
        System.out.print("Please enter the year of birth : ");
        birthYear = inp.nextInt();

        //Calculation for chinese zodiac.
        remain = birthYear %12;

        switch (remain) {
            case 0:
                zodiac = "Monkey";
                break;
            case 1:
                zodiac = "Rooster";
                break;
            case 2:
                zodiac = "Dog";
                break;
            case 3:
                zodiac = "Pig";
                break;
            case 4:
                zodiac = "Rat";
                break;
            case 5:
                zodiac = "Ox";
                break;
            case 6:
                zodiac = "Tiger";
                break;
            case 7:
                zodiac = "Rabbit";
                break;
            case 8:
                zodiac = "Dragon";
                break;
            case 9:
                zodiac = "Snake";
                break;
            case 10:
                zodiac = "Horse";
                break;
            case 11:
                zodiac = "Goat";
                break;
        }
        //If remain is less than 0 it gives error.
        if (remain < 0){

            System.out.println("Please check your year of birth");

        }else {
            //Result printed.
            System.out.println("Your chinese zodiac is : " + zodiac);

        }
    }
}