package StepsDefinition;

import Pages.AccountPage;
import Pages.HomePage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

   BrowserFactory browserFactory = new BrowserFactory();
   final WebDriver driver = browserFactory.startBrowser("chrome","https://www.way2automation.com/angularjs-protractor/banking/#/login");
   HomePage homePage = PageFactory.initElements(driver,HomePage.class);
   AccountPage accountPage = PageFactory.initElements(driver,AccountPage.class);
}
