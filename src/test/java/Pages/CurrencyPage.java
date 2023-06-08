package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class CurrencyPage {

    public CurrencyPage(){
        PageFactory.initElements((WebDriver) Driver.getAndroidDriver(),this);
    }




}
