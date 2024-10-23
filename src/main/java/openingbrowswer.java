import org.openqa.selenium.chrome.ChromeDriver;

public class openingbrowswer {
    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://www.bbc.com/");

        //Maximize Browser
        chromeDriver.manage().window().maximize();

        //Getting the title of webpage
        String pageTitle = chromeDriver.getTitle();
        System.out.println("\nThis is the page title: \n" + pageTitle);

        //Closing the browser
        chromeDriver.quit();


    }
}
