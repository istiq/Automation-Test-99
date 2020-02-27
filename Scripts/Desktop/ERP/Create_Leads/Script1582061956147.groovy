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

WebUI.click(findTestObject('ERP/Create Leads/Page_Create User/span_Lead'))

WebUI.click(findTestObject('ERP/Create Leads/Page_Create User/span_Leads'))

WebUI.click(findTestObject('ERP/Create Leads/Page_Leads/a_Add Leads'))

WebUI.click(findTestObject('ERP/Create Leads/Page_Create Lead/span_Select Project'))

WebUI.setText(findTestObject('ERP/Create Leads/Page_Create Lead/input__select2-search__field'), 'project test')

WebUI.sendKeys(findTestObject('ERP/Create Leads/Page_Create Lead/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ERP/Create Leads/Page_Create Lead/span_Select telesales status'))

WebUI.setText(findTestObject('ERP/Create Leads/Page_Create Lead/input__select2-search__field'), 'qualified')

WebUI.sendKeys(findTestObject('ERP/Create Leads/Page_Create Lead/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ERP/Create Leads/Page_Create Lead/span_Select telesales'))

WebUI.setText(findTestObject('ERP/Create Leads/Page_Create Lead/input__select2-search__field'), 'indri1')

WebUI.sendKeys(findTestObject('ERP/Create Leads/Page_Create Lead/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('ERP/Create Leads/Page_Create Lead/input_Full Name_ProjectLeadFormfullName'), 'mulki lutfhi test9')

WebUI.setText(findTestObject('ERP/Create Leads/Page_Create Lead/input_Email_ProjectLeadFormemail'), 'mulki@gmail')

WebUI.setText(findTestObject('ERP/Create Leads/Page_Create Lead/input_land Islands_ProjectLeadFormtelephone'), '0987654345611')

WebUI.setText(findTestObject('ERP/Create Leads/Page_Create Lead/input_Location_ProjectLeadFormlocation'), 'garut')

WebUI.click(findTestObject('ERP/Create Leads/Page_Create Lead/span_Select Budget'))

WebUI.setText(findTestObject('ERP/Create Leads/Page_Create Lead/input__select2-search__field'), '1milyar')

WebUI.sendKeys(findTestObject('ERP/Create Leads/Page_Create Lead/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ERP/Create Leads/Page_Create Lead/span_Select Source'))

WebUI.setText(findTestObject('ERP/Create Leads/Page_Create Lead/input__select2-search__field'), 'whatsapp')

WebUI.sendKeys(findTestObject('ERP/Create Leads/Page_Create Lead/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ERP/Create Leads/Page_Create Lead/span_Select Timeline'))

WebUI.setText(findTestObject('ERP/Create Leads/Page_Create Lead/input__select2-search__field'), '1 month')

WebUI.sendKeys(findTestObject('ERP/Create Leads/Page_Create Lead/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ERP/Create Leads/Page_Create Lead/span_Select Purpose'))

WebUI.setText(findTestObject('ERP/Create Leads/Page_Create Lead/input__select2-search__field'), 'buying')

WebUI.sendKeys(findTestObject('ERP/Create Leads/Page_Create Lead/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('ERP/Create Leads/Page_Create Lead/textarea_Notes_ProjectLeadFormnotes'), 'ini test')

WebUI.click(findTestObject('ERP/Create Leads/Page_Create Lead/button_Create'))

WebUI.delay(3)

WebUI.click(findTestObject('ERP/Create Leads/Page_Create Lead/verify_name'))

WebUI.verifyTextPresent('mulki lutfhi test9', false)

WebUI.click(findTestObject('ERP/Create Leads/Page_Create User/span_Lead'))

WebUI.click(findTestObject('ERP/Create Leads/Page_Create User/span_Leads'))

WebUI.delay(5)

WebUI.click(findTestObject('ERP/Create Leads/Page_Leads/button_dropdown_distribute'))

WebUI.delay(5)

WebUI.setText(findTestObject('ERP/Create Leads/Page_Leads/search_groupdistribute'), 'akmal')

WebUI.delay(5)

WebUI.click(findTestObject('ERP/Create Leads/Page_Leads/group_akmal'))

