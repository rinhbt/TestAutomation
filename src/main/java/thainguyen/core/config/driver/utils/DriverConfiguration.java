package thainguyen.core.config.driver.utils;

public class DriverConfiguration {
    public Object driverService = null;
    public Object desiredCapabilities = null;
    public int pageLoadTimeout = 60;
    public Boolean maximizedBrowser = false;


    public Object getDriverService() {
        return driverService;
    }

    public Object setDriverService(Object driverService) {
      return this.driverService = driverService;
    }

    public Object getDesiredCapabilities() {
        return desiredCapabilities;
    }

    public Object setDesiredCapabilities(Object desiredCapabilities) {
        return this.desiredCapabilities = desiredCapabilities;
    }

    public int getPageLoadTimeout() {
        return pageLoadTimeout;
    }

    public void setPageLoadTimeout(int pageLoadTimeout) {
        this.pageLoadTimeout = pageLoadTimeout;
    }

    public Boolean getMaximizedBrowser() {
        return maximizedBrowser;
    }

    public void setMaximizedBrowser(Boolean maximizedBrowser) {
        this.maximizedBrowser = maximizedBrowser;
    }
}
