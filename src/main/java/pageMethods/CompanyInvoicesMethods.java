package pageMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.CompanyInvoicesPage;

public class CompanyInvoicesMethods extends CompanyInvoicesPage {

    public CompanyInvoicesMethods(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getElementValue(String element) {
        switch (element) {
            case "company":
                return companyName.getText();
            case "invoiceAddress":
                return invoiceAddress.getText();
            case "grade":
                return grade.getText();
            case "weight":
                return weight.getText();
            case "flatChargeLineTotal":
                return flatChargeLineTotal.getText();
            case "perTonneLineTotal":
                return perTonneLineTotal.getText();
            case "itemLineTotal":
                return itemLineTotal.getText();
            default:
                throw new IllegalArgumentException("Argument is not found");
        }
    }
}
