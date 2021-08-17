//package stepdefinitions;
//junit @Before  before each @Test
//cucumber @Before each scneraio no need to extends to hooks class
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import utilities.Driver;
//
//public class Hooks {
//    //hooks has  @before and @after  methods
//    //we use hooks for taking screenshots
//    //in our framework my hooks taking the screenshot of failed scenarios
//    @Before
//    public void setUp(){
////        System.out.println("This is before method");
//    }
//    @After
//    public void tearDown(Scenario scenario){
////        System.out.println("this is @after method");
//        //this method will take screenshot if the fail
//        final  byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//        //attaching the screenshot the reports if scneraio fail
//        if(scenario.isFailed()){
//            scenario.attach(screenshot,"image/png","ScreenShot");
//        }
//
//    }
//}
