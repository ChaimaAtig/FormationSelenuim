package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.testng.Assert;

public class DrugAndDrop {

	private static final String Second = null;

	public static void main(String[] args) {
		// chemin chrome
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouvrir chrome
		WebDriver driver= new ChromeDriver();
		// On va maximiser le chrome 
		driver.manage().window().maximize();
		TimeUnit timeUnit;
		//simplicity
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/droppable/");
		WebElement from ;
		from=driver.findElement(By.id("draggable"));
		WebElement to;
		to=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver) ;
		action.dragAndDrop(from, to).perform();
		//Assrt
		String texte;
		texte=to.getText();
		Assert.assertEquals(texte,"Dropped!");
		System.out.println("test ok");
		driver.close();
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		

	}

}
