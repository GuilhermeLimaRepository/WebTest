package tests;

        import org.junit.After;
        import org.junit.Assert;
        import org.junit.Before;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import pages.LoginPage;
        import suport.setup;

public class UserLoginTest {
    private WebDriver browser;

    @Before
    public void setUp () {
        browser = setup.createBrowser();
    }

    @Test
    public void login() throws InterruptedException {

    new LoginPage(browser).SingnIn().typeAccount();
        Thread.sleep(5);
        String teste = browser.findElement(By.className("page-heading")).getText();
        Assert.assertEquals("MY ACCOUNT", teste);
    }


    @After
    public void tearDown(){
        browser.quit();
    }
}
