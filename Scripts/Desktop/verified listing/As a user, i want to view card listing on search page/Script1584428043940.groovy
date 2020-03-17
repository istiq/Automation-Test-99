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

//open url
WebUI.openBrowser('https://dw.99.co/id')

//search "rumah di bandung"
WebUI.setText(findTestObject('verified listing/searchbox'), 'bandung')

WebUI.sendKeys(findTestObject('verified listing/searchbox'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('verified listing/Page_Rumah Dijual di Bandung  Harga Terbaru 2020/h1_Rumah Dijual di Bandung'), 
    'Rumah Dijual di Bandung')

WebUI.delay(3)

//verify element virifiedlisting
WebUI.verifyElementText(findTestObject('verified listing/Page_Rumah Dijual di Bandung  Harga Terbaru 2020/span_Terverifikasi'), 
    'Terverifikasi')

