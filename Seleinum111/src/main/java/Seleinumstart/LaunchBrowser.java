package Seleinumstart;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		//after 4.6 maven called selenium manager
		// before 4.6 called webdrivermanager

		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://platform.testleaf.com/#/");
		
		Thread.sleep(1000);
		
		driver.close();
		}

}
