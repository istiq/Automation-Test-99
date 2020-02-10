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

WebUI.click(findTestObject('LIANA/submission_liana/Page_Listing Management/button_CreateNewListing'))

WebUI.setText(findTestObject('LIANA/submission_liana/Page_Listing Management/input_Nama Owner_ownerName'), 'test aples')

WebUI.setText(findTestObject('Object Repository/LIANA/submission_liana/Page_Listing Management/input_No Telephone_ownerPhoneNumber'), 
    '081111111111')

WebUI.setText(findTestObject('LIANA/submission_liana/Page_Listing Management/input_Sumber Listing_listingSource'), 'saudara')

WebUI.click(findTestObject('LIANA/submission_liana/Page_Listing Management/dorpdown_typeProperty'))

WebUI.click(findTestObject('LIANA/submission_liana/Page_Listing Management/div_Rumah'))

WebUI.click(findTestObject('LIANA/submission_liana/Page_Listing Management/dropdown_typeListing'))

WebUI.click(findTestObject('LIANA/submission_liana/Page_Listing Management/div_Dijual'))

WebUI.setText(findTestObject('LIANA/submission_liana/Page_Listing Management/input_Harga_price'), '320000000')

WebUI.setText(findTestObject('LIANA/submission_liana/Page_Listing Management/input_Luas Bangunan_buildingSize'), '85')

WebUI.setText(findTestObject('LIANA/submission_liana/Page_Listing Management/input_Luas Tanah_landSize'), '90')

WebUI.setText(findTestObject('LIANA/submission_liana/Page_Listing Management/input_Kamar Tidur_bedrooms'), '2')

WebUI.setText(findTestObject('LIANA/submission_liana/Page_Listing Management/input_Kamar Mandi_bathrooms'), '1')

WebUI.click(findTestObject('LIANA/submission_liana/Page_Listing Management/dropdown_setifikat'))

WebUI.click(findTestObject('LIANA/submission_liana/Page_Listing Management/span_Hak Milik'))

WebUI.setText(findTestObject('LIANA/submission_liana/Page_Listing Management/input_Daya Listrik_electricity'), '1300')

WebUI.setText(findTestObject('LIANA/submission_liana/Page_Listing Management/input_Jumlah Lantai_floors'), '1')

WebUI.setText(findTestObject('LIANA/submission_liana/Page_Listing Management/input_Carport_carports'), '1')

WebUI.setText(findTestObject('LIANA/submission_liana/Page_Listing Management/input_Garasi_garages'), '1')

WebUI.setText(findTestObject('LIANA/submission_liana/Page_Listing Management/input_Umur Bangunan_buildingAge'), '4')

WebUI.setText(findTestObject('LIANA/submission_liana/Page_Listing Management/keterangan'), 'rumah mantap murah lokasi strategis')

WebUI.click(findTestObject('LIANA/submission_liana/Page_Listing Management/gmaps_gunakanLokasiSaatIni'))

WebUI.setText(findTestObject('LIANA/submission_liana/Page_Listing Management/judul_iklan_owner'), 'ini test aples')

WebUI.setText(findTestObject('LIANA/submission_liana/Page_Listing Management/judul_iklan'), 'ini test aples')

WebUI.click(findTestObject('LIANA/submission_liana/Page_Listing Management/label_RLG'))

WebUI.setText(findTestObject('LIANA/submission_liana/Page_Listing Management/input_Alamat yang diiklankan_adsAddress'), 
    'jalan dayeuh kolot')

WebUI.setText(findTestObject('LIANA/submission_liana/Page_Listing Management/textarea_Deskripsi Listing_adsDescription'), 
    'hee jangan terlalu serius')

WebUI.setText(findTestObject('LIANA/submission_liana/Page_Listing Management/textarea_Fasilitas atau selling point_facilities'), 
    'dqjhdjqhfiohqiugfeq')

WebUI.setText(findTestObject('LIANA/submission_liana/Page_Listing Management/input_Komisi_commission'), '10')

WebUI.click(findTestObject('LIANA/submission_liana/Page_Listing Management/label_Pasang Iklan mediaonline'))

WebUI.uploadFile(findTestObject('LIANA/submission_liana/Page_Listing Management/Page_Listing Management/upload'), 'C:\\Users\\99.co\\Downloads\\a.jpg')

WebUI.delay(5)

WebUI.setText(findTestObject('LIANA/submission_liana/Page_Listing Management/Page_Listing Management/input_Link Video_upload-video'), 
    'https://www.youtube.com/watch?v=p7hegEHi9CY')

WebUI.delay(5)

WebUI.click(findTestObject('LIANA/submission_liana/Page_Listing Management/Page_Listing Management/add_video'))

WebUI.delay(5)

WebUI.click(findTestObject('LIANA/submission_liana/Page_Listing Management/div_KIRIM PERMINTAAN LISTING'))

