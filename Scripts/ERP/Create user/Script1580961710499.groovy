import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('ERP/Create user/Page_Users/a_Users'))

WebUI.click(findTestObject('ERP/Create user/Page_Users/span_All Users'))

WebUI.click(findTestObject('ERP/Create user/Page_Users/a_Add User'))

WebUI.delay(3)

WebUI.setText(findTestObject('ERP/Create user/Page_Create User/input_fullname'), 'Test Mulki')

WebUI.setText(findTestObject('ERP/Create user/Page_Create User/input_Email_UserFormemail'), 'mulki@99.co')

WebUI.setText(findTestObject('ERP/Create user/Page_Create User/input_telepon'), '+628111111111111')

WebUI.setText(findTestObject('ERP/Create user/Page_Create User/input_password'), 'Ml100795')

WebUI.click(findTestObject('ERP/Create user/Page_Create User/select_role'))

WebUI.setText(findTestObject('ERP/Create user/Page_Create User/seacrh_role'), 'agent')

WebUI.sendKeys(findTestObject('ERP/Create user/Page_Create User/seacrh_role'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('ERP/Create user/Page_Create User/input_joindate'), '2020-02-06')

WebUI.setText(findTestObject('ERP/Create user/Page_Create User/input_monthTarget'), '10000000')

WebUI.click(findTestObject('ERP/Create user/Page_Create User/select_manager'))

WebUI.setText(findTestObject('ERP/Create user/Page_Create User/input__select2-search__field'), 'auliya')

WebUI.sendKeys(findTestObject('ERP/Create user/Page_Create User/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ERP/Create user/Page_Create User/button_Create'))

