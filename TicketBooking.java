import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TicketBooking {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Yogesh Learning\\Drivers\\chromedriver_win32_2.41\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("yogee143");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Iloveyou143");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		if (driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed()==true)
			System.out.println("In Flight finder page");
		else
			System.out.println("Error");
		
		Select sPassangerCount = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		sPassangerCount.selectByValue("3");
		sPassangerCount.selectByVisibleText("4");
		sPassangerCount.selectByIndex(0);
		
		driver.findElement(By.xpath("//input[@name='tripType' and @value='oneway']")).click();
		
		driver.findElement(By.xpath("//input[@name='tripType' and @value='roundtrip']")).click();
		
		driver.findElement(By.xpath("//input[@name='tripType' and @value='oneway']")).click();
		
		
		Select sFromPort = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		sFromPort.selectByValue("Paris");
		
		Select sFromMonth = new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
		sFromMonth.selectByVisibleText("September");
		
		Select sFromDate = new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
		sFromDate.selectByValue("2");
		
		Select sToPort = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		sToPort.selectByValue("Sydney");
		
		Select sToMonth = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
		sToMonth.selectByVisibleText("September");
		
		Select sToDate = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
		sToDate.selectByValue("15");
		
		driver.findElement(By.xpath("//input[@name='servClass' and @value='First']")).click();
		
		Select sAirline = new Select(driver.findElement(By.xpath("//select[@name='airline']")));
		sAirline.selectByVisibleText("Unified Airlines");
		
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		
		
		//IN SELECT FLIGHT PAGE
		if(driver.findElement(By.xpath("//img[@src='/images/masts/mast_selectflight.gif']")).isDisplayed())
			System.out.println("in SELECT FLIGHT PAGE");
		
		driver.findElement(By.xpath("(//input[@name='outFlight'])[2]")).click();
		
		driver.findElement(By.xpath("(//input[@name='inFlight'])[3]")).click();
		
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		
		// BOOK A FLIGHT PAGE
		if (driver.findElement(By.xpath("//img[@src='/images/masts/mast_book.gif']")).isDisplayed())
			System.out.println("IN BOOK A FLIGHT page");
		
		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("YOGESH");
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("JATTI");
		
		Select sMeal = new Select(driver.findElement(By.xpath("//select[@name='pass.0.meal']")));
		sMeal.selectByVisibleText("Vegetarian");
		
		driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("1111222233334444");
		
		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
		
		
		if(driver.findElement(By.xpath("//img[@src='/images/masts/mast_confirmation.gif']")).isDisplayed())
			System.out.println("In FLIGHT CONFIRMATION PAGE");
		
		
		System.out.println("CONGRATULATIONS . TICKET BOOKED SUCESSFULL...");
		
	}

}
