package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageMethods.CompanyInvoicesMethods;
import utils.PropertiesManager;

public class CompanyInvoicesTest {
    PropertiesManager propertiesManager = new PropertiesManager();
    static WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", propertiesManager.propFile("chromeDriverPath"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(propertiesManager.propFile("offlinePagePath"));
    }

    @Test
    public void scenario1() {
        SoftAssert softAssert = new SoftAssert();
        CompanyInvoicesMethods companyInvoicesMethods = new CompanyInvoicesMethods(driver);
        softAssert.assertEquals(companyInvoicesMethods.getElementValue("company"), ("TEST CUSTOMER"), "Incorrect company");
        softAssert.assertEquals(companyInvoicesMethods.getElementValue("invoiceAddress"), ("TEST ADDRESS, TEST TOWN, 111111"), "Incorrect invoice address");
        softAssert.assertEquals(companyInvoicesMethods.getElementValue("grade"), "Mixed Municipal Waste", "Incorrect grade");
        softAssert.assertEquals(companyInvoicesMethods.getElementValue("weight"), "0.460 T", "Incorrect weight");
        softAssert.assertEquals(companyInvoicesMethods.getElementValue("flatChargeLineTotal"), "£100.00", "Incorrect flat Charge Line Total");
        softAssert.assertEquals(companyInvoicesMethods.getElementValue("perTonneLineTotal"), "£4.60", "Incorrect flat Charge Line Total");
        softAssert.assertEquals(companyInvoicesMethods.getElementValue("itemLineTotal"), "110.00", "Incorrect item Line Total");
        softAssert.assertAll();
    }

    @BeforeMethod
    public void shutdown() {
        driver.close();
    }

}
