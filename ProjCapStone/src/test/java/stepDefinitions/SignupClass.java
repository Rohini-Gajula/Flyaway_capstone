package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupClass {
	WebDriver driver;

	public SignupClass(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void SignUp() {
		
		driver.findElement(By.xpath("//a[text()='Login/Signup']")).click();
		System.out.println("user has opened login page");
		driver.findElement(By.xpath("//a[text()='Not a member? Signup']")).click();
	    System.out.println("user opts to register");
	    driver.findElement(By.name("email_id")).sendKeys("roh12@user.com");
		driver.findElement(By.name("pwd")).sendKeys("12345");
		driver.findElement(By.name("pwd2")).sendKeys("12345");
		driver.findElement(By.name("name")).sendKeys("roh12");
		System.out.println("user enters details required");
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		driver.findElement(By.xpath("//a[text()='Already a member? Login']")).click();
	    System.out.println("user registered successfully");
		

	}
}
