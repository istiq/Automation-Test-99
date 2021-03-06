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

WebUI.click(findTestObject('ERP/Create Project/Page_Create User/span_Inventory'))

WebUI.click(findTestObject('ERP/Create Project/Page_Create User/span_Projects'))

WebUI.click(findTestObject('ERP/Create Project/Page_Projects/a_Add Project'))

WebUI.delay(3)

WebUI.setText(findTestObject('ERP/Create Project/Page_Add Project/input_Project Name_ProjectFormname'), 'mulki test2')

WebUI.setText(findTestObject('ERP/Create Project/Page_Add Project/input_Url Video_ProjectFormvideoUrl'), 'https://www.youtube.com/watch?v=AZ8S4s9uQxw')

WebUI.setText(findTestObject('ERP/Create Project/Page_Add Project/cluster or tower'), 'coba')

WebUI.click(findTestObject('ERP/Create Project/Page_Add Project/span_Recommended_cbx-icon'))

WebUI.setText(findTestObject('ERP/Create Project/Page_Add Project/input_Facilities_select2-search__field'), 'atm')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ERP/Create Project/Page_Add Project/input_Facilities_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('ERP/Create Project/Page_Add Project/input_Other Facilities_ProjectFormotherFacilities'), 'masjid besar')

WebUI.click(findTestObject('ERP/Create Project/Page_Add Project/span_Select a developer'))

WebUI.setText(findTestObject('ERP/Create Project/Page_Add Project/input__select2-search__developer'), 'sinarmas')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ERP/Create Project/Page_Add Project/input__select2-search__developer'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ERP/Create Project/Page_Add Project/span_Select Province'))

WebUI.setText(findTestObject('ERP/Create Project/Page_Add Project/input__select2-search__provinsi'), 'jawa barat')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ERP/Create Project/Page_Add Project/input__select2-search__provinsi'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ERP/Create Project/Page_Add Project/span_Select District'))

WebUI.setText(findTestObject('ERP/Create Project/Page_Add Project/input__select2-search__district'), 'kota bandung')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ERP/Create Project/Page_Add Project/input__select2-search__district'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ERP/Create Project/Page_Add Project/span_Select Sub District'))

WebUI.setText(findTestObject('ERP/Create Project/Page_Add Project/input__select2-search__subdistrict'), 'ujung berung')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ERP/Create Project/Page_Add Project/input__select2-search__subdistrict'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('ERP/Create Project/Page_Add Project/input_Launch Date_ProjectFormlaunchDate'), '2020-02-10')

WebUI.sendKeys(findTestObject('ERP/Create Project/Page_Add Project/input_Launch Date_ProjectFormlaunchDate'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('ERP/Create Project/Page_Add Project/span_AccountOwner'))

WebUI.setText(findTestObject('ERP/Create Project/Page_Add Project/input__select2-search__accountOwner'), 'auliya')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ERP/Create Project/Page_Add Project/input__select2-search__accountOwner'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/ERP/Create Project/Page_Add Project/input_Project Types_select2-search__field'), 
    'landed')

