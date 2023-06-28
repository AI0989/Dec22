package demo.demo_browser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser_intiate {
WebDriver driver;
	
WebDriver browser_init() throws IOException
	{//step1:
		FileInputStream fis=new FileInputStream("C:\\Users\\adnan\\OneDrive\\Documents\\QA Class\\mvnProject\\mvnProject\\target\\config.properties");
		
		//Step2
		
		Properties p=new Properties();
		//step3
		p.load(fis);
		//step4
		String s=p.getProperty("browsername");
		switch(s)
		{
		case "chrome":
		{
			System.setProperty("webdriver.chrome.driver",p.getProperty("chromepath"));
		driver=new ChromeDriver();
		driver.get(p.getProperty("url"));
		break;
		}
		
	}
		return driver;
	}
}
