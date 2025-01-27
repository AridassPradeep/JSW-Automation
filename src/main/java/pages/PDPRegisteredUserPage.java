package pages;

import java.awt.AWTException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.interactions.SourceType;
import util.ElementUtil;

public class PDPRegisteredUserPage {

	private WebDriver driver;

	public PDPRegisteredUserPage(WebDriver driver) {
		this.driver = driver;
	}

	private By user = By.xpath("//div[@class='loginusermenu profile']");
	private By steelbycategory = By.xpath("//ul[@class='main-categories-first-child-menu']/parent::div/child::a");
	private By menu = By.xpath("//ul[@class='main-categories-first-child-menu']/child::li");
	private By secondmenu = By.xpath("//ul[@class='main-categories-second-child-menu']/child::li/child::a");
	private By productselect = By.xpath("//a[@class='prod-plpimage1name']");
	private By alldimensions = By
			.xpath("//button[contains(@class,'list-group-item list-group-item-action in-active')]");
	private By addquantity = By.xpath("//div[2]/div[1]/div[1]/div[1]/button[1]/img[1]");
	private By addtocartbutton = By.xpath("//*[@id='product-add-to-cart']");
	private By BuyAgainaddtocartbutton = By.xpath(
			"//btn[@class='primary-btn w-100 add-to-cart-cta small-btn d-flex align-items-center justify-content-center d-md-inline-block']");
	private By diameter = By.xpath("//div[contains(@class,'size_1')]/child::div[@class='dimension-size']");
	private By productselectwirerod = By.xpath("//div[@class='product-plp1 col-sm-12 col-xxl-4']");
	private By quantitybutton = By.xpath("//button[@class='btn btn-quant']");
	private By cartcount = By.xpath("//div[@class='count']");
	private By totalprice = By.xpath("//span[@class='fl-right tot-cost']");
	private By dealpill = By.xpath("//div[contains(text(), '2 X 1250')]");
	private By lowestprice = By.xpath("//span[contains(text(),'Lowest Price Seller')]");
	private By bestprice = By.xpath("//span[@class='offer-txt']");
	private By selecteddimensions = By.xpath("//button[@class='list-group-item list-group-item-action active']");
	private By ResetSelection = By.xpath("//div[@class='reset-selection']");

	public boolean validateLogin() {

		return driver.findElement(user).isDisplayed();
	}

	public void validatesearchwithcategoryreguser() {
		driver.findElement(steelbycategory).click();
		List<WebElement> reguserfirstmenu = driver.findElements(menu);

		reguserfirstmenu.get(4).click();

		List<WebElement> regusersecondmenu = driver.findElements(secondmenu);

		regusersecondmenu.get(14).click();

	}

	public void selectProductreguser() throws InterruptedException {
		Thread.sleep(2000);

		List<WebElement> productselected = driver.findElements(productselect);

		for (int i = 0; i < productselected.size(); i++) {
			if (productselected.get(i).getText().equals("JSW Steel Hot Rolled Coils IS 2062:2011 E250BR")) {
				productselected.get(i).click();
			}
			break;
		}

	}

	public void selectSteelProductreguser() throws InterruptedException {
		Thread.sleep(2000);

	driver.findElement(By.xpath("//a[contains(text(),'JSW Steel Hot Rolled Sheets IS 2062:2011 E350A')]")).click();


		/*
		 * List<WebElement> productlist = driver.findElements(productselect); for (int i
		 * = 0; i < productlist.size(); i++) { if (productlist.get(i).getText().
		 * equals("JSW Steel Hot Rolled Sheets IS 2062:2011 E250A")) {
		 * productlist.get(i).click(); } break; }
		 */
	}

