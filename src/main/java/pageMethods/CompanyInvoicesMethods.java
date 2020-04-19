package pageMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.CompanyInvoicesPage;

public class CompanyInvoicesMethods extends CompanyInvoicesPage {
    private WebDriver driver;

    public CompanyInvoicesMethods(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getElementValue(String element) {
        String elementValue = null;
        switch (element) {
            case "company":
                elementValue = companyName.getText();
                break;
            case "invoiceAddress":
                elementValue = invoiceAddress.getText();
                break;
            case "grade":
                elementValue = grade.getText();
                break;
            case "weight":
                elementValue = weight.getText();
                break;
            case "flatChargeLineTotal":
                elementValue = flatChargeLineTotal.getText();
                break;
            case "perTonneLineTotal":
                elementValue = perTonneLineTotal.getText();
                break;
            case "itemLineTotal":
                elementValue = itemLineTotal.getText();
                break;
        }
        return elementValue;
    }
}
