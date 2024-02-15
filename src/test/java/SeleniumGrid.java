import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.testng.*;
import org.testng.annotations.*;
import java.net.*;
import java.time.*;

public class SeleniumGrid {
    @Test
    public void test01() throws MalformedURLException {

        // Bir frameworkte kullaniliyorsa Driver objesi nerede tanimliysa bu degisiklikler orada yapilir

        ///******************************************************************************************


        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("browserName","safari");
        capabilities.setCapability("platformName","mac");

        // driver obj. RemoteWebDriver olarak oluşturacağız.

        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.103:4444"),capabilities);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com.tr/");
        String title = driver.getTitle();

        Assert.assertTrue(title.contains("Elektronik"));



    }
}
