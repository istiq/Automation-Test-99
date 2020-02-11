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

WebUI.click(findTestObject('ERP/Create Developer/Page_Create User/span_Inventory'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ERP/Create Project/Page_Create User/span_Projects'))

WebUI.setText(findTestObject('ERP/Create Cluster or Tower/Search_ProjectName'), 'mulki test2')

WebUI.delay(0)

WebUI.sendKeys(findTestObject('ERP/Create Cluster or Tower/Search_ProjectName'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ERP/Create Cluster or Tower/Page_Add Cluster or Tower/eye_open'))

WebUI.click(findTestObject('ERP/Create Cluster or Tower/Page_Project Articles/a_Cluster  Tower'))

WebUI.click(findTestObject('ERP/Create Cluster or Tower/Page_Project Articles/a_Add Cluster  Tower'))

WebUI.setText(findTestObject(null), '')

