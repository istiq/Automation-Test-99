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

WebUI.openBrowser('https://shortlist.goodprop.co/#/10048')

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('shortlist/Page_Shortlists Landing Page/gambar listing'), 0)

WebUI.click(findTestObject('shortlist/Page_Shortlists Landing Page/gambar listing'))

WebUI.click(findTestObject('shortlist/Page_Shortlisting Detail Property/i_button_right'))

WebUI.click(findTestObject('shortlist/Page_Shortlisting Detail Property/i_button_right'))

WebUI.click(findTestObject('shortlist/Page_Shortlisting Detail Property/i_button_left'))

WebUI.click(findTestObject('shortlist/Page_Shortlisting Detail Property/i_button_left'))

WebUI.verifyMatch(harga_1, harga_2, false)

WebUI.verifyMatch(deskripsi_1, deskripsi_2, false)

WebUI.verifyMatch(lokasi_1, lokasi_2, false)

WebUI.click(findTestObject('shortlist/Page_Shortlisting Detail Property/span_2 Kamar Tidur'))

WebUI.verifyTextPresent('2 Kamar Tidur', false)

WebUI.click(findTestObject('shortlist/Page_Shortlisting Detail Property/span_1 Kamar Mandi'))

WebUI.verifyTextPresent('1 Kamar Mandi', false)

WebUI.click(findTestObject('shortlist/Page_Shortlisting Detail Property/span_1 jumlah lantai'))

WebUI.verifyTextPresent('1', false)

WebUI.click(findTestObject('shortlist/Page_Shortlisting Detail Property/span_72 m2 luas tanah'))

WebUI.verifyTextPresent('72 m', false)

WebUI.click(findTestObject('shortlist/Page_Shortlisting Detail Property/span_42 m2 luas bangunan'))

WebUI.verifyTextPresent('42 m', false)

WebUI.click(findTestObject('shortlist/Page_Shortlisting Detail Property/span_0 carport'))

WebUI.verifyTextPresent('0', false)

WebUI.click(findTestObject('shortlist/Page_Shortlisting Detail Property/span_1300 garasi'))

WebUI.verifyTextPresent('1300', false)

WebUI.click(findTestObject('shortlist/Page_Shortlisting Detail Property/button_Lihat Selengkapnya'))

WebUI.click(findTestObject('shortlist/Page_Shortlisting Detail Property/button_Tutup Selengkapnya'))

WebUI.click(findTestObject('shortlist/Page_Shortlists Landing Page/listing2'), FailureHandling.STOP_ON_FAILURE)

