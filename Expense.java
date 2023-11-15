import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Expense {
    WebDriver driver;
    WebElement singupMenu;
    WebElement textfieldName;
    WebElement textfieldLastName;
    WebElement textfieldEmail;
    WebElement textfieldPass;
    WebElement textfieldPass2;
    WebElement buttonRegister;
    WebElement buttonaddCarMenu;
    WebElement dropdownBrand;
    WebElement dropdownModel;
    WebElement textfieldMileage;
    WebElement menuExpense;
    WebElement buttonAddExpense;
    WebElement textfieldLiters;
    WebElement textfieldCost;
    WebElement resultMileage2;
    String textResultMileage2;
    WebElement resultDate2;
    String textResultDate2;
    WebElement resultLiters2;
    String textResultLiters2;
    WebElement resultCost2;
    String textResultCost2;
    WebElement resultMileage1;
    String textResultMileage1;
    WebElement resultDate1;
    String textResultDate1;
    WebElement resultLiters1;
    String textResultLiters1;
    WebElement resultCost1;
    String textResultCost1;
    WebElement buttonMyprofile;
    WebElement buttonSettings;
    WebElement buttonRemoveaccount;
    String mileage;
    String l="10";
    String c="5";

    void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space");
    }

    void singup() throws InterruptedException {
        Thread.sleep(2000);
        singupMenu = driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/div/app-guest-layout/div/app-home/section/div/div/div[1]/div/button"));
        singupMenu.click();
        Thread.sleep(2000);
        textfieldName = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-signup-modal/div[2]/app-signup-form/form/div[1]/input"));
        textfieldName.click();
        textfieldName.clear();
        textfieldName.sendKeys("Elina");
        Thread.sleep(2000);
        textfieldLastName = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-signup-modal/div[2]/app-signup-form/form/div[2]/input"));
        textfieldLastName.click();
        textfieldLastName.clear();
        textfieldLastName.sendKeys("Shhhh");
        Thread.sleep(2000);
        textfieldEmail = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-signup-modal/div[2]/app-signup-form/form/div[3]/input"));
        textfieldEmail.click();
        textfieldEmail.clear();
        textfieldEmail.sendKeys("skolaskolenkoelina@gmail.com");
        Thread.sleep(2000);
        textfieldPass = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-signup-modal/div[2]/app-signup-form/form/div[4]/input"));
        textfieldPass.click();
        textfieldPass.clear();
        textfieldPass.sendKeys("1234qweR");
        Thread.sleep(2000);
        textfieldPass2 = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-signup-modal/div[2]/app-signup-form/form/div[5]/input"));
        textfieldPass2.click();
        textfieldPass2.clear();
        textfieldPass2.sendKeys("1234qweR");
        Thread.sleep(2000);
        buttonRegister = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-signup-modal/div[3]/button"));
        buttonRegister.click();
    }

    void addCar() throws InterruptedException {
        Thread.sleep(2000);
        buttonaddCarMenu = driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/div/app-panel-layout/div/div/div/div[2]/div/app-garage/div/div[1]/button"));
        buttonaddCarMenu.click();
        Thread.sleep(2000);
        dropdownBrand = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-add-car-modal/div[2]/app-add-car-form/form/div[1]/select"));
        dropdownBrand.click();
        Thread.sleep(2000);
        dropdownBrand = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-add-car-modal/div[2]/app-add-car-form/form/div[1]/select/option[4]"));
        dropdownBrand.click();
        Thread.sleep(2000);
        dropdownModel = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-add-car-modal/div[2]/app-add-car-form/form/div[2]/select"));
        dropdownModel.click();
        Thread.sleep(2000);
        dropdownModel = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-add-car-modal/div[2]/app-add-car-form/form/div[2]/select/option[2]"));
        dropdownModel.click();
        Thread.sleep(2000);
        textfieldMileage = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-add-car-modal/div[2]/app-add-car-form/form/div[3]/div/input"));
        textfieldMileage.click();
        textfieldMileage.clear();
        textfieldMileage.sendKeys(Keys.ARROW_UP);
        textfieldMileage.sendKeys(Keys.ARROW_UP);
        textfieldMileage.sendKeys(Keys.ARROW_UP);
        textfieldMileage.sendKeys(Keys.ARROW_UP);
        textfieldMileage.sendKeys(Keys.ARROW_UP);
        buttonaddCarMenu = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-add-car-modal/div[3]/button[2]"));
        buttonaddCarMenu.click();
    }
    void addExpense(String mileage) throws InterruptedException {
        Thread.sleep(2000);
        menuExpense = driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/div/app-panel-layout/div/div/div/div[1]/nav/a[2]"));
        menuExpense.click();
        Thread.sleep(2000);
        buttonAddExpense = driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/div/app-panel-layout/div/div/div/div[2]/div/app-fuel-expenses/div/div[1]/div/button"));
        buttonAddExpense.click();
        Thread.sleep(2000);
        textfieldMileage = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-add-expense-modal/div[2]/app-add-expense-form/form/div[3]/div/input"));
        textfieldMileage.click();
        textfieldMileage.clear();
        textfieldMileage.sendKeys(mileage);
        Thread.sleep(2000);
        textfieldLiters = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-add-expense-modal/div[2]/app-add-expense-form/form/div[4]/div/input"));
        textfieldLiters.click();
        textfieldLiters.clear();
        textfieldLiters.sendKeys(l);
        Thread.sleep(2000);
        textfieldCost = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-add-expense-modal/div[2]/app-add-expense-form/form/div[5]/div/input"));
        textfieldCost.click();
        textfieldCost.clear();
        textfieldCost.sendKeys(c);
        buttonAddExpense = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-add-expense-modal/div[3]/button[2]"));
        buttonAddExpense.click();
    }

      void findAddedExpensefirst() throws InterruptedException {
        Thread.sleep(2000);
        resultDate2 = driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/div/app-panel-layout/div/div/div/div[2]/div/app-fuel-expenses/div/div[2]/div/div[1]/table/tbody/tr/td[1]"));
        textResultDate2 = resultDate2.getText();
        Thread.sleep(2000);
        resultMileage2 = driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/div/app-panel-layout/div/div/div/div[2]/div/app-fuel-expenses/div/div[2]/div/div[1]/table/tbody/tr/td[2]"));
        textResultMileage2 = resultMileage2.getText();
        Thread.sleep(2000);
        resultLiters2 = driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/div/app-panel-layout/div/div/div/div[2]/div/app-fuel-expenses/div/div[2]/div/div[1]/table/tbody/tr/td[3]"));
        textResultLiters2 = resultLiters2.getText();
        Thread.sleep(2000);
        resultCost2 = driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/div/app-panel-layout/div/div/div/div[2]/div/app-fuel-expenses/div/div[2]/div/div[1]/table/tbody/tr/td[4]"));
        textResultCost2 = resultCost2.getText();
                  }
     void findAddedExpensesecond() throws InterruptedException {
        Thread.sleep(2000);
        resultDate1 = driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/div/app-panel-layout/div/div/div/div[2]/div/app-fuel-expenses/div/div[2]/div/div[1]/table/tbody/tr[1]/td[1]"));
        textResultDate1 = resultDate1.getText();
        Thread.sleep(2000);
        resultMileage1 = driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/div/app-panel-layout/div/div/div/div[2]/div/app-fuel-expenses/div/div[2]/div/div[1]/table/tbody/tr[1]/td[2]"));
        textResultMileage1 = resultMileage1.getText();
        Thread.sleep(2000);
        resultLiters1 = driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/div/app-panel-layout/div/div/div/div[2]/div/app-fuel-expenses/div/div[2]/div/div[1]/table/tbody/tr[1]/td[3]"));
        textResultLiters1 = resultLiters1.getText();
        Thread.sleep(2000);
        resultCost1 = driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/div/app-panel-layout/div/div/div/div[2]/div/app-fuel-expenses/div/div[2]/div/div[1]/table/tbody/tr[1]/td[4]"));
        textResultCost1 = resultCost1.getText();
    }
    void deleteUser() throws InterruptedException {
        Thread.sleep(2000);
        buttonMyprofile = driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/app-header/header/div/div/app-user-nav/div/button"));
        buttonMyprofile.click();
        Thread.sleep(2000);
        buttonSettings = driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/app-header/header/div/div/app-user-nav/div/nav/div[1]/a[2]"));
        buttonSettings.click();
        Thread.sleep(2000);
        buttonRemoveaccount = driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/div/app-panel-layout/div/div/div/div[2]/div/app-settings/div/div[2]/div/div[5]/div/button"));
        buttonRemoveaccount.click();
        Thread.sleep(2000);
        buttonRemoveaccount = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-remove-account-modal/div[3]/button[2]"));
        buttonRemoveaccount.click();
    }
     void closeBrowser(){
        driver.quit();
     }

    @Test
    public void expenseTest() throws InterruptedException {
        startBrowser();
        singup();
        addCar();
        mileage = "10";
        addExpense(mileage);
        findAddedExpensefirst();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime now = LocalDateTime.now();
        String today = dateFormat.format(now);
        Assert.assertEquals(today, textResultDate2);
        Assert.assertEquals(mileage, textResultMileage2);
        Assert.assertEquals(l+"L",  textResultLiters2);
        Assert.assertEquals(c+".00 USD", textResultCost2);
        mileage = "15";
        addExpense(mileage);
        findAddedExpensesecond();
        Assert.assertEquals(today, textResultDate1);
        Assert.assertEquals(mileage, textResultMileage1);
        Assert.assertEquals(l+"L",  textResultLiters1);
        Assert.assertEquals(c+".00 USD", textResultCost1);
        deleteUser();
        closeBrowser();
    }
}


