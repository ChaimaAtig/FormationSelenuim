package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateur {

	public static void main(String[] args) {
		//chemin du chrome driver (path)
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouverture chrome
		WebDriver driver=new ChromeDriver();
		//on va maximiser la fenêtre
		driver.manage().window().maximize();
		//ouvrir URL
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		
				
		
			
		
		
		
		
		

	}

}
