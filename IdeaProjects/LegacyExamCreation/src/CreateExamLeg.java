import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CreateExamLeg {
    public static void main(String[] args) throws InterruptedException {



        //selenium code
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");//Create Driver object for browser of choice
        System.setProperty("webdriver.chrome.driver","//Users//joshrobbins//Documents//Dev Resources//chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,30);

        driver.get("https://orange.examsoft.com/GKWeb/login/QATHREE");
        driver.manage().window().maximize();
        System.out.println("Title of page: "+driver.getTitle());
        System.out.println("Validate that URL is correct: "+driver.getCurrentUrl());
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.id("emFedLoginLink")).click();


        System.out.println("Launched IDP");
        driver.findElement(By.name("loginfmt")).sendKeys("aschilf@examsoftadsamlqa.onmicrosoft.com");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.id("idSIButton9")).click();
        driver.findElement(By.name("passwd")).sendKeys("Azure123!");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        //Current pw: ID: currentPassword
        //new pw: ID: newPassword
        //confirm password: ID: confirmNewPassword
        WebElement signInButton1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/input[1]")));
        signInButton1.click();

        WebElement signInButton2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idSIButton9")));
        signInButton2.click();

        //WebElement navAssessments = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='navigation assessments']")));
        //navAssessments.click();
        driver.findElement(By.xpath("//a[@class='navigation assessments']")).click();
        driver.findElement(By.id("createAssessment")).click();
        driver.findElement(By.xpath("//div[@id='examsChoice']//td[2]//div[1]//a[1]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        driver.findElement(By.id("examTitle")).sendKeys("AutoTest");
        driver.findElement(By.id("selectExamFolderOpen")).click();
        driver.findElement(By.xpath("//span[contains(text(),'EXAMS')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='buttonintable examsAddQuestionsOpen']")).click();
        driver.findElement(By.xpath("//body[@class='stopScrolling']/div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-widget-shadow ui-draggable ui-resizable']/div[@id='examsAddQuestions']/div/div[@id='sideBar']/div[@id='main']/div[@id='websitebody']/table[@id='myTable']/tbody/tr/td/div[@id='foldersTreee']/div[@id='sideBar']/div[@class='examsofttreeModal']/div[@id='folderTreeDiv']/ul[@class='dynatree-container dynatree-no-connector']/li[@class='dynatree-lastsib']/ul/li[2]/span[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='add-ip-118715162115240613042']//img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='keybutton'][contains(text(),'Close')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='button'][contains(text(),'Save')]")).click();
        


        //driver.close();
        //driver.quit();
    }
}



