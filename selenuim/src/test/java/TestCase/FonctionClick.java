package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class FonctionClick {

	public static void main(String[] args) {
		// chemin de chrome driver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//Ouvrir chrome
		WebDriver driver= new ChromeDriver();
		// on va maximiser 
		driver.manage().window().maximize();
		//implicity
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//Ouvrir l'url
		driver.get("https://demoqa.com/buttons");
		WebElement bouton1 ;
		bouton1=driver.findElement(By.id("doubleClickBtn"));
		Actions action=new Actions(driver);
		action.doubleClick(bouton1).perform();
		//Assert
		WebElement msg;
		msg=driver.findElement(By.id("doubleClickMessage"));
		String text;
		text=msg.getText();
		Assert.assertEquals(text, "You have done a double click");
		System.out.println("test ok");
		WebElement bouton2 ;
		bouton2=driver.findElement(By.id("rightClickBtn"));
		Actions action1=new Actions(driver);
		action1.contextClick(bouton2).perform();
		//Assert
		WebElement msg1 ;
		msg1=driver.findElement(By.id("rightClickMessage"));
		String Text;
		text=msg1.getText();
		Assert.assertEquals(text, "You have done a right click");
		System.out.println("test ok");
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
	
		

	}

}
