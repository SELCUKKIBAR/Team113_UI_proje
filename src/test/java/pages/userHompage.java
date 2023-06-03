package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class userHompage {
    public userHompage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
