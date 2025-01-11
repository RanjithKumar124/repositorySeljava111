package Seleinumstart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.facebook.com/login.php");
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign up for ')]")).click();
		
		
		
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Ranjith");
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Log");
		
		WebElement bd = driver.findElement(By.name("birthday_day"));
		
		Select opt=new Select(bd);

		opt.selectByValue("10");
		
		WebElement bm = driver.findElement(By.name("birthday_month"));
		
		Select optm=new Select(bm);
		
		optm.selectByVisibleText("Feb");
		
		
		
		
	    

	}

}
