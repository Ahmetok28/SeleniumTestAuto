import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {




    @Test
    public void LoginSucccesful() throws InterruptedException {

        driver.findElement(By.id("login-email")).sendKeys(Email);
        driver.findElement(By.name("login-password")).sendKeys(Password);
        driver.findElement(By.cssSelector("[class='q-primary q-fluid q-button-medium q-button submit']")).click();
        Thread.sleep(5000);
        String text = driver.findElements(By.cssSelector("[class='link-text']")).get(0).getText();
        System.out.println(text);
        Assert.assertEquals(text, "Hesabım");

    }

    @Test
    public void LoginFailed() throws InterruptedException {

        driver.findElement(By.id("login-email")).sendKeys(Email);
        driver.findElement(By.name("login-password")).sendKeys("11811943.Ok");
        driver.findElement(By.cssSelector("[class='q-primary q-fluid q-button-medium q-button submit']")).click();
        Thread.sleep(5000);
        System.out.println( driver.findElement(By.cssSelector("[class='message']")).getText());
        Assert.assertEquals(driver.findElement(By.cssSelector("[class='message']")).getText(),"E-posta adresiniz ve/veya şifreniz hatalı.");


    }



//    @Test
//    public void LoginSucccesfulLawyer(){
//        WebDriver driver2 = new ChromeDriver();
//        driver2.get("https://localhost:7109/Admin/Auth/Login");
//        driver2.findElement(By.name("Email")).sendKeys("ahmetok2861@gmail.com");
//        driver2.findElement(By.name("Password")).sendKeys("123456789");
//        driver2.findElement(By.cssSelector("[class='btn btn-primary w-100']")).click();
//
//
//    }
////
//    @Test
//    public void LawyerBlogCommentAdd() throws InterruptedException {
//        WebDriver driver2 = new ChromeDriver();
//        driver2.get("https://localhost:7109");
//        Thread.sleep(5000);
//        driver2.findElements(By.cssSelector("[class='nav-link']")).get(3).click();
//        Thread.sleep(5000);
//
//        driver2.findElements(By.cssSelector("[class='d-inline-block']")).get(2).click();
//        Thread.sleep(5000);
//        driver2.findElement(By.name("CommentContent")).sendKeys("Selenium Test");
//        driver2.findElement(By.name("CommentUserName")).sendKeys("Ahmet ÖK");
//        driver2.findElement(By.name("CommentUserEmail")).sendKeys("ahmetok2861@gmail.com");
//        driver2.findElement(By.cssSelector("[class='button button-contactForm btn_4 mt-3']")).click();
//
//
//    }
}
