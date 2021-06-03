package TestScripts;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoTest  {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		driver.manage().window().maximize();
		//Test1(driver);
		//Test2(driver);
		//Test3(driver);
		//Test4(driver);
		//Test5(driver);
		//Test6(driver);
		//Test7(driver);
		//Test8(driver);
		//Test9(driver);
		//Test10(driver);
		//Test11(driver);
		//Test12(driver);
		//Test13(driver);
		//Test14(driver);
		//Test15(driver);
		//Test16(driver);
		//Test17(driver);
		//Test18(driver);
		//Test19(driver);
		//Test20(driver);
	}
	
	private static void Test20(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		Hold();
		driver.findElement(By.id("admin")).click();
		Hold();
		driver.findElement(By.ByTagName.name("password")).sendKeys("Amrita@admin2310");
		Hold();
		driver.findElement(By.id("submitBtn")).click();
		Hold();
		driver.findElement(By.id("fetchBtn")).click();
		Hold();
		List<WebElement> requests= driver.findElements(By.ByTagName.cssSelector("#approveReq > tr > td"));
		int i=0,f1=0,f2=0,f3=0,f4=0,f5=0;
		for(WebElement request:requests)
		{
			if(i==0 && request.getText().equals("Shivam"))
			{
				f1=1;
			}
			else if(i==1 && request.getText().equals("Raj"))
			{
				f2=1;
			}
			else if(i==2 && request.getText().equals("10ECE311"))
			{
				f3=1;
			}
			else if(i==3 && request.getText().equals("sandu647@gmail.com"))
			{
				f4=1;
			}
			else if(i==4 && request.getText().equals("2010-11-09"))
			{
				f5=1;
				i=-1;
			}
			
			if(f1==1 && f2==1 && f3==1 && f4==1 && f5==1)
			{
				if(i==-1)
					driver.findElement(By.id("check")).click();
				f1=0;f2=0;f3=0;f4=0;f5=0;
			}
			else if(i==-1)
			{
				driver.findElement(By.id("reject")).click();
				f1=0;f2=0;f3=0;f4=0;f5=0;
			}
			
			i++;
		}
		Hold();
		driver.findElement(By.ByTagName.id("logoutBtn")).click();
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
		Hold();
		driver.findElement(By.id("teacher")).click();
		Hold();
		driver.findElement(By.ByTagName.name("username")).sendKeys("10ECE311");
		driver.findElement(By.ByTagName.name("password")).sendKeys("VINTAGE");
		Hold();
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.ByTagName.id("logoutBtn")).click();
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
	}

	private static void Test19(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		Hold();
		driver.findElement(By.id("teacher")).click();
		Hold();
		driver.findElement(By.ByTagName.id("newAcc")).click();
		Hold();
		driver.findElement(By.ByTagName.name("name")).sendKeys("Shivam");
		driver.findElement(By.ByTagName.name("lastName")).sendKeys("Raj");
		driver.findElement(By.ByTagName.name("email")).sendKeys("sandu647@gmail.com");
		driver.findElement(By.ByTagName.name("rollNo")).sendKeys("10ECE311");
		driver.findElement(By.ByTagName.name("phNo")).sendKeys("9600539385");
		driver.findElement(By.ByTagName.name("doj")).sendKeys("2010-11-10");
		driver.findElement(By.id("branch")).click();
		List<WebElement> branches = driver.findElements(By.cssSelector("#branch__select-drop div > button > div >span"));
		for(WebElement branch:branches)
		{
			if(branch.getText().equals("ECE"))
			{
				branch.click();
				break;
			}
		}
		driver.findElement(By.ByTagName.name("passsword")).sendKeys("VINTAGE");
		Hold();
		driver.findElement(By.id("registerBtn")).click();
		Hold();
		driver.get("http://localhost:3000/teachersignin");
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
	}

	private static void Test18(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		Hold();
		driver.findElement(By.id("student")).click();
		Hold();
		driver.findElement(By.ByTagName.id("newAcc")).click();
		Hold();
		driver.findElement(By.ByTagName.name("name")).sendKeys("Varshini");
		driver.findElement(By.ByTagName.name("lastName")).sendKeys("K");
		driver.findElement(By.ByTagName.name("email")).sendKeys("sandhyasankar29@gmail.com");
		driver.findElement(By.ByTagName.name("phNo")).sendKeys("9486209727");
		driver.findElement(By.ByTagName.name("rollNo")).sendKeys("CB.EN.U4ECE18362");
		driver.findElement(By.id("dob")).sendKeys("2000-3-25");
		driver.findElement(By.id("yog")).sendKeys("2022");
		driver.findElement(By.id("branch")).click();
		List<WebElement> branches = driver.findElements(By.cssSelector("#branch__select-drop div > button > div >span"));
		for(WebElement branch:branches)
		{
			if(branch.getText().equals("ECE"))
			{
				branch.click();
				break;
			}
		}
		driver.findElement(By.id("section")).click();
		List<WebElement> sections = driver.findElements(By.cssSelector("#section__select-drop div > button > div >span"));
		for(WebElement section:sections)
		{
			if(section.getText().equals("A"))
			{
				section.click();
				break;
			}
		}
		driver.findElement(By.id("password")).sendKeys("HULK");
		driver.findElement(By.id("registerBtn")).click();
		Hold();
		driver.findElement(By.ByTagName.className("swal2-confirm")).click();
		Hold();
		driver.get("http://localhost:3000/signin");
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
	}

	private static void Test17(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		Hold();
		driver.findElement(By.id("student")).click();
		Hold();
		driver.findElement(By.ByTagName.id("newAcc")).click();
		Hold();
		driver.findElement(By.ByTagName.name("name")).sendKeys("Varshini");
		driver.findElement(By.ByTagName.name("lastName")).sendKeys("K");
		driver.findElement(By.ByTagName.name("email")).sendKeys("sandhyasankar29@gmail.com");
		driver.findElement(By.ByTagName.name("phNo")).sendKeys("9486209727");
		driver.findElement(By.ByTagName.name("rollNo")).sendKeys("CB.EN.U4ECE18362");
		driver.findElement(By.id("dob")).sendKeys("2000-3-25");
		driver.findElement(By.id("yog")).sendKeys("2022");
		driver.findElement(By.id("branch")).click();
		List<WebElement> branches = driver.findElements(By.cssSelector("#branch__select-drop div > button > div >span"));
		for(WebElement branch:branches)
		{
			if(branch.getText().equals("ECE"))
			{
				branch.click();
				break;
			}
		}
		driver.findElement(By.id("section")).click();
		List<WebElement> sections = driver.findElements(By.cssSelector("#section__select-drop div > button > div >span"));
		for(WebElement section:sections)
		{
			if(section.getText().equals("A"))
			{
				section.click();
				break;
			}
		}
		driver.findElement(By.id("password")).sendKeys("HULK");
		driver.findElement(By.id("registerBtn")).click();
		Scanner scan= new Scanner(System.in);
		String otp=scan.next();
		driver.findElement(By.ByTagName.name("otp")).sendKeys(otp);
		Hold();
		driver.findElement(By.id("otpSubmit")).click();
		Hold();
		Hold();
		driver.get("http://localhost:3000/signin");
		Hold();
		Hold();
		driver.findElement(By.ByTagName.name("username")).sendKeys("CB.EN.U4ECE18362");
		driver.findElement(By.ByTagName.name("password")).sendKeys("HULK");
		Hold();
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		Thread.sleep(3000);
		Hold();
		driver.findElement(By.ByTagName.id("logoutBtn")).click();
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
	}

	private static void Test16(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.id("teacher")).click();
		Hold();
		driver.findElement(By.ByTagName.name("username")).sendKeys("10CSE345");
		driver.findElement(By.ByTagName.name("password")).sendKeys("amazing4");
		Hold();
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		Thread.sleep(3000);
		List<WebElement> requests = driver.findElements(By.cssSelector("#studentNo"));
		for(WebElement request:requests)
		{
			if(request.getText().equals("CB.EN.U4CSE18452"))
			{
				request.click();
				Actions a = new Actions(driver);
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				Hold();
				WebElement reason=driver.findElement(By.id("rejectBtn"));
				reason.click();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				Hold();
				driver.findElement(By.id("approveBtn")).click();
				a.sendKeys(Keys.UP).build().perform();
				a.sendKeys(Keys.UP).build().perform();
				a.sendKeys(Keys.UP).build().perform();
				a.sendKeys(Keys.UP).build().perform();
				a.sendKeys(Keys.UP).build().perform();
				a.sendKeys(Keys.UP).build().perform();
				break;
			}
		}
		
		Hold();
		Hold();
		Hold();
		Hold();
		driver.findElement(By.ByTagName.id("logoutBtn")).click();
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
	}

	private static void Test15(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.id("teacher")).click();
		Hold();
		driver.findElement(By.ByTagName.name("username")).sendKeys("10CSE312");
		driver.findElement(By.ByTagName.name("password")).sendKeys("cooloppo");
		Hold();
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		Thread.sleep(3000);
		List<WebElement> requests = driver.findElements(By.cssSelector("#studentNo"));
		for(WebElement request:requests)
		{
			if(request.getText().equals("CB.EN.U4CSE18452"))
			{
				request.click();
				Actions a = new Actions(driver);
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				Hold();
				WebElement reason=driver.findElement(By.id("rejectBtn"));
				reason.click();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				Hold();
				driver.findElement(By.id("approveBtn")).click();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				a.sendKeys(Keys.DOWN).build().perform();
				Hold();
				driver.findElement(By.id("approveBtn")).click();
				a.sendKeys(Keys.UP).build().perform();
				a.sendKeys(Keys.UP).build().perform();
				a.sendKeys(Keys.UP).build().perform();
				a.sendKeys(Keys.UP).build().perform();
				a.sendKeys(Keys.UP).build().perform();
				a.sendKeys(Keys.UP).build().perform();
				break;
			}
		}
		
		Hold();
		Hold();
		Hold();
		Hold();
		driver.findElement(By.ByTagName.id("logoutBtn")).click();
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
	}

	private static void Test14(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		Hold();
		driver.findElement(By.id("student")).click();
		Hold();
		driver.findElement(By.ByTagName.name("username")).sendKeys("CB.EN.U4CSE18452");
		driver.findElement(By.ByTagName.name("password")).sendKeys("IRONMAN");
		Hold();
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.ByTagName.name("tuserid")).click();
		Hold();
		List<WebElement> teachers=driver.findElements(By.cssSelector("#teacher__input__select-drop .SelectContainer__OptionsBox-sc-1wi0ul8-0 >button >div >span"));
		for (WebElement teacher : teachers)
		{
			if(teacher.getText().equals("10CSE312 - Suma P T"))
			{
				teacher.click();
				break;	
			}
		}
		driver.findElement(By.ByTagName.name("dos")).sendKeys("2021-7-5");
		Hold();
		driver.findElement(By.ByTagName.name("doe")).sendKeys("2021-7-12");
		Hold();
		driver.findElement(By.ByTagName.name("reason")).sendKeys("Travelling Home");
		Hold();
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		Hold();
		Hold();
		driver.findElement(By.ByTagName.className("swal2-confirm")).click();
		Hold();
		
		driver.findElement(By.ByTagName.id("resetBtn")).click();
		driver.findElement(By.ByTagName.name("tuserid")).click();
		Hold();
		teachers=driver.findElements(By.cssSelector("#teacher__input__select-drop .SelectContainer__OptionsBox-sc-1wi0ul8-0 >button >div >span"));
		for (WebElement teacher : teachers)
		{
			if(teacher.getText().equals("10CSE312 - Suma P T"))
			{
				teacher.click();
				break;
			}
		}
		driver.findElement(By.ByTagName.name("dos")).sendKeys("2021-8-15");
		Hold();
		driver.findElement(By.ByTagName.name("doe")).sendKeys("2021-8-18");
		Hold();
		driver.findElement(By.ByTagName.name("reason")).sendKeys("Public Holiday");
		Hold();
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		Hold();
		Hold();
		Hold();
		driver.findElement(By.ByTagName.id("logoutBtn")).click();
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
	}

	private static void Test13(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		Hold();
		driver.findElement(By.id("student")).click();
		Hold();
		driver.findElement(By.ByTagName.name("username")).sendKeys("CB.EN.U4CSE18452");
		driver.findElement(By.ByTagName.name("password")).sendKeys("IRONMAN");
		Hold();
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.ByTagName.id("pastApplication")).click();
		Hold();
		Hold();
		List<WebElement> leaveApp= driver.findElements(By.cssSelector(".leaveApp #dos"));
		List<WebElement> cancelApp= driver.findElements(By.cssSelector(".leaveApp #decideBtn > div"));
		int i=0;
		for(WebElement app : leaveApp)
		{
			//System.out.println(app.getText());
			if(app.getText().equals("DOS: 15/08/2021"))
			{
				//System.out.println(app.getText()+" "+i);
				break;
			}
			i++;
		}
		int j=0;
		for(WebElement cancel:cancelApp)
		{
			if(j==i)
			{
				cancel.click();
				break;
			}
			j++;
		}
		Hold();
		Hold();
		driver.findElement(By.ByTagName.id("dashboard")).click();
		Hold();
		driver.findElement(By.ByTagName.id("logoutBtn")).click();
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
	}

	private static void Test12(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		Hold();
		driver.findElement(By.id("student")).click();
		Hold();
		driver.findElement(By.ByTagName.name("username")).sendKeys("CB.EN.U4CSE18452");
		driver.findElement(By.ByTagName.name("password")).sendKeys("IRONMAN");
		Hold();
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.ByTagName.name("tuserid")).click();
		Hold();
		List<WebElement> teachers=driver.findElements(By.cssSelector("#teacher__input__select-drop .SelectContainer__OptionsBox-sc-1wi0ul8-0 >button >div >span"));
		for (WebElement teacher : teachers)
		{
			if(teacher.getText().equals("10CSE312 - Suma P T"))
			{
				teacher.click();
				break;
			}
		}
		driver.findElement(By.ByTagName.name("dos")).sendKeys("2021-7-5");
		Hold();
		driver.findElement(By.ByTagName.name("doe")).sendKeys("2021-7-12");
		Hold();
		driver.findElement(By.ByTagName.name("reason")).sendKeys("Travelling Home");
		Hold();
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		Hold();
		Hold();
		
		driver.findElement(By.ByTagName.id("resetBtn")).click();
		driver.findElement(By.ByTagName.name("tuserid")).click();
		Hold();
		teachers=driver.findElements(By.cssSelector("#teacher__input__select-drop .SelectContainer__OptionsBox-sc-1wi0ul8-0 >button >div >span"));
		for (WebElement teacher : teachers)
		{
			if(teacher.getText().equals("10CSE312 - Suma P T"))
			{
				teacher.click();
				break;
			}
		}
		driver.findElement(By.ByTagName.name("dos")).sendKeys("2021-8-15");
		Hold();
		driver.findElement(By.ByTagName.name("doe")).sendKeys("2021-8-18");
		Hold();
		driver.findElement(By.ByTagName.name("reason")).sendKeys("Public Holiday");
		Hold();
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		Hold();
		Hold();
		
		driver.findElement(By.ByTagName.id("resetBtn")).click();
		driver.findElement(By.ByTagName.name("tuserid")).click();
		Hold();
		teachers=driver.findElements(By.cssSelector("#teacher__input__select-drop .SelectContainer__OptionsBox-sc-1wi0ul8-0 >button >div >span"));
		for (WebElement teacher : teachers)
		{
			if(teacher.getText().equals("10CSE312 - Suma P T"))
			{
				teacher.click();
				break;
			}
		}
		driver.findElement(By.ByTagName.name("dos")).sendKeys("2021-6-25");
		Hold();
		driver.findElement(By.ByTagName.name("doe")).sendKeys("2021-6-28");
		Hold();
		driver.findElement(By.ByTagName.name("reason")).sendKeys("Field Training");
		Hold();
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		Hold();
		Hold();
		
		driver.findElement(By.ByTagName.id("pastApplication")).click();
		Hold();
		Hold();
		driver.findElement(By.ByTagName.id("dashboard")).click();
		Hold();
		driver.findElement(By.ByTagName.id("logoutBtn")).click();
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
	}

	private static void Test11(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		Hold();
		driver.findElement(By.id("admin")).click();
		Hold();
		driver.findElement(By.ByTagName.name("password")).sendKeys("Amrita2310");
		Hold();
		driver.findElement(By.id("submitBtn")).click();
		Hold();
		driver.findElement(By.ByTagName.className("swal2-confirm")).click();
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
	}

	private static void Test10(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		Hold();
		driver.findElement(By.id("admin")).click();
		Hold();
		driver.findElement(By.ByTagName.name("password")).sendKeys("Amrita@admin2310");
		Hold();
		driver.findElement(By.id("submitBtn")).click();
		Hold();
		driver.findElement(By.ByTagName.id("logoutBtn")).click();
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
	}

	private static void Test9(ChromeDriver driver) throws InterruptedException{
		// TODO Auto-generated method stub
		Hold();
		driver.findElement(By.id("teacher")).click();
		Hold();
		driver.findElement(By.ByTagName.id("otpLogin")).click();
		Hold();
		driver.findElement(By.ByTagName.name("roll")).sendKeys("10CSE311");
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		Hold();
		driver.get("http://localhost:3000/teachersignin");
		Scanner scan=new Scanner(System.in);
		Hold();
		driver.findElement(By.ByTagName.id("otpLogin")).click();
		Hold();
		driver.findElement(By.ByTagName.name("roll")).sendKeys("10CSE312");
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		String otp;
		System.out.print("Enter OTP: ");
		otp=scan.next();
		Hold();
		driver.findElement(By.ByTagName.name("otp")).sendKeys(otp);
		Hold();
		driver.findElement(By.ByTagName.id("submitOTP")).click();
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
	}

	private static void Test8(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Hold();
		driver.findElement(By.id("teacher")).click();
		Hold();
		driver.findElement(By.ByTagName.id("otpLogin")).click();
		Hold();
		driver.findElement(By.ByTagName.name("roll")).sendKeys("10CSE312");
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		String otp;
		System.out.print("Enter OTP: ");
		otp=scan.next();
		Hold();
		driver.findElement(By.ByTagName.name("otp")).sendKeys(otp);
		Hold();
		driver.findElement(By.ByTagName.id("submitOTP")).click();
		Hold();
		driver.findElement(By.ByTagName.id("logoutBtn")).click();
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
	}

	private static void Test7(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		Hold();
		driver.findElement(By.id("teacher")).click();
		Hold();
		driver.findElement(By.ByTagName.name("username")).sendKeys("10CSE311");
		driver.findElement(By.ByTagName.name("password")).sendKeys("cooloppo");
		Hold();
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.ByTagName.className("swal2-confirm")).click();
		Hold();
		driver.get("http://localhost:3000/teachersignin");
		driver.findElement(By.ByTagName.name("username")).sendKeys("10CSE312");
		driver.findElement(By.ByTagName.name("password")).sendKeys("HULK");
		Hold();
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.ByTagName.className("swal2-confirm")).click();
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
	}

	private static void Test6(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		Hold();
		driver.findElement(By.id("teacher")).click();
		Hold();
		driver.findElement(By.ByTagName.name("username")).sendKeys("10CSE312");
		driver.findElement(By.ByTagName.name("password")).sendKeys("cooloppo");
		Hold();
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.ByTagName.id("logoutBtn")).click();
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
	}

	private static void Test5(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		Hold();
		driver.findElement(By.id("student")).click();
		Hold();
		driver.findElement(By.ByTagName.id("otpLogin")).click();
		Hold();
		driver.findElement(By.ByTagName.name("roll")).sendKeys("CB.EN.U4CSE18453");
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
		Scanner scan=new Scanner(System.in);
		Hold();
		driver.findElement(By.id("student")).click();
		Hold();
		driver.findElement(By.ByTagName.id("otpLogin")).click();
		Hold();
		driver.findElement(By.ByTagName.name("roll")).sendKeys("CB.EN.U4CSE18452");
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		String otp;
		System.out.print("Enter OTP: ");
		otp=scan.next();
		Hold();
		driver.findElement(By.ByTagName.name("otp")).sendKeys(otp);
		Hold();
		driver.findElement(By.ByTagName.id("submitOTP")).click();
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
	}

	private static void Test4(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Hold();
		driver.findElement(By.id("student")).click();
		Hold();
		driver.findElement(By.ByTagName.id("otpLogin")).click();
		Hold();
		driver.findElement(By.ByTagName.name("roll")).sendKeys("CB.EN.U4CSE18452");
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		String otp;
		System.out.print("Enter OTP: ");
		otp=scan.next();
		Hold();
		driver.findElement(By.ByTagName.name("otp")).sendKeys(otp);
		Hold();
		driver.findElement(By.ByTagName.id("submitOTP")).click();
		Hold();
		driver.findElement(By.ByTagName.id("logoutBtn")).click();
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
	}

	private static void Test3(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		Hold();
		driver.findElement(By.id("student")).click();
		Hold();
		driver.findElement(By.ByTagName.name("username")).sendKeys("CB.EN.U4CSE18453");
		driver.findElement(By.ByTagName.name("password")).sendKeys("IRONMAN");
		Hold();
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.ByTagName.className("swal2-confirm")).click();
		Hold();
		driver.get("http://localhost:3000/signin");
		driver.findElement(By.ByTagName.name("username")).sendKeys("CB.EN.U4CSE18452");
		driver.findElement(By.ByTagName.name("password")).sendKeys("HULK");
		Hold();
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.ByTagName.className("swal2-confirm")).click();
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
	}

	private static void Test2(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		Hold();
		driver.findElement(By.id("student")).click();
		Hold();
		driver.findElement(By.ByTagName.name("username")).sendKeys("CB.EN.U4CSE18452");
		driver.findElement(By.ByTagName.name("password")).sendKeys("IRONMAN");
		Hold();
		driver.findElement(By.ByTagName.id("submitBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.ByTagName.id("logoutBtn")).click();
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
	}

	private static void Hold() throws InterruptedException {
		Thread.sleep(1500);
	}

	private static void Test1(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		Hold();
		driver.findElement(By.id("student")).click();
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
		Hold();
		driver.findElement(By.id("admin")).click();
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
		Hold();
		driver.findElement(By.id("teacher")).click();
		Hold();
		driver.findElement(By.ByTagName.id("HomeBtn")).click();
	}
	
	
}
