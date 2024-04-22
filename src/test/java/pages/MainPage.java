package pages;


import utils.ElementsLocators;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


//elements in web page

public class MainPage extends ElementsLocators {

    WebDriver driver;

    public MainPage(WebDriver remoteDriver){
        driver = remoteDriver;
    }
    
  
    public void searchGithubAccount(String account) {
    	 WebElement input = driver.findElement(By.xpath(InputText));
         input.sendKeys(account);
         WebElement btnGo = driver.findElement(By.xpath(go));
         btnGo.click();
    }
   
    public void clickFirstRepo() {
    	WebElement firstRepo = driver.findElement(By.xpath(first));
    	firstRepo.click();
        String ventanaPrincipal = driver.getWindowHandle();	
    	Set<String> handles = driver.getWindowHandles();	
    	for (String handle : handles) {
    		if (!handle.equals(ventanaPrincipal)) {	
    	        driver.switchTo().window(handle);
    	        try {
    	            Thread.sleep(3000); 
    	        } catch (InterruptedException e) {
    	            e.printStackTrace();
    	        }
    	        String actualUrl = driver.getCurrentUrl();
    	        assert actualUrl.equals("https://github.com/hector/ama") : "The URL does not match as expected ";
    	        System.out.println("The URL matches as expected: " + actualUrl);
    	        driver.close();    
    	    }   
    	 }
    	 driver.switchTo().window(ventanaPrincipal);
    } 
    
    
    public void clickSecondRepo() {
    	WebElement secondRepo = driver.findElement(By.xpath(second));
    	secondRepo.click();
        String ventanaPrincipal = driver.getWindowHandle();	
    	Set<String> handles = driver.getWindowHandles();	
    	for (String handle : handles) {
    		if (!handle.equals(ventanaPrincipal)) {	
    	        driver.switchTo().window(handle);
    	        try {
    	            Thread.sleep(3000); 
    	        } catch (InterruptedException e) {
    	            e.printStackTrace();
    	        }
    	        String actualUrl = driver.getCurrentUrl();
    	        assert actualUrl.equals("https://github.com/hector/automatic_order") : "The URL does not match as expected ";
    	        System.out.println("The URL matches as expected: " + actualUrl);
    	        driver.close();    
    	    }   
    	 }
    	 driver.switchTo().window(ventanaPrincipal);
    
    }
    
    public void clickThirdRepo() {
    	WebElement thirdRepo = driver.findElement(By.xpath(third));
    	thirdRepo.click();
        String ventanaPrincipal = driver.getWindowHandle();	
    	Set<String> handles = driver.getWindowHandles();	
    	for (String handle : handles) {
    		if (!handle.equals(ventanaPrincipal)) {	
    	        driver.switchTo().window(handle);
    	        try {
    	            Thread.sleep(3000); 
    	        } catch (InterruptedException e) {
    	            e.printStackTrace();
    	        }
    	        String actualUrl = driver.getCurrentUrl();
    	        assert actualUrl.equals("https://github.com/hector/browser-audio-latency") : "The URL does not match as expected ";
    	        System.out.println("The URL matches as expected: " + actualUrl);
    	        driver.close();     
    	    }   
    	 }
    	 driver.switchTo().window(ventanaPrincipal);
    
    }
    
    public void clickFourthRepo(){
    	WebElement thirdRepo = driver.findElement(By.xpath(fourth));
    	thirdRepo.click();
        String ventanaPrincipal = driver.getWindowHandle();	
    	Set<String> handles = driver.getWindowHandles();	
    	for (String handle : handles) {
    		if (!handle.equals(ventanaPrincipal)) {	
    	        driver.switchTo().window(handle);
    	        try {
    	            Thread.sleep(3000); 
    	        } catch (InterruptedException e) {
    	            e.printStackTrace();
    	        }
    	        String actualUrl = driver.getCurrentUrl();
    	        assert actualUrl.equals("https://github.com/hector/capistrano-helpers") : "The URL does not match as expected ";
    	        System.out.println("The URL matches as expected: " + actualUrl);
    	        driver.close();     
    	    }   
    	 }
    	 driver.switchTo().window(ventanaPrincipal);
    	
    }
    
    public void clickFifthhRepo(){
    	WebElement thirdRepo = driver.findElement(By.xpath(fifth));
    	thirdRepo.click();
        String ventanaPrincipal = driver.getWindowHandle();	
    	Set<String> handles = driver.getWindowHandles();	
    	for (String handle : handles) {
    		if (!handle.equals(ventanaPrincipal)) {	
    	        driver.switchTo().window(handle);
    	        try {
    	            Thread.sleep(3000); 
    	        } catch (InterruptedException e) {
    	            e.printStackTrace();
    	        }
    	        String actualUrl = driver.getCurrentUrl();
    	        assert actualUrl.equals("https://github.com/hector/capistrano-rails-console") : "The URL does not match as expected ";
    	        System.out.println("The URL matches as expected: " + actualUrl);
    	        driver.close();     
    	    }   
    	 }
    	 driver.switchTo().window(ventanaPrincipal);
    	
    }
    
    public void clickSixthRepo(){
    	WebElement thirdRepo = driver.findElement(By.xpath(sixth));
    	thirdRepo.click();
        String ventanaPrincipal = driver.getWindowHandle();	
    	Set<String> handles = driver.getWindowHandles();	
    	for (String handle : handles) {
    		if (!handle.equals(ventanaPrincipal)) {	
    	        driver.switchTo().window(handle);
    	        try {
    	            Thread.sleep(3000); 
    	        } catch (InterruptedException e) {
    	            e.printStackTrace();
    	        }
    	        String actualUrl = driver.getCurrentUrl();
    	        assert actualUrl.equals("https://github.com/hector/capistrano-resque") : "The URL does not match as expected ";
    	        System.out.println("The URL matches as expected: " + actualUrl);
    	        driver.close();     
    	    }   
    	 }
    	 driver.switchTo().window(ventanaPrincipal);
    	
    }
    

    
    public void validateHeaderElement() {
    	WebElement headerWebElement = driver.findElement(By.xpath(headerElement));
		Assert.assertEquals(headerWebElement.getText(), "Get Github Repos");
    }
    
}