package atul1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdownDemo {

	String url2="https://www.redbus.in/";
	WebDriver Dv1= new ChromeDriver();
	public void dynamicDemo() throws InterruptedException
	{
		Dv1.get(url2);
		Dv1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Dv1.manage().window().maximize();
		Dv1.findElement(By.xpath("//input[@id='src']")).sendKeys("ASW");
		Dv1.findElement(By.xpath("//text[normalize-space()='Aswapuram']")).click();
		Dv1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Dv1.findElement(By.xpath("//input[@id='dest']")).sendKeys("pu");
		Dv1.findElement(By.xpath("//li[@class='sc-iwsKbI jTMXri cursorPointing']")).click();
		Dv1.findElement(By.xpath("//div[@class='sc-bdVaJa BUCow'] //text[@class='placeHolderMainText']")).sendKeys("pune");
		//Dv1.findElements(By.xpath("(//div[@class='sc-ifAKCX kPhbmx'])[2])")).sendKeys("pu");
		//Dv1.findElement(By.xpath("(//div[@class='sc-ifAKCX kPhbmx'])[2]")).sendKeys("pu");
		Thread.sleep(20000);
		Dv1.findElement(By.xpath("//text[@class='dateText']")).sendKeys("25");
		
		Dv1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


		////List<WebElement> elements = Dv1.findElements(By.xpath("(//div[@class='sc-ifAKCX kPhbmx'])[2]"));
		//for (WebElement element : elements) {
		  //  element.sendKeys("pune");
		//}

		
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		DynamicDropdownDemo r1=new DynamicDropdownDemo();
		r1.dynamicDemo();
	}
}
