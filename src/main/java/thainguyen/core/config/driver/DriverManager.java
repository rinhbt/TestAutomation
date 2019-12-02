package thainguyen.core.config.driver;


import org.openqa.selenium.WebDriver;
import thainguyen.core.config.driver.utils.DriverConfiguration;

public class DriverManager {
    private static ThreadLocal<Object> driverStored = new ThreadLocal<Object>();

    /**
     * Get the current Driver that stored in the local Thread
     */


    public static void startDriver(Browser type, DriverConfiguration configuration =null){
        if(configuration == null){
            configuration =  new DriverConfiguration();
        }

        //Check if the driver has implemented?





    }
}
