@OMS @OMSShipment
Feature: Verify Shipment

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "ramyatestuserssr@gmail.com" and  "Ramya@678"
    And user clicks on signin
    Then user homepage is displayed

  Scenario: Verify Shipment in OMS
    When cart is empty or not
    Then user navigate to Home page
    When user is on Welding consumables Menu on header section
    And user is able to select WeldingFluxes from Welding consumables Menu
    And user click on product name of WeldingFlux product displayed on the page
    And user is on WeldingFlux Product page
    When user clicks on Add To Cart button available in the right side of the webpage
    Then verify that the product should be added in the cart
    # When user is on Steel Menu on header section
    #  And user is able to select Colour coated from Steel Menu
    #  And user selects Colour coated product
    #  And user is on product detail page of colour coated product and add quantiy with quantity "<productQuanity>"
    #  When user clicks on Add To Cart button available in the right side of the webpage
    # Then verify that the product should be added in the cart
    When user click on Cart icon on homepage
    When user click on pickup checkbox
    And user click on proceed to pay on cart detail page
    And user select bank name to transfer from the drop down on payment page
    Then verify bank is selected
    And User click on PayNow
    Then User navigates to RazorPay Page
    And User click on success button
    Then order sucessfully placed message should be displayed
    And user login to OMS
    And user navigates to OMS ShipmentsPage
    And user creates a completed shipment in OMS with invoiceQty "7"
    And user navigates to ShipmentDetails Page in CCP
    And user clicks on viewDocuments

  @MultiShipment
  Scenario: Verify Multi Shipment in OMS
    # When cart is empty or not
    # Then user navigate to Home page
    #When user clicks HR from Steel Navigation Menu
    #When user selects Steel product
    #Given user is on product detail page of Steel item
    When cart is empty or not
    Then user navigate to Home page
    When user is on Welding consumables Menu on header section
    And user is able to select WeldingFluxes from Welding consumables Menu
    And user click on product name of WeldingFlux product displayed on the page
    And user is on WeldingFlux Product page
    When user clicks on Add To Cart button available in the right side of the webpage
    Then verify that the product should be added in the cart
    When user click on Cart icon on homepage
    When user click on pickup checkbox
    And user click on proceed to pay on cart detail page
    And user select bank name to transfer from the drop down on payment page
    Then verify bank is selected
    And User click on PayNow
    Then User navigates to RazorPay Page
    And User click on success button
    Then order sucessfully placed message should be displayed
    And user login to OMS
    And user navigates to OMS ShipmentsPage
    And user creates multiple shipment in OMS

  @MultiInvoiceUploadAndDelete
  Scenario: Verify Multi file upload and delete
    Given user login to OMS
    And user navigates to Delivered shipment detailsPage
    And uploads multi invoices
    And delete all invoices uploaded

  @InvoiceErrror
  Scenario: Verify InvoiceDeleteErrorMessage
    Given user login to OMS
    And user navigates to invoiced shipment detailsPage
    And delete invoices in Invoiced Shipment
    Then "Shipment invoice can not be deleted in invoiced or completed status" message  to be displayed