import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class tek_retail_app {
    public static void main(String[] args) {

        ChromeDriver EdgeDriver = new ChromeDriver();
        EdgeDriver.get("https://dev.retail.tekschool-students.com/");
        EdgeDriver.manage().window().maximize();

        String pageTitle = EdgeDriver.getTitle();
        System.out.println("\nThis is the page title: \n" + pageTitle);

        EdgeDriver edgeDriver = new EdgeDriver();
        EdgeDriver.get("https://dev.retail.tekschool-students.com/");
        EdgeDriver.manage().window().maximize();

        String pageTitle2 = EdgeDriver.getTitle();
        System.out.println("\nThis is the page title: \n" + pageTitle2);

    }
}
