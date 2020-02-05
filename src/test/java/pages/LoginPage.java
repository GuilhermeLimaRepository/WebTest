package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver browser;

    public LoginPage(WebDriver browser) {
        this.browser = browser;
    }

    public LoginPage SingnIn () {

        browser.findElement(By.xpath("//a[@class='login']")).click();

        return this;
    }

    public LoginPage typeAccount() {
        browser.findElement(By.id("email")).sendKeys("teste123321@teste.com");
        browser.findElement(By.id("passwd")).sendKeys("teste123123");
        browser.findElement(By.id("SubmitLogin")).click();
        return this;
    }



}
