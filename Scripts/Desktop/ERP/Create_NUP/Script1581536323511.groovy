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

'click_reservation/page_create_user'
WebUI.click(findTestObject('Object Repository/ERP/Create NUP/Page_Create User/span_Reservations'))

'click_NUP/page_create_user'
WebUI.click(findTestObject('Object Repository/ERP/Create NUP/Page_Create User/span_NUP'))

'click_createNUP/pageNUP'
WebUI.click(findTestObject('Object Repository/ERP/Create NUP/Page_NUP/a_Add_NUP'), FailureHandling.STOP_ON_FAILURE)

'click_select_NUP/pege_create_NUP'
WebUI.click(findTestObject('Object Repository/ERP/Create NUP/Page_Create NUPs/span_Select a Project'))

'input_search/page_create_NUP'
WebUI.setText(findTestObject('Object Repository/ERP/Create NUP/Page_Create NUPs/input__select2-searchNUP__field'), 'project test')

WebUI.delay(2)

'enter_button'
WebUI.sendKeys(findTestObject('ERP/Create NUP/Page_Create NUPs/input__select2-searchNUP__field'), Keys.chord(Keys.ENTER))

'input_qualitysequence/page_create_NUP'
WebUI.setText(findTestObject('ERP/Create NUP/Page_Create NUPs/Input_Numb_QualitySequence'), '10')

'input_purchasedate/page_create_NUP'
WebUI.setText(findTestObject('Object Repository/ERP/Create NUP/Page_Create NUPs/input_Purchase Date_NUP'), '2020-02-29')

'input_price/page_create_NUP'
WebUI.setText(findTestObject('Object Repository/ERP/Create NUP/Page_Create NUPs/input_Price for NUP_slotform-price-disp'), 
    '450000000')

'click_create/page_create_NUP'
WebUI.click(findTestObject('Object Repository/ERP/Create NUP/Page_Create NUPs/button_Create_NUP'))

