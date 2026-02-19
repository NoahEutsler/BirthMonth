import java.util.Scanner;

public class main {
    void main() {
        int storedVal;
        Scanner birthMonth = new Scanner(System.in);
        System.out.print("Please enter your birth month as an integer: ");
        storedVal = birthMonth.nextInt();
        if(storedVal > 0) {
            if(storedVal <= 12){
                System.out.println("Your birth month is: " + storedVal + ".");
            }
            else {
                System.out.println("You entered an incorrect month value: " + storedVal + ".");

            }
        }
        else{
            System.out.println("You entered an incorrect month value: " + storedVal + ".");
        }
    }
}
