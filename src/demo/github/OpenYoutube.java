package demo.github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenYoutube {

	public static void main(String[] args) throws Exception 
	{
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://www.youtube.com/");
	  Thread.sleep(3000);
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
	  Thread.sleep(2000);
	  search.sendKeys("haan tu hai");
	  Thread.sleep(2000);
	  driver.findElement(By.id("search-icon-legacy")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("title-wrapper")).click();
	  Thread.sleep(10000);
	  String url=driver.getCurrentUrl();
	  System.out.println(url); 
	}

}
