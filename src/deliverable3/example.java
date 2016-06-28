package deliverable3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example {

    public static void main(String[] args) {

       //Create a new instance of Firefox Browser
       WebDriver driver = new FirefoxDriver();

       //Open the URL in firefox browser
       driver.get("http://halley.exp.sis.pitt.edu/comet/index.do");

       //Maximize the Browser window
       driver.manage().window().maximize();

       //Get the current page URL and store the value in variable 'str'
       String str = driver.getCurrentUrl();

       //Print the value of variable in the console
       System.out.println("The current URL is " + str);
       
       
   }
}
