package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyInvoicesPage {

     @FindBy(xpath = "//tbody//td[text()='146566']//..//..//preceding-sibling::tbody[contains(@class,'ui-selectee')][1]//td[@class='cal'][3]")
    protected WebElement companyName;

    @FindBy(xpath = "//tbody//td[text()='146566']//..//..//preceding-sibling::tbody[contains(@class,'ui-selectee')][1]//td[@class='cal'][4]")
    protected WebElement invoiceAddress;

    @FindBy(xpath = "//tbody//td[text()='146566']/following::tbody[contains(@class,'gl-2')][1]//td[2]")
    protected WebElement grade;

    @FindBy(xpath = "//tbody//td[text()='146566']/following::tbody[contains(@class,'gl-2')][1]//td[3]")
    protected WebElement weight;

    @FindBy(xpath = "//tbody//td[text()='146566']/following::td[text()='Flat charge'][1]/following::td[6]")
    protected WebElement flatChargeLineTotal;

    @FindBy(xpath = "//tbody//td[text()='146566']/following::td[text()='per tonne'][1]/following::td[6]")
    protected WebElement perTonneLineTotal;

    @FindBy(xpath = "//tbody//td[text()='146566']/following::td[text()='Item'][1]/following::td[6]")
    protected WebElement itemLineTotal;
}
