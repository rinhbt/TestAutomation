package thainguyen.core.config.driver.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import thainguyen.core.config.driver.DriverManager;

import java.io.File;


public class ChromeDriverManager extends DriverManager{

//    private ChromeDriverService chromeService;

//    @Override
//    public void startService(){
//        if(chromeService == null){
//            try{
//                chromeService = new ChromeDriverService.Builder()
//                        .usingDriverExecutable(new File("chromedriver.exe"))
//                        .usingAnyFreePort().build();
//                chromeService.start();
//            }catch(Exception e){
//                e.printStackTrace();
//            }
//        }
//
//    }

//
//    @Override
//    public void stopService(){
//        if(chromeService != null && chromeService.isRunning()){
//            chromeService.stop();
//        }
//    }

    @Override
    public void createDriver(){
            System.setProperty("webdriver.chrome.driver", "D:\\AFramework\\src\\main\\resources\\chromedriver.exe");
            driver = new ChromeDriver();
    }
}
