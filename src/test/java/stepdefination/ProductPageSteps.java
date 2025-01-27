package stepdefination;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PDPRegisteredUserPage;
import pages.ProductPage;

public class ProductPageSteps {

	ProductPage productpage = new ProductPage(DriverFactory.getDriver());
	PDPRegisteredUserPage pdp = new PDPRegisteredUserPage(DriverFactory.getDriver());

	@Then("user click on hot rolled sheet")
	public void user_click_on_hot_rolled_sheet() throws InterruptedException {

		Thread.sleep(6000);
		productpage.clickOnHotRolledSheets();
	}

	@Then("user click on product from listing page")
	public void user_click_on_product_from_listing_page() throws InterruptedException {

		Thread.sleep(5000);
		productpage.clickOnproductfromListingPage();

	}

	@Then("user select wire rod product in PLP page")
	public void user_select_wire_rod_produc_in_PLP_page() throws InterruptedException {
		pdp.selectWireRodProduct();
	}

	@Then("user select the dimensions of selected wire rod product")
	public void user_select_the_dimensions_of_selected_wire_rod_product() throws InterruptedException {
		pdp.selectWRDimensions();
	}

	@Then("user select the dimensions of selected wire rod product for directorder user")
	public void user_select_the_dimensions_of_selected_wire_rod_productfordirectorderuser()
			throws InterruptedException {
		pdp.selectWRDimensionsForDirectOrderUser();
	}

	@When("^user is on Welding consumables Menu on header section$")
	public void user_is_on_welding_consumables_menu_on_header_section() throws Throwable {
		productpage.ClickWeldingConsumables();
	}

	@And("^user is able to select WeldingFluxes from Welding consumables Menu$")
	public void user_is_able_to_select_weldingfluxes_from_welding_consumables_menu() throws Throwable {
		productpage.ClickWeldingFlux();
	}

	@And("^user click on product name of WeldingFlux product displayed on the page$")
	public void user_click_on_product_name_of_weldingflux_product_displayed_on_the_page() throws Throwable {
		productpage.clickWeldingFluxProduct();
	}

	@And("^user is on WeldingFlux Product page$")
	public void user_is_on_weldingflux_product_page() throws Throwable {
		productpage.WeldingFluxDetails();
		Thread.sleep(5000);
	}

}
