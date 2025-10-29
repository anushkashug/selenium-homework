
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class CommandsTest {
public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

    driver.manage().window().maximize();

    driver.get("http://the-internet.herokuapp.com/dynamic_controls");

    System.out.println("Page opened successfully!");



    WebElement enableButton = driver.findElement(By.xpath("//button[text()='Enable']"));
    enableButton.click();

    wait.until(ExpectedConditions.textToBePresentInElement(enableButton, "Disable"));
    String buttonText = enableButton.getText();git init
    git branch -M main

    if (buttonText.equals("Disable")) {
        System.out.println(" Button text changed ");
    } else {
        System.out.println(" Button text did not change" + buttonText);
    }




    WebElement inputField = driver.findElement(By.xpath("//input[@type='text']"));

    inputField.sendKeys("Bootcamp");
    System.out.println("Text 'Bootcamp' entered in the input field.");



    inputField.clear();





    driver.get("http://the-internet.herokuapp.com/drag_and_drop");



    WebElement columnA = driver.findElement(By.id("column-a"));
    WebElement columnB = driver.findElement(By.id("column-b"));


    int yA = columnA.getLocation().getY();
    int yB = columnB.getLocation().getY();
    if (yA == yB) {
        System.out.println(" Columns A and B aligned ");
    } else {
        System.out.println(" Columns not aligned (A: " + yA + ", B: " + yB + ")");
    }


}
}