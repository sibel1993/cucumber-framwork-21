package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Selenium_Grid_Step_Defs {
    WebDriver driver;
    @Given("user is on the application_login page with chrome")
    public void user_is_on_the_application_login_page_with_chrome() throws MalformedURLException {


      //1.create desired capabilities object
        DesiredCapabilities cap=new DesiredCapabilities();

        //2.use cap to assign the browser name and operating system
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.ANY);


        //3.merge the chrome with desired capabilities
        ChromeOptions options=new ChromeOptions();
        options.merge(cap);

        //4.will create driver object using remoteWebDriver
        //5.we will create Hub URL:porturl+wd+hub
        String hubUrl=" http://192.168.1.149:41476/wd/hub";
        driver=new RemoteWebDriver(new URL(hubUrl),options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //6. configration are done we can write our java codes
        driver.get(ConfigReader.getProperty("google_url"));

    }
    @Then("verify the title includes Resortsline")
    public void verify_the_title_includes_resortsline() {
        String title=driver.getTitle();
        Assert.assertTrue(title.contains("Google"));

    }
    @Given("user is on the application_login page with firefox")
    public void user_is_on_the_application_login_page_with_firefox() throws MalformedURLException {
        //1.create desired capabilities object
        DesiredCapabilities cap=new DesiredCapabilities();
        //2.use cap to assign the browser name and operating system
        cap.setBrowserName("firefox");//different than chrome
        cap.setPlatform(Platform.ANY);
        //3.merge the chrome with desired capabilities
        FirefoxOptions options=new FirefoxOptions();//different than chrome
        options.merge(cap);
        //4.will create driver object using remoteWebDriver
        //5.we will create Hub URL:porturl+wd+hub
        String hubUrl=" http://192.168.1.149:4448/wd/hub";
        driver=new RemoteWebDriver(new URL(hubUrl),options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        ReusableMethods.waitFor(5);
        //6. configration are done we can write our java codes
        driver.get(ConfigReader.getProperty("google_url"));

    }


}
