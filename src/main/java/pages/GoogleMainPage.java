package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GoogleMainPage {
    public GoogleMainPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath ="(//button[@class='tHlp8d']//div)[2]")
    public WebElement aceptarTodo;

    @FindBy(name = "q")
    public WebElement searchBox;

    @FindBy(id = "result-stats")
    public WebElement resultBox;







}
