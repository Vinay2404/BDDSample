package stepDefs;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class OpenCartLoginStepDef {
	WebDriver driver;
	@When("User is on Opencart home page")
	public void user_is_on_opencart_home_page() {
	driver = new ChromeDriver();
	//		WebDriverManager.edgedriver().setup();
	//		WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://demo.opencart.com/");
	}
	@When("User navigates to login page")
	public void user_navigates_to_login_page() {
		driver.findElement(By.xpath("//span[contains(text(), 'My Account')]")).click();
		driver.findElement(By.linkText("Login")).click();
		
	}

//	@Given("User login with credentials")
//	public void user_login_with_credentials() {
//		driver.findElement(By.id("input-email")).sendKeys("tonystark1234@gmail.com");
//	    driver.findElement(By.id("input-password")).sendKeys("Tony@1234");
//	    driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
//	}
//	@Given("User login with {string} and {string}")
//	public void user_login_with_and(String strUser, String strPwd) {
//		driver.findElement(By.id("input-email")).sendKeys(strUser);
//	    driver.findElement(By.id("input-password")).sendKeys(strPwd);
//	    driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
//	   
//	}

	//	DataTable as Lists
//	@Given("User login with credentials")
//	public void user_login_with_credentials(io.cucumber.datatable.DataTable dataTable) {
//	    List<List<String>> user = dataTable.asLists();
//	    //user1 - email, pwd - get(0).get(0), get(0).get(1)
//	    //user2 - email, pwd - get(0).get(0), get(0).get(1)
//	    driver.findElement(By.id("input-email")).sendKeys(user.get(0).get(0));
//	    driver.findElement(By.id("input-password")).sendKeys(user.get(0).get(1));
//	    driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
//	}
//	DataTable as Maps
	@Given("User login with credentials")
	public void user_login_with_credentials(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> user = dataTable.asMaps();
	    String strUser = user.get(0).get("email");
		String strPwd = user.get(0).get("pwd");
	    driver.findElement(By.id("input-email")).sendKeys(strUser);
	    driver.findElement(By.id("input-password")).sendKeys(strPwd);
	    driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

	@Then("User search item")
	public void user_search_item(io.cucumber.datatable.DataTable dataTable) {
		 List<List<String>> itemList = dataTable.asLists();
		 driver.findElement(By.name("search")).sendKeys(itemList.get(0).get(0));
		 driver.findElement(By.cssSelector("span.input-group-btn")).click();
	}


	@Then("User navigate to my account page")
	public void user_navigate_to_my_account_page() {
		String pageTitle = driver.getTitle();
		Assert.assertEquals("My Account", pageTitle);
	}


}
