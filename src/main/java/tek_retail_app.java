import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

public class tek_retail_app {
    public static void main(String[] args) {

        Scanner yourscanner = new Scanner(System.in);
        System.out.println("\nplease choose browser: ");
        int userChoice = yourscanner.nextInt();

        if (userChoice == 1 ) {
            ChromeDriver chromeDriver = new ChromeDriver();
            chromeDriver.get("https://dev.retail.tekschool-students.com/");
            chromeDriver.manage().window().maximize();

            String pageTitle = chromeDriver.getTitle();
            System.out.println("\nThis is the page title: \n" + pageTitle);

            chromeDriver.quit();
        }
        else if (userChoice == 2 ) {
            EdgeDriver edgeDriver = new EdgeDriver();
            edgeDriver.get("https://dev.retail.tekschool-students.com/");
            edgeDriver.manage().window().maximize();

            String pageTitle2 = edgeDriver.getTitle();
            System.out.println("\nThis is the page title: \n" + pageTitle2);

            edgeDriver.quit();
        }
    }

}
