import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest {

    @Test
    public void LoginSucccesful() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.trendyol.com/giris");
        //driver.manage().window().fullscreen();
        driver.findElement(By.id("login-email")).sendKeys("ahmetok2861@gmail.com");
        driver.findElement(By.name("login-password")).sendKeys("118119270543.Ok");
        driver.findElement(By.cssSelector("[class='q-primary q-fluid q-button-medium q-button submit']")).click();
        Thread.sleep(5000);
        String text = driver.findElements(By.cssSelector("[class='link-text']")).get(0).getText();
        System.out.println(text);
        Assert.assertEquals(text, "Hesabım");
    }
    @Test
    public void LoginSucccesfulLawyer(){
        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://localhost:7109/Admin/Auth/Login");
        driver2.findElement(By.name("Email")).sendKeys("ahmetok2861@gmail.com");
        driver2.findElement(By.name("Password")).sendKeys("123456789");
        driver2.findElement(By.cssSelector("[class='btn btn-primary w-100']")).click();


    }

    @Test
    public void LawyerBlogCommentAdd() throws InterruptedException {
        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://localhost:7109");
        Thread.sleep(5000);
        driver2.findElements(By.cssSelector("[class='nav-link']")).get(3).click();
        Thread.sleep(5000);

        driver2.findElements(By.cssSelector("[class='d-inline-block']")).get(2).click();
        Thread.sleep(5000);
        driver2.findElement(By.name("CommentContent")).sendKeys("Selenium Test");
        driver2.findElement(By.name("CommentUserName")).sendKeys("Ahmet ÖK");
        driver2.findElement(By.name("CommentUserEmail")).sendKeys("ahmetok2861@gmail.com");
        driver2.findElement(By.cssSelector("[class='button button-contactForm btn_4 mt-3']")).click();


    }
}
