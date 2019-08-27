package google;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Onplus {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Onplus 7",Keys.ENTER);
//        String fn = driver.findElement(By.className("sA5rQ")).getText();
//        System.out.println(fn);
        String title="OnePlus 7 Pro: Everything you need to know! | Android Central";
        List<WebElement> allLinks=null;
        int g=0;
        for(int i=0;i<=10;i++)
        {
        	allLinks=driver.findElements(By.xpath("//div[@class=\"ellip\"]"));
        	for(WebElement link:allLinks)
        	{
        		String s = link.getText();
        		if(s.contains(title))
        		{
        			link.click();
        			String ss = driver.getTitle();
        			System.out.println(ss);
        			g=1;
        			break;
        		}
        		
        		
        	}
        	if (g==1) 
        	{
				break;
			}
    		
    			driver.findElement(By.xpath("//span[@style=\"display:block;margin-left:53px\"]")).click();
    		
        	
        }
        
	}

}
