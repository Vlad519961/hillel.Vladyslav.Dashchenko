package ua.ithillel.automation.ui;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa. selenium. WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa. selenium. chrome. ChromeDriver;
import org. openqa. selenium. chrome. ChromeOptions;

import java.util.concurrent. TimeUnit;

public class HomeWork {
    private WebDriver driver;

    @BeforeClass
    public static void setUpDriver() {
        final String path = String.format("%s/bin/chromedriver", System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", path);
    }

    @Before
    public void precondition() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void quAutoEnd2End() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".hero-descriptor_btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("signupName")).sendKeys("Test");
        Thread.sleep(2000);
        driver.findElement(By.id("signupLastName")).sendKeys("Test");
        Thread.sleep(2000);
        driver.findElement(By.id("signupEmail")).sendKeys("Mr.Shalun96@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("signupPassword")).sendKeys("Vlad519961");
        Thread.sleep(2000);
        driver.findElement(By.id("signupRepeatPassword")).sendKeys("Vlad519961");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.modal-footer > button")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#userNavDropdown")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("div.user-nav_menu-group > a:nth-child(2) ")).click();
        Thread.sleep(4000);
        WebElement vlad = driver.findElement(By.cssSelector(".profile_name.display-4"));
        Assert.assertEquals("Не верное имя или фамилия  ", "Test Test", vlad.getText());
        driver.findElement(By.cssSelector("a:nth-child(1)")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("div.panel-page_heading.d-flex.justify-content-between > button")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("addCarBrand")).sendKeys("BMW");
        Thread.sleep(2000);
        driver.findElement(By.id("addCarModel")).sendKeys("X5");
        Thread.sleep(2000);
        driver.findElement(By.id("addCarMileage")).sendKeys("21");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.modal-footer.d-flex.justify-content-end > button.btn.btn-primary")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.car_actions > button.car_add-expense.btn.btn-success")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("addExpenseMileage")).sendKeys("25");
        Thread.sleep(2000);
        driver.findElement(By.id("addExpenseLiters")).sendKeys("4");
        Thread.sleep(2000);
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("10");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.modal-footer.d-flex.justify-content-end > button.btn.btn-primary")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.col-3.d-none.d-lg-block.sidebar-wrapper > nav > div > a:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div > div.user-settings_item.-form.-remove-account > div > button")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(" div.modal-footer.d-flex.justify-content-end > button.btn.btn-danger")).click();
        Thread.sleep(2000);
    }


        @After
        public void postCondition () {
            driver.quit();
        }
    }









