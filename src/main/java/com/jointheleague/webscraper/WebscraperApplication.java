package com.jointheleague.webscraper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebscraperApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebscraperApplication.class, args);
		  ChromeOptions chromeOptions = new ChromeOptions();
		  WebDriver drive = new ChromeDriver(chromeOptions);
		  drive.navigate().to("https://dwrapps.utah.gov/fishstocking/Fish");
		  //WebElement element = drive.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/article"));
		  
		  WebElement buttonPress = drive.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/article/div/div/div[2]/div/table/thead/tr/th[6]/div"));
		  buttonPress.click();
		  buttonPress.click();
		  
		  //for(int t=2; t<100; t++)
		  //{
			  for (int i=1 ; i<2000; i++)
			  {
				  WebElement DateElement = null;
				 
				  WebElement ReservoirElement = null;
				  
				  WebElement CountyElement = null;
				  
				  WebElement FishElement = null;
					 
				  WebElement QuantityElement = null;
				  
				  WebElement LengthElement = null;

				  
				 
				  ReservoirElement = drive.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/article/div/div/div[2]/div/table/tbody/tr["+i+"]/td[1]"));
				  
				  CountyElement = drive.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/article/div/div/div[2]/div/table/tbody/tr["+i+"]/td[2]"));
				  
				  FishElement = drive.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/article/div/div/div[2]/div/table/tbody/tr["+i+"]/td[3]"));
						  
				  QuantityElement = drive.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/article/div/div/div[2]/div/table/tbody/tr["+i+"]/td[4]"));
						  
				  LengthElement = drive.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/article/div/div/div[2]/div/table/tbody/tr["+i+"]/td[5]"));
						  
				  DateElement = drive.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div/div/article/div/div/div[2]/div/table/tbody/tr["+i+"]/td[6]"));
				  
				  String County = CountyElement.getText();
				  
				
				  if (County.equals("UTAH"))	
				  {
					  System.out.println(DateElement.getText()+", "+ReservoirElement.getText()+", "+FishElement.getText()+", "+LengthElement.getText()+", "+QuantityElement.getText()); 
				  } 
				  else
				  {
					  //System.out.println(County);
					  //Nothing
				  }

				  //TODO: create data base of all the information, check website for new information, if new information appears notify user and update database, repeat

			  }
			  

		  //}
		  
		  
	}

}