WebUI.sendKeys(findTestObject('ERP/Create Project/Page_Add Project/input_Project Types_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('ERP/Create Project/Page_Add Project/input_Total Inventory_ProjectFormtotalInventoryUnitCount'), 
    '10')

WebUI.setText(findTestObject('ERP/Create Project/Page_Add Project/input_Marketable Inventory_ProjectFormmarketableInventoryUnitCount'), 
    '8')

WebUI.setText(findTestObject('ERP/Create Project/Page_Add Project/input_Target Unit per Quarter_ProjectFormtargetUnitQuarterCount'), 
    '2')

WebUI.setText(findTestObject('Object Repository/ERP/Create Project/Page_Add Project/input_Start Price_projectform-averageprice-disp'), 
    '500000000')

WebUI.setText(findTestObject('Object Repository/ERP/Create Project/Page_Add Project/input_GMV Unit Price_projectform-gmvunitprice-disp'), 
    '200000000')

WebUI.setText(findTestObject('Object Repository/ERP/Create Project/Page_Add Project/textarea_Promo_ProjectFormpromo'), 'beli rumah gratis ac')

WebUI.setText(findTestObject('Object Repository/ERP/Create Project/Page_Add Project/input_Gross Commission_ProjectFormgrossCommissionPercentage'), 
    '3')

WebUI.setText(findTestObject('Object Repository/ERP/Create Project/Page_Add Project/input__ProjectFormoverriding99Percentage'), 
    '2')

WebUI.setText(findTestObject('Object Repository/ERP/Create Project/Page_Add Project/input_Commission Invoice To Collection Time_ProjectFormcommissionInvoiceToCollectionTime'), 
    '7')

WebUI.setText(findTestObject('Object Repository/ERP/Create Project/Page_Add Project/input_Outside Agent Commission_ProjectFormoutsideAgentCommissionPercentage'), 
    '1')

WebUI.setText(findTestObject('Object Repository/ERP/Create Project/Page_Add Project/input_Commission Payment Method_ProjectFormcommissionPaymentMethod'), 
    'instalment')

WebUI.setText(findTestObject('Object Repository/ERP/Create Project/Page_Add Project/input_Commission Payment Term_ProjectFormcommissionPaymentTerm'), 
    'instalment')

WebUI.click(findTestObject('Object Repository/ERP/Create Project/Page_Add Project/div_rangeDateValidaty'))

WebUI.click(findTestObject('Object Repository/ERP/Create Project/Page_Add Project/li_Last 7 Days'))

WebUI.setText(findTestObject('Object Repository/ERP/Create Project/Page_Add Project/input_Commission paid when of price paid_ProjectPaymentTermRule0paidPercentage'), 
    '2')

WebUI.setText(findTestObject('Object Repository/ERP/Create Project/Page_Add Project/input_Commission Paid when_ProjectPaymentTermRule0pricePaidPercentage'), 
    '2')

WebUI.setText(findTestObject('Object Repository/ERP/Create Project/Page_Add Project/input_OR paid when of price paid_ProjectPaymentTermRule1paidPercentage'), 
    '2')

WebUI.setText(findTestObject('ERP/Create Project/Page_Add Project/overriding_paid_when'), '2')

WebUI.setText(findTestObject('Object Repository/ERP/Create Project/Page_Add Project/input_Per Square Meter Price_projectform-persquaremeterprice-disp'), 
    '3000000000')

WebUI.setText(findTestObject('ERP/Create Project/Page_Add Project/input_Closing Fee (Agents)_ProjectIncentiveNonCalculatedRule2value'), 
    '100000')

WebUI.setText(findTestObject('ERP/Create Project/Page_Add Project/input_Closing Fee (Agents) Invoice To Collection Time_ProjectFormclosingFeeToAgentInvoiceToCollectionTime'), 
    '7')

WebUI.setText(findTestObject('Object Repository/ERP/Create Project/Page_Add Project/input_Closing Fee (99co)_ProjectIncentiveNonCalculatedRule3value'), 
    '7')

WebUI.setText(findTestObject('Object Repository/ERP/Create Project/Page_Add Project/input_Closing Fee Payment Method_ProjectFormclosingFeePaymentMethod'), 
    '100000')

WebUI.setText(findTestObject('Object Repository/ERP/Create Project/Page_Add Project/input_Closing Fee Payment Term_ProjectFormclosingFeePaymentTerm'), 
    '200000')

WebUI.setText(findTestObject('Object Repository/ERP/Create Project/Page_Add Project/monetary_rewardAgent'), '200000')

WebUI.setText(findTestObject('Object Repository/ERP/Create Project/Page_Add Project/monetary_rewads99co'), '150000')

WebUI.setText(findTestObject('ERP/Create Project/Page_Add Project/input_Monetary Reward Payment Method_ProjectFormmonetaryRewardPaymentMethod'), 
    'installment')

WebUI.setText(findTestObject('ERP/Create Project/Page_Add Project/input_Monetary Reward Invoice To Collection Time_ProjectFormmonetaryRewardInvoiceToCollectionTime'), 
    '7')

WebUI.setText(findTestObject('ERP/Create Project/Page_Add Project/Other_Incentives'), '150000')

WebUI.click(findTestObject('ERP/Create Project/Page_Add Project/Status'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ERP/Create Project/Page_Add Project/Search_Status'), 'active')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('ERP/Create Project/Page_Add Project/Search_Status'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ERP/Create Project/Page_Add Project/span_Select telesales'))

WebUI.setText(findTestObject('ERP/Create Project/Page_Add Project/input__select2-search__telesales'), 'dina')

WebUI.delay(3)

WebUI.click(findTestObject('ERP/Create Project/Page_Add Project/Create_ProjectFinished'))

WebUI.delay(3)

WebUI.click(findTestObject('ERP/Create Project/Page_Add Project/Page_Project Articles/nama_project test'))

WebUI.delay(2)

WebUI.verifyTextPresent('mulki test2', false)

WebUI.click(findTestObject('ERP/Create Project/Page_Add Project/Page_Project Articles/a_https99coidprojectsproject-test-1842'))

