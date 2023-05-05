package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Authentification {

	public static void main(String[] args) throws InterruptedException{
		// chemin de chrome driver (path)
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouvrir chrome
		WebDriver driver= new ChromeDriver();
		// On va maximiser le chrome 
		driver.manage().window().maximize();
		//Ouvrir l'URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//sleep
		Thread.sleep(5000);
		// identification de web element
		WebElement user ;
		user=driver.findElement(By.name("username"));
		//action
		user.sendKeys("Admin");
		//identification de mot passe
		WebElement password;
		password=driver.findElement(By.name("password"));
		//action
		password.sendKeys("admin123");
		//identification bouton
		WebElement bouton ;
		bouton=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		//action
		bouton.click();
		
		Thread.sleep(5000);
		
		// VERIFICATION (ASSERT)
			//identification d'element
			WebElement profil;
			profil = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
			//recupération text
			String text;
			text = profil.getText();
			//assert
			Assert.assertEquals("Paul Colling", text);
			//affichage
			System.out.println("Test ok");
			
			
			
			
		
		
		
		
		
				
	
		

	}

}
