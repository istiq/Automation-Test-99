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

WebUI.click(findTestObject('sewa dan beli/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/button_Harga Minimum'))

WebUI.click(findTestObject('sewa dan beli/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/div_Rp 250 juta'))

WebUI.click(findTestObject('sewa dan beli/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/button_Rp 250 juta'))

WebUI.click(findTestObject('sewa dan beli/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/div_Rp 500 juta'))

WebUI.click(findTestObject('C'))

WebUI.click(findTestObject('sewa dan beli/Page_Rumah Dijual Di Indonesia (Info Harga)  99co/a_Selanjutnya(a)'))

WebUI.click(findTestObject('sewa dan beli/Page_Rumah Dijual Di Indonesia (Info Harga)  99co/a_Selanjutnya(b)'))

WebUI.click(findTestObject('sewa dan beli/Page_Rumah Dijual Di Indonesia (Info Harga)  99co/a_Selanjutnya(c)'))

WebUI.setText(findTestObject('sewa dan beli/Page_Rumah Dijual Di Indonesia (Info Harga)  99co/input_Tanyakan 1 Iklan Terpilih_fullName'), 
    'ini test')

WebUI.setText(findTestObject('sewa dan beli/Page_Rumah Dijual Di Indonesia (Info Harga)  99co/input_Tanyakan 1 Iklan Terpilih_telephone'), 
    '1234567890')

WebUI.click(findTestObject('sewa dan beli/Page_Rumah Dijual Di Indonesia (Info Harga)  99co/a_Selesai'))

WebUI.click(findTestObject('sewa dan beli/Page_Rumah Dijual Di Indonesia (Info Harga)  99co/close'))

