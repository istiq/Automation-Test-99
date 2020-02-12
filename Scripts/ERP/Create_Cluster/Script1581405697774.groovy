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

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ERP/Create Cluster or Tower/Search_ProjectName'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ERP/Create Cluster or Tower/eye_open'))

WebUI.click(findTestObject('ERP/Create Cluster or Tower/Page_Project Articles/a_Cluster  Tower'))

WebUI.click(findTestObject('ERP/Create Cluster or Tower/Page_Project Articles/a_Add Cluster  Tower'))

WebUI.setText(findTestObject('ERP/Create Cluster or Tower/Page_Add Cluster or Tower/input_ClusterTower Name_ProjectFormname'), 
    'cluster test 2')

WebUI.click(findTestObject('ERP/Create Cluster or Tower/Page_Add Cluster or Tower/span__select2-selectionDeveloper__arrow'))

WebUI.setText(findTestObject('ERP/Create Cluster or Tower/Page_Add Cluster or Tower/input__select2-searchDeveloper__field'), 
    'test developer')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ERP/Create Cluster or Tower/Page_Add Cluster or Tower/input__select2-searchDeveloper__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('ERP/Create Cluster or Tower/Page_Add Cluster or Tower/input_Launch Date_ProjectFormlaunchDate'), 
    '2020-02-22')

WebUI.click(findTestObject('ERP/Create Cluster or Tower/Page_Add Cluster or Tower/span_Select one_accountOwner'))

WebUI.setText(findTestObject('ERP/Create Cluster or Tower/Page_Add Cluster or Tower/input__select2-searchAccountOwner__field'), 
    'auliya')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ERP/Create Cluster or Tower/Page_Add Cluster or Tower/input__select2-searchAccountOwner__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('ERP/Create Cluster or Tower/Page_Add Cluster or Tower/input_Start Price_projectform-averageprice-disp'), 
    '450000000')

WebUI.setText(findTestObject('ERP/Create Cluster or Tower/Page_Add Cluster or Tower/textarea_promo'), 'beli rumah dapet istri')

WebUI.setText(findTestObject('ERP/Create Cluster or Tower/Page_Add Cluster or Tower/input_Gross Commission_ProjectFormgrossCommissionPercentage'), 
    '3')

WebUI.setText(findTestObject('ERP/Create Cluster or Tower/Page_Add Cluster or Tower/input_Outside Agent Commission_CreateCluster'), 
    '0.5')

WebUI.setText(findTestObject('ERP/Create Cluster or Tower/Page_Add Cluster or Tower/input_Commission Payment Term_CreateCluster'), 
    '3')

WebUI.setText(findTestObject('ERP/Create Cluster or Tower/Page_Add Cluster or Tower/input_Commission paid when of price paid_CreateCluster'), 
    '2')

WebUI.setText(findTestObject('ERP/Create Cluster or Tower/Page_Add Cluster or Tower/input_Commission Paid when_CreateCluster'), 
    '2')

WebUI.setText(findTestObject('ERP/Create Cluster or Tower/Page_Add Cluster or Tower/input_Lead Overidding (OR)_ProjectFormoverridingLeadPercentage'), 
    '2')

WebUI.setText(findTestObject('ERP/Create Cluster or Tower/Page_Add Cluster or Tower/input__ProjectFormoverriding99overriding'), 
    '2')

WebUI.setText(findTestObject('ERP/Create Cluster or Tower/Page_Add Cluster or Tower/input_Closing Fee (Agents)'), '2000000')

WebUI.setText(findTestObject('ERP/Create Cluster or Tower/Page_Add Cluster or Tower/input_Per Square Meter Price'), '1200000')

WebUI.setText(findTestObject('ERP/Create Cluster or Tower/Page_Add Cluster or Tower/closing_fee99.co'), '2000000')

WebUI.setText(findTestObject('ERP/Create Cluster or Tower/Page_Add Cluster or Tower/input_Closing Fee Payment Term'), '3')

