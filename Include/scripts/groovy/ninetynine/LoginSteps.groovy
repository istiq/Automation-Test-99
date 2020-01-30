package ninetynine
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class LoginSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I navigate to home page")
	def I_navigate_to_home_page() {
		WebUI.openBrowser('https://www.99.co/id/')
	}

	@When("I click login button")
	def Iclickloginbutton() {
		WebUI.click(findTestObject('login/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/a_Login'))
	}

	@Then('I enter the username as "(.*) and password as "(.*)"')
	def I_enter_the_username_password(String istiq, String qwerty) {
		WebUI.setText(findTestObject('login/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/input_Login_LoginFormusername'),
			'istiq')
		WebUI.setText(findTestObject('login/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/input_Login_LoginFormpassword'),
			'qwerty')
	}
	
	@Then("Click the login button")
	def I_Click_login_button() {
		WebUI.click(findTestObject('login/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/button_Login'))
	}
	
	@Then("I should see the wording of name")
	def I_should_see_the_wording_of_name() {
		WebUI.verifyTextPresent('Istiq Test', false)
	}
}