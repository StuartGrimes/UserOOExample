package StuartGrimes;

import java.util.Date;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private Scanner someInput;
    private Date today;

    public static void main( String[] args )
    {
        App anApp = new App();
    }

    public App(){

        this.someInput = new Scanner(System.in);

        sayHi();

        System.out.println("\n Press enter to exit the program.");
        this.someInput.nextLine();

        System.exit(0);
    }

    private void sayHi(){
        this.today = new Date();
        System.out.println("App says hi at " + today);
    }


}
