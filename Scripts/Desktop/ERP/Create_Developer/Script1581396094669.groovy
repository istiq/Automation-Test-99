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

WebUI.click(findTestObject('ERP/Create Developer/Page_Create User/span_Inventory'))

WebUI.click(findTestObject('ERP/Create Developer/Page_Create User/span_Developers'))

WebUI.click(findTestObject('ERP/Create Developer/Page_Developers/button_Add Developer'))

WebUI.setText(findTestObject('ERP/Create Developer/Page_Developers/input_Developer Name_DeveloperFormname'), 'Test developer')

WebUI.setText(findTestObject('ERP/Create Developer/Page_Developers/input_Company Name_DeveloperFormlegalName'), '99 test')

WebUI.setText(findTestObject('ERP/Create Developer/Page_Developers/input_Contact Person Name_DeveloperFormcontactPersonName'), 
    'mulki test')

WebUI.setText(findTestObject('ERP/Create Developer/Page_Developers/input_Email_DeveloperFormemail'), 'admin@ninetynine.id')

WebUI.setText(findTestObject('ERP/Create Developer/Page_Developers/input_Phone Number_DeveloperFormtelephone'), '09876545678')

WebUI.setText(findTestObject('ERP/Create Developer/Page_Developers/input_Collection Time (Days)_DeveloperForminvoiceCollectionTime'), 
    '7')

WebUI.setText(findTestObject('ERP/Create Developer/Page_Developers/textarea_Address_DeveloperFormaddress'), 'jalan karang tinggal no 14')

WebUI.setText(findTestObject('ERP/Create Developer/Page_Developers/input_Bank Name_DeveloperFormbankName'), 'mandiri')

WebUI.setText(findTestObject('ERP/Create Developer/Page_Developers/input_Account Number_DeveloperFormbankAccountNumber'), 
    '1245654')

WebUI.setText(findTestObject('ERP/Create Developer/Page_Developers/input_Account Name_DeveloperFormbankAccountName'), 'mulki')

WebUI.click(findTestObject('ERP/Create Developer/Page_Developers/button_Create'))

