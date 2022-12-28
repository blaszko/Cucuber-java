package stepsDefinitions;

import cucumberCourse.RestaurantMenu;
import cucumberCourse.RestaurantMenuItem;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManuManagementSteps {
    RestaurantMenuItem newMenuItem;
    RestaurantMenu locationMenu = new RestaurantMenu();

    @Given("I have a menu item with name {string} and price {int}")
    public void i_have_a_menu_item_with_name_and_price(String newMenuItem, Integer price) {
        this.newMenuItem = new RestaurantMenuItem(newMenuItem, newMenuItem, price);
        System.out.println("Step: Given");
    }
    @When("I add that menu item")
    public void i_add_that_menu_item() {
   this.locationMenu.addMenuItem(newMenuItem);
        System.out.println("Step: When");
    }
    @Then("Menu Item with name {string} should be added")
    public void menu_item_with_name_should_be_added(String item) {
        boolean exists = locationMenu.doesItemExist(newMenuItem);
        System.out.println("Step: Then: " + exists);
    }
}
