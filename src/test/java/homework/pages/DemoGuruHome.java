package homework.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import homework.utils.BrowserUtils;
public class DemoGuruHome extends BrowserUtils {
    public DemoGuruHome() {PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//a[.='Add Tariff Plan']") private WebElement addTariffPlan;
    @FindBy(xpath = "//h1[.='Add Tariff Plans']") private WebElement header;
    @FindBy(id="rental1")  private WebElement monthlyRental;
    @FindBy(id="local_minutes") private WebElement freeLocalMinutes;
    @FindBy(id="inter_minutes") private WebElement freeInterMinutes;
    @FindBy(id="sms_pack") private WebElement freeSmsPack;
    @FindBy(id="minutes_charges") private WebElement localPerMinutesCharges;
    @FindBy(id="inter_charges") private WebElement interPerMinutesCharges;
    @FindBy(id="sms_charges") private WebElement smsPerCharges;
    @FindBy(xpath = "//input[@type='submit']") private WebElement submitButton;
    @FindBy(xpath = "//h2[.='Congratulation you add Tariff Plan']") private WebElement verifyMessage;
    public void setAddTariffPlan() {addTariffPlan.click();}
    public void setHeader(String expectedHeader) {Assert.assertEquals(expectedHeader, header.getText());}
    public void setMonthlyRental(String MonthlyRental){ monthlyRental.sendKeys(MonthlyRental);}
    public void setFreeLocalMinutes(String FreeLocalMinutes){freeLocalMinutes.sendKeys(FreeLocalMinutes);}
    public void setFreeInterMinutes(String FreeInterMinutes){freeInterMinutes.sendKeys(FreeInterMinutes);}
    public void setFreeSmsPack(String FreeSmsPack){ freeSmsPack.sendKeys(FreeSmsPack);}
    public void setLocalPerMinutesCharges(String LocalPerMinutesCharges){localPerMinutesCharges.sendKeys(LocalPerMinutesCharges);}
    public void setInterPerMinutesCharges(String InterPerMinutesCharges){interPerMinutesCharges.sendKeys(InterPerMinutesCharges);}
    public void setSmsPerCharges(String SmsPerCharges){smsPerCharges.sendKeys(SmsPerCharges);}
    public void setSubmitButton(){submitButton.click();}
    public void setVerifyMessage(String expectedHeader) { Assert.assertEquals(expectedHeader, verifyMessage.getText());}
}
