package thainguyen.core.config.driver;

import thainguyen.core.config.driver.browser.ChromeDriverManager;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type){

        DriverManager driverManager;

        switch(type){
//            case CHROME:
//                driverManager = new ChromeDriverManager();
//                break;

                default:
                    driverManager = new ChromeDriverManager();
                    break;

        }
        return driverManager;
    }
}
