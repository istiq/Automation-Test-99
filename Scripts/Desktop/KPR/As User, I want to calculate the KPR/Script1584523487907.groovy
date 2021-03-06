import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.99.co/id')

WebUI.click(findTestObject('KPR/Landing_Page/KPR_menu'))

WebUI.setText(findTestObject('KPR/Calculator/input_harga_properti'), '')

WebUI.setText(findTestObject('KPR/Calculator/input_DP'), '')

WebUI.setText(findTestObject('KPR/Calculator/input_persenDP'), '10')

WebUI.setText(findTestObject('KPR/Calculator/input_fixed_rate'), '9.5', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('KPR/Calculator/select_fix_year'), '3', false)

WebUI.setText(findTestObject('KPR/Calculator/input_floating_rate'), '12.25')

WebUI.setText(findTestObject('KPR/Calculator/input_tenor'), '20')

WebUI.click(findTestObject('KPR/Calculator/button_hitungKPR'), FailureHandling.STOP_ON_FAILURE)

