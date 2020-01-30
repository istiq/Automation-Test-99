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

WebUI.openBrowser('https://www.99.co/id/')

WebUI.click(findTestObject('felix test/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/span_Dijual'))

WebUI.click(findTestObject('felix test/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/div_Disewa'))

WebUI.setText(findTestObject('felix test/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/input_Disewa_FormModeltext'), 
    'antapani bandung')

WebUI.click(findTestObject('felix test/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/span_Harga Minimum'))

WebUI.setText(findTestObject('felix test/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/input_Rp_mask-minPrice'), 
    '49000000')

WebUI.sendKeys(findTestObject('felix test/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/input_Rp_mask-minPrice'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('felix test/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/span_Harga Maksimum'))

WebUI.setText(findTestObject('felix test/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/input_Rp_mask-minPrice'), 
    '51000000')

WebUI.sendKeys(findTestObject('felix test/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/input_Rp_mask-minPrice'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('felix test/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/span_Kamar Mandi'))

WebUI.click(findTestObject('felix test/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/div_Min 1 KM'))

WebUI.click(findTestObject('felix test/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/span_Kamar Tidur'))

WebUI.click(findTestObject('felix test/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/div_Min 2 KT'))

WebUI.sendKeys(findTestObject('felix test/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/input_Disewa_FormModeltext'), 
    Keys.chord(Keys.ENTER))

