package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AuthentificationYoutube {

	public static void main(String[] args) throws InterruptedException {
		//Chemin de chrome driver (path)
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouvrir chrome
		WebDriver driver= new ChromeDriver();
		// On va maximiser le chrome 
	     driver.manage().window().maximize();
	     //Ouvrir l'URL
	     driver.get("https://www.youtube.com/");
	    //sleep
	     Thread.sleep(5000);
	     //identification de WebEelemnt
	     WebElement recherche;
	     recherche=driver.findElement(By.name("search_query"));
	     // action
	     recherche.sendKeys("tunisie");
	   //identification bouton
			WebElement bouton ;
			bouton=driver.findElement(By.id("search-icon-legacy"));
			//action
			bouton.click();
			Thread.sleep(5000);
			// VERIFICATION (ASSERT)
			//identification d'element
			String URL;
			URL=driver.getCurrentUrl();
			Assert.assertEquals("https://www.youtube.com/results?search_query=tunisie",URL);
			System.out.print("test ok");
						
						
			
			
	     
	     
	     
	     
	     
	    
	     
	     
				
				
		

	}

}
