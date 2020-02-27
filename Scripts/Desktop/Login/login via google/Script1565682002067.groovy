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

WebUI.openBrowser('https://www.99.co/id/')

WebUI.click(findTestObject('login/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/a_Login'))

WebUI.click(findTestObject('login/Page_Masuk - Akun Google/div_Login Dengan Google'))

WebUI.acceptAlert()

WebUI.setText(findTestObject('login/Page_Masuk - Akun Google/input_Lanjutkan ke_identifier'), '')

WebUI.click(findTestObject('login/Page_Masuk - Akun Google/span_Berikutnya'))

WebUI.setText(findTestObject('login/Page_Masuk - Akun Google/input_password_google'), '')

WebUI.click(findTestObject('login/Page_Masuk - Akun Google/span_Berikutnya'))

WebUI.closeBrowser()

