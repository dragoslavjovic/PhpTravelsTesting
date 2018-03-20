package helper;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Helper {
    private static String workingDirectory = System.getProperty("user.dir");
    private static String resourceFilePath = workingDirectory + "/src/main/resources/" + "login.properties";
    private static Properties properties;

    public static void readProperties() {
        properties = new Properties();
        FileReader propertyFileReader = null;
        try {
            propertyFileReader = new FileReader(resourceFilePath);
            properties.load(propertyFileReader);
        } catch (IOException ex){
            ex.printStackTrace();
        } finally {
            if (propertyFileReader != null){
                try {
                    propertyFileReader.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static String getProperty(String key) {
        readProperties();
        return properties.getProperty(key) == null ? "" : properties.getProperty(key);
    }


//    public static boolean checkElementExists(By by, int seconds) {
//        boolean result = false;
//        try {
//            driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
//            driver.findElement(by);
//            result = true;
//        } catch (NoSuchElementException ex) {
//            result = false;
//        }
//        return result;
//    }
//
//    public static boolean waitUtilElementIsSelected(By by, int seconds) throws InterruptedException {
//        if (checkElementExists(by, seconds)) {
//            for (int i = 0; i < seconds; i++){
//                if (driver.findElement(by).isSelected()) {
//                    return true;
//                }
//                return false;
//            }
//        }
//        return false;
//    }




//    private static final Logger LOGGER = Logger.getLogger(Helper.class); //For getProperty2 // import org.apache.log4j.Logger;
//    public static String getProperty2(String key) {
//        LOGGER.debug("Getting property with key: " + key);
//        if (!properties.containsKey(key)){
//            return null;
//        } else {
//            return properties.getProperty(key).equals("") ? null : properties.getProperty(key);
//        }
//    }

//    public static boolean waitUntilElementIsLoaded(WebDriver driver, By by, long timeOutInSeconds) {
//        WebDriverWait driverWait = new WebDriverWait(driver, timeOutInSeconds);
//        LOGGER.debug("Waiting for Element to be loaded from " + by);
//        return driverWait.until(ExpectedConditions.presenceOfElementLocated(by)) != null;
//    }
//
//    public static boolean waitUntilElementDisappears(WebDriver driver, By by, long timeOutInSeconds) {
//        WebDriverWait driverWait = new WebDriverWait(driver, timeOutInSeconds);
//        LOGGER.debug("Waiting for Element to be loaded from " + by);
//        return ((Boolean)driverWait.until(ExpectedConditions.stalenessOf(driver.findElement(by)))).booleanValue();
//    }
//
//    public static boolean waitUntilElementIsClickable(WebDriver driver, By by, long timeOutInSeconds) {
//        WebDriverWait driverWait = new WebDriverWait(driver, timeOutInSeconds);
//        LOGGER.debug("Waiting for Element to be visible and enabled");
//        driverWait.until(ExpectedConditions.elementToBeClickable(by));
//        return true;
//    }

//    public static boolean isValidURL(String pUrl) {
//        URL u = null;
//        try {
//            u = new URL(pUrl);
//        } catch (MalformedURLException e) {
//            return false;
//        }
//        try {
//            u.toURI();
//        } catch (URISyntaxException e) {
//            return false;
//        }
//        return true;
//    }

//    public String getPropertyee(String key) {
//        LOGGER.debug("Getting property with key: " + key);
//        if (!this.properties.containsKey(key) ) {
//            return null;
//        } else {
//            return this.properties.getProperty(key).equals("") ? null : this.properties.getProperty(key) ;
//        }
//    }
}
