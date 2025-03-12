package practiceContact;



public class Screenshot {
@Test
public void AmazonTest() throws IOException {
	WebDriver driver= new ChromeDriver();
	driver.get("http://amazon.in");
    TakesScreenshot ts = (TakesScreenshot)driver;
    File scr = ts.getScreenshotAs(OutputType.FILE);
   File dest = new File("./TakeScreenShot/masi.png");
   FileUtils.copyFile(scr, dest);
   driver.close();

}
}
