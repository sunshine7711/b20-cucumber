package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class BrowserUtils {

    // click element with Javascript executor
    public static void clickElement(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver; // casting java to javascript executor
        js.executeScript("arguments[0].click()", element);
    }

    // scroll to element
    public static void scrollToElement(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);

    }


    public static void takeScreenshot(WebDriver driver){
        // taking screenshot
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // saving screenshot
        String location = System.getProperty("user.dir")+"/src/test/screenshots/";
        File directory = new File(location); // pass location variable as an argument
        if(!directory.exists()){
            directory.mkdir();
        }
        try{
            FileUtils.copyFile(file, new File(location+System.currentTimeMillis()+".png"));
        } catch(IOException ex){
            ex.printStackTrace();
        }

    }
}