	public void selectDirectSteelProductreguser() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@title='JSW Steel Hot Rolled Coils IS 2062:2011 E250BR']")).click();


		/*
		 * List<WebElement> productlist = driver.findElements(productselect); for (int i
		 * = 0; i < productlist.size(); i++) { if (productlist.get(i).getText().
		 * equals("JSW Steel Hot Rolled Sheets IS 2062:2011 E250A")) {
		 * productlist.get(i).click(); } break; }
		 */
	}

	public void selectSteelCoilsProductreguser() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'JSW Steel Hot Rolled Coils IS 2062:2011 E250BR')]")).click();


		/*
		 * List<WebElement> productlist = driver.findElements(productselect); for (int i
		 * = 0; i < productlist.size(); i++) { if (productlist.get(i).getText().
		 * equals("JSW Steel Hot Rolled Sheets IS 2062:2011 E250A")) {
		 * productlist.get(i).click(); } break; }
		 */
	}

	public void selectCRCoilSteelProductreguser() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'JSW Steel Cold Rolled Coils IS 513 (Part 1):2016 CR1')]"))
				.click();

	}

	public void selectWeldingElectrodeProductreguser() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Ador METALBOND E6013 Mild Steel Welding Electrode')]"))
				.click();

	}

	public void selectWeldingWireProductreguser() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Ador AUTOMELT B-71 Steel F7A4/P4-EM12K SAW Welding Flux')]"))
				.click();

	}

	public void selectProductcoldrolled() throws InterruptedException {
		Thread.sleep(2000);

		List<WebElement> productselected = driver.findElements(productselect);

		productselected.get(2).click();

	}

	public void selectThicknessWidthLength() throws InterruptedException {

		List<WebElement> allThickness = driver
				.findElements(By.xpath("//div[@class='list-group flex-row flex-wrap']//button"));
		allThickness.get(1).click();
		allThickness.get(11).click();
		allThickness.get(14).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[2]/div[1]/div[1]/input[1]")).sendKeys("150");
		Thread.sleep(2000);
		// driver.findElement(addquantity).click();
		// Thread.sleep(2000);

	}

	public void selectDimensionreguser() throws InterruptedException {

		List<WebElement> alldimensions2 = driver.findElements(alldimensions);
		int i = driver.findElements(alldimensions).size();
		System.out.println(i);

		driver.findElement(By.xpath("//input[@class='input-quant']")).sendKeys("12");
		Thread.sleep(3000);

		alldimensions2.get(9).click();
		alldimensions2.get(12).click();
		alldimensions2.get(15).click();

		// alldimensions2.get(1).click();

	}

	public void clickAddtoCart()

	{
		driver.findElement(addtocartbutton).isDisplayed();
		driver.findElement(addtocartbutton).click();

	}

	public void selectWireRod() {
		driver.findElement(steelbycategory).click();
		// List<WebElement> reguserfirstmenu1 = driver.findElements(menu);
		// reguserfirstmenu1.get(2).click();
		driver.findElements(menu).get(2).click();
		driver.findElements(secondmenu).get(6).click();

	}

	public void selectProductreguserwirerod() {

		List<WebElement> productselected = driver.findElements(productselectwirerod);

		productselected.get(0).click();

	}

	public void clickQuantity() {
		driver.findElement(quantitybutton).click();

	}

	public void clickViewCart() throws InterruptedException	{
		driver.findElement(By.xpath("//btn[text()='View cart']")).click();
	}

	public void validateAddedtoCart() throws InterruptedException, AWTException {

		Thread.sleep(5000);
		ElementUtil.Esc();
		driver.findElement(cartcount).isDisplayed();

	}

	public void validateDiameter() {
		driver.findElement(diameter).isDisplayed();

	}

	public void validateTotalPrice() {

		driver.findElement(totalprice).isDisplayed();

	}

	public void selectDimensionHRPO() throws InterruptedException {

		List<WebElement> alldimensions2 = driver.findElements(alldimensions);
		int i = driver.findElements(alldimensions).size();
		System.out.println(i);
		alldimensions2.get(6).click();
		alldimensions2.get(15).click();
		alldimensions2.get(16).click();
		driver.findElement(By.xpath("//input[@class='input-quant']")).sendKeys("1234");
		Thread.sleep(3000);

	}

	public void selectDimensionHR() throws InterruptedException {

		List<WebElement> alldimensions2 = driver.findElements(alldimensions);
		int i = driver.findElements(alldimensions).size();
		System.out.println(i);
		alldimensions2.get(1).click();
		Thread.sleep(1000);
		alldimensions2.get(11).click();
		Thread.sleep(1000);
		alldimensions2.get(12).click();
		driver.findElement(By.xpath("//input[@class='input-quant']")).sendKeys("120");
		Thread.sleep(3000);

	}

	public void selectDimensionDeal() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='deals-pill selected']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Thickness')]//following::div[3]//div//button[2]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Width')]//following::div[2]//div//button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Length')]//following::div[2]//div//button[1]")).click();
		Thread.sleep(4000);
	}

	public void validatedealPillclicked() {
		driver.findElement(By.xpath("//div[@class='deals-pill selected']")).isDisplayed();

	}

	public void validateDealPill() {
		driver.findElement(dealpill).isDisplayed();
	}

	public void clickDealProduct(){
		driver.findElement(By.xpath("//a[contains(., 'JSW Steel Hot Rolled Coils IS 2062:2011 E250A')]")).click();
	}

	private String beforeValue;
	public void clickDealPill() {
		driver.findElement(dealpill).click();
	}
	 public void userSelectsQuantity() throws InterruptedException {
		 Thread.sleep(2000);
		 beforeValue = String.valueOf(driver.findElement(By.xpath("(//div[@class='price-range-with-all']//span[@class='amount'])[1]")).getText());
		 System.out.println(beforeValue);
		 driver.findElement(By.xpath("//div[@class='attribute-padding s-py-16']//input[@id='inputQty' and @type='number' and contains(@class, 'form-control')]")).sendKeys("10");
		 Thread.sleep(4000);
	 }

	public static double parseCurrencyValue(String currencyValue) {
		// Remove currency symbol "₹" and commas, then parse into a double
		String cleanedValue = currencyValue.replaceAll("[₹,]", "");
		try {
			return NumberFormat.getInstance().parse(cleanedValue).doubleValue();
		} catch (ParseException e) {
			e.printStackTrace();
			return 0.0; // Handle parsing error as needed
		}
	}

	 public boolean compareDealPillPrice() throws InterruptedException {
		Thread.sleep(3000);
		 String afterValue = String.valueOf(driver.findElement(By.xpath("(//div[@class='price-range-with-all']//span[@class='amount'])[1]")).getText());
		 double parsedBeforePrice = parseCurrencyValue(beforeValue);
		 double parsedAfterPrice = parseCurrencyValue(afterValue);
		 System.out.println(parsedBeforePrice);
		 System.out.println(parsedAfterPrice);
		 if(parsedBeforePrice>parsedAfterPrice){
			 return true;
		 }
		 return false;
	 }
	public void validateLowestPriceSeller() {
		driver.findElement(lowestprice).isDisplayed();
	}

	public void validateBestPrice() {
		driver.findElement(bestprice).isDisplayed();
	}

	int size;

	public boolean checkDimensionSelected() {
		int count = 0;
		double arr[] = { 1.6, 1250.0, 2500.0 };
		// int size = driver.findElements(selecteddimensions).size();
		for (int i = 0; i < 3; i++) {
			WebElement mylist = driver.findElements(selecteddimensions).get(i);
			String str = mylist.getAttribute("innerText");
			double d = Double.parseDouble(str);
			System.out.println("The value of d is" + d);
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == d) {
					count = count + 1;
					System.out.println("Element found" + count);
					break;
				} else

				{
					if (i > 2) {
						System.out.println("Element not found");
						return false;
					} else {
						System.out.println("Keep searching");
						continue;

					}

				}

			}
			if (count == 3)
				return true;

		}
		return true;
	}

	public void stainlessSteelDetails() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Thickness (mm)')]//following::div[3]//div//button[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Width (mm)')]//following::div[2]//div//button[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Length (mm)')]//following::div[2]//div//button[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("25");
		Thread.sleep(4000);

	}

	public void stainlessSteelDetailsDimensions() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Thickness (mm)')]//following::div[3]//div//button[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Width (mm)')]//following::div[2]//div//button[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Length (mm)')]//following::div[2]//div//button[1]"))
				.click();
		Thread.sleep(2000);

	}

	public void stainlessSteelDetailsAddquantity(String quantity) throws InterruptedException {
		driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[1]/input[1]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys(quantity);
		Thread.sleep(3000);

	}

	public void BuyAgainAddquantity(String quantity) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='buy-again-quantity-input']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='buy-again-quantity-input']")).sendKeys(quantity);
		Thread.sleep(3000);

	}

	public void BuyAgainAddquantity() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='buy-again-quantity-input']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='buy-again-quantity-input']")).sendKeys("10");
		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"//btn[@class='primary-btn w-100 add-to-cart-cta small-btn d-flex align-items-center justify-content-center d-md-inline-block']"))
				.click();

	}

	public String BuyAgainMOQErrorMessage() {
		String actualErrorMessage = driver
				.findElement(By.xpath("//input[@id='buy-again-quantity-input']//following::div[3]//p")).getText();
		return actualErrorMessage;
	}

	public String MOQErrorMessage() {
		String actualErrorMessage = driver.findElement(By.xpath("(//div[@class='switch-qty-section'])[1]//preceding::div[1]")).getText();
		return actualErrorMessage;
	}

	public boolean validateAddToCartisDisabled() throws InterruptedException {
		Thread.sleep(5000);
		return driver.findElement(addtocartbutton).isEnabled();

	}

	public boolean validateBuyAgainAddToCartisDisabled() throws InterruptedException {

		ElementUtil obj = new ElementUtil(driver);
		boolean BuyAgainAddToCart = obj.isElementPresent(
				"//btn[@class='primary-btn w-100 add-to-cart-cta small-btn d-flex align-items-center justify-content-center d-md-inline-block']");
		return BuyAgainAddToCart;

	}

	public void WeldingElectrodeDetails() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Diameter')]//following::div[3]//button[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Length')]//following::div[3]//button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Box')]//following::div[3]//button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='inputQty']")).sendKeys("2");
		Thread.sleep(2000);

	}

	public void switchQuantity() throws InterruptedException {

		driver.findElement(By.xpath("(//button[contains(text(),'Switch quantity')])[1]")).click();
	}

	public void WeldingFluxDetails() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='inputQty']")).sendKeys("10");
		Thread.sleep(2000);

	}

	//
	public void SteelDetails() throws InterruptedException {
		// For thickness
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'4')]")).click();
		//for width
		driver.findElement(By.xpath("//button[contains(text(), '1250')]")).click();

		Thread.sleep(2000);
		//for length
		driver.findElement(By.xpath("//button[contains(text(),'2500')]")).click();
		Thread.sleep(2000);
		//for quantity
		driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("40");

		Thread.sleep(3500);

	}

	public void SteelCoilsDetails() throws InterruptedException {
		// For thickness
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'1.6')]")).click();
		//for width
		driver.findElement(By.xpath("//button[contains(text(), '1250')]")).click();

		Thread.sleep(2000);
		//for quantity
		driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("4.525");

		Thread.sleep(3500);

	}

	public void SteelDirectSteelDetails() throws InterruptedException {
		// For thickness
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'1.6')]")).click();
		//for width
		driver.findElement(By.xpath("//button[contains(text(), '900')]")).click();
	//	driver.findElement(By.xpath("//button[contains(text(), '2500')]")).click();
		Thread.sleep(2000);
		//for quantity
		driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("6.525");

		Thread.sleep(3500);

	}


	public void SteelDetails(String quantity) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Thickness')]//following::button[contains(text(),'3')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Thickness')]//following::button[contains(text(),'1250')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Thickness')]//following::button[contains(text(),'2500')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='inputQty'])[1]")).sendKeys(quantity);
		Thread.sleep(3500);

	}

	public void DirectOrderSteelDetails() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Thickness')]//following::div[3]//div//button[2]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Width')]//following::div[2]//div//button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Length')]//following::div[2]//div//button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("1100");
		Thread.sleep(5000);
		

	}

	public void SteelDetailsDimension() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Thickness')]//following::div[3]//div//button[2]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Width')]//following::div[2]//div//button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Length')]//following::div[2]//div//button[1]")).click();
		Thread.sleep(2000);

	}

	public void CRCoilSteelDetails() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Thickness')]//following::div[3]//div//button[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Width')]//following::div[2]//div//button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("5");
		Thread.sleep(4000);

	}

	public void TMTDetails() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Diameter')]//following::div[3]//div//button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='inputQty']")).sendKeys("4");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Form')]//following::div[1]//button[1]")).click();
		Thread.sleep(6000);

	}

	public void CementDetails() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='inputQty'])[2]")).sendKeys("210");
		Thread.sleep(6000);

	}

	public void WireDetails() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Diameter')]//following::div[3]//div//button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='inputQty']")).sendKeys("4");
		Thread.sleep(4000);

	}
	public void WireDetailsDirectOrder() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Diameter')]//following::div[3]//div//button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='inputQty']")).sendKeys("40");
		Thread.sleep(2000);

	}

	public void verifyTMTStraightBent() throws InterruptedException {
		driver.findElement(By.xpath("//div[contains(text(),'Form')]//following::div[1]//button[1]")).isDisplayed();
		driver.findElement(By.xpath("//div[contains(text(),'Form')]//following::div[1]//button[2]")).isDisplayed();

	}

	public void selectHRPOProductreguser() throws InterruptedException {
		Thread.sleep(2000);

		List<WebElement> productselected = driver.findElements(productselect);

		productselected.get(7).click();

	}

	public void HRPODetails() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Thickness (mm)')]//following::div[2]//div//button[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Width (mm)')]//following::div[1]//div//button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Length (mm)')]//following::div[1]//div//button[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("6");
		Thread.sleep(2000);
		driver.findElement(addquantity).click();
		Thread.sleep(2000);
	}

	public void HRSteelDetails() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Thickness (mm)')]//following::div[2]//div//button[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Width (mm)')]//following::div[1]//div//button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Length (mm)')]//following::div[1]//div//button[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("60");
		Thread.sleep(2000);
		driver.findElement(addquantity).click();
		Thread.sleep(2000);
	}

	// Discount

	public void selectWireRodProduct() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'JSW Steel Wire Rod Coils IS 7887:1992 SAE1006')]")).click();
		Thread.sleep(1000);

	}

	public void selectWRDimensions() throws InterruptedException {
		driver.findElement(By.xpath("//div[contains(text(),'Diameter')]//following::div[3]//button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("5");
		Thread.sleep(1000);
	}

	public void selectWRDimensionsForDirectOrderUser() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'6')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("50");
		Thread.sleep(1000);
	}

	public void HRSteelDetails01() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Thickness')]//following::div[3]//div//button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Width')]//following::div[3]//button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Length')]//following::div[3]//button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("250");
		Thread.sleep(2000);
	}

	public void clickResetSelection() {
		driver.findElement(ResetSelection).click();

	}

	public void CTLafterentered(String string) {
		driver.findElement(By.xpath("//input[@id='customLen']")).sendKeys(string);
		System.out.println("Entered input value: " + string);
	}

	public void validateErrorMessage() {
		String mge = driver.findElement(By.xpath("//div[@class='error-message']")).getText();
		System.out.println("Error message :" + mge);
	}

	public void clickDigitalorderKnowMore() {
		driver.findElement(By.xpath(
				"//div[@class='d-desktop-coupon']//h1[@class='cp_code'][normalize-space()='DIGITALORDER']//following::article[1]//span"))
				.click();
	}

	public void clickSteel250KnowMore() {
		driver.findElement(By.xpath("//h1[text()='STEEL250']//following::span[text()=' Know more']")).click();

	}

	public void couponDetails() {
		String know = driver.findElement(By.xpath("//div[contains(@class,'coupon-description')]")).getText();
		System.out.println("KnowMore: " + know);
	}

	public void sellerName() throws InterruptedException {
		Thread.sleep(3000);
		String sellerName = driver
				.findElement(
						By.xpath("//div[@class='amt-details box py-3 mt-3']//div//span[@class='ml-1 seller-title']"))
				.getText();
		System.out.println("SellerName: " + sellerName);

	}

}