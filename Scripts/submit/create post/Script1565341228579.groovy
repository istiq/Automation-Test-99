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

WebUI.click(findTestObject('create post/create post page1/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/a_Mau Jual Properti'))

WebUI.click(findTestObject('create post/create post page1/Page_Beli Properti Lebih Mudah di 99co  Rumah Apartemen Ruko Dll/div_Pasang iklan untuk                            Pemilik Langsung'))

WebUI.click(findTestObject('create post/create post page1/Page_Daftarkan Properti/label_Rumah'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('create post/create post page1/Page_Daftarkan Properti/label_Dijual'))

WebUI.setText(findTestObject('create post/create post page1/Page_Daftarkan Properti/input_Judul_PropertyBasicInfoFormtitle'), 
    'test')

WebUI.setText(findTestObject('create post/create post page1/Page_Daftarkan Properti/textarea_Deskripsi_PropertyBasicInfoFormdescription'), 
    'ini cuman test yaaaaa')

WebUI.click(findTestObject('create post/create post page1/Page_Daftarkan Properti/button_Simpan dan Lanjutkan'))

WebUI.selectOptionByValue(findTestObject('create post/create post page 2/Page_Daftarkan Properti - Lokasi/select_Pilih Provinsi'), 
    'Jakarta', false)

WebUI.click(findTestObject('create post/create post page 2/Page_Daftarkan Properti - Lokasi/span_Pilih Kota_select2-selection__arrow'))

WebUI.click(findTestObject('create post/create post page 2/Page_Daftarkan Properti - Lokasi/li_Jakarta Selatan'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('create post/create post page 2/Page_Daftarkan Properti - Lokasi/span_Pilih Kecamatan_select2-selection__arrow'))

WebUI.click(findTestObject('create post/create post page 2/Page_Daftarkan Properti - Lokasi/li_Pancoran'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('create post/create post page 2/Page_Daftarkan Properti - Lokasi/input_Info Alamat_'), 'kelurahan cigending rt06 rw10')

WebUI.setText(findTestObject('create post/create post page 2/Page_Daftarkan Properti - Lokasi/input_Nama Cluster_'), 'pondok r raudhi')

WebUI.setText(findTestObject('create post/create post page 2/Page_Daftarkan Properti - Lokasi/input_Nama Jalan_'), 'jalan cijambe wetan')

WebUI.setText(findTestObject('create post/create post page 2/Page_Daftarkan Properti - Lokasi/input_Nama Kompleks_'), 'komplek r raudhi')

WebUI.setText(findTestObject('create post/create post page 2/Page_Daftarkan Properti - Lokasi/input_Wilayah Tambahan_'), 
    'pas belokan')

WebUI.click(findTestObject('create post/create post page 2/Page_Daftarkan Properti - Lokasi/button_Simpan dan Lanjutkan'))

WebUI.setText(findTestObject('create post/create post page 3/Page_Daftarkan Properti - Detail Properti/input_Luas Tanah_PropertyDetailsFormlandSize'), 
    '200')

WebUI.setText(findTestObject('create post/create post page 3/Page_Daftarkan Properti - Detail Properti/input_Luas Bangunan_PropertyDetailsFormbuildingSize'), 
    '100')

WebUI.setText(findTestObject('create post/create post page 3/Page_Daftarkan Properti - Detail Properti/input_Harga_PropertyDetailsFormdisplayPrice'), 
    '500000000')

WebUI.click(findTestObject('create post/create post page 3/Page_Daftarkan Properti - Detail Properti/input_Harga ini masih dapat dinego_PropertyDetailsFormnegoType'))

WebUI.selectOptionByValue(findTestObject('create post/create post page 3/Page_Daftarkan Properti - Detail Properti/select_kamar tidur'), 
    '2', false)

WebUI.selectOptionByValue(findTestObject('create post/create post page 3/Page_Daftarkan Properti - Detail Properti/select_kamarmandi'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('create post/create post page 3/Page_Daftarkan Properti - Detail Properti/select_kamarpembantu'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('create post/create post page 3/Page_Daftarkan Properti - Detail Properti/select_kamarmandipembantu'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('create post/create post page 3/Page_Daftarkan Properti - Detail Properti/select_jumlahlantai'), 
    '2', false)

WebUI.selectOptionByValue(findTestObject('create post/create post page 3/Page_Daftarkan Properti - Detail Properti/select_garasi'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('create post/create post page 3/Page_Daftarkan Properti - Detail Properti/select_carports'), 
    '1', false)

WebUI.setText(findTestObject('create post/create post page 3/Page_Daftarkan Properti - Detail Properti/input_Daya Listrik'), 
    '1300')

WebUI.selectOptionByValue(findTestObject('create post/create post page 3/Page_Daftarkan Properti - Detail Properti/select_PilihUtaraBaratSelatanTimurBarat LautBarat DayaTenggaraTimur LautHoek'), 
    '2', false)

WebUI.setText(findTestObject('create post/create post page 3/Page_Daftarkan Properti - Detail Properti/input_Tahun Dibangun_PropertyDetailsFormyearBuilt'), 
    '2015', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('create post/create post page 3/Page_Daftarkan Properti - Detail Properti/select_Pilihinterior'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('create post/create post page 3/Page_Daftarkan Properti - Detail Properti/select_PilihBaruLama'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('create post/create post page 3/Page_Daftarkan Properti - Detail Properti/select_Pilihtipemarket'), 
    '1', false)

WebUI.click(findTestObject('create post/create post page 3/Page_Daftarkan Properti - Detail Properti/label_AC'))

WebUI.click(findTestObject('create post/create post page 3/Page_Daftarkan Properti - Detail Properti/button_Lanjutkan Upload Foto'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.uploadFile(findTestObject('create post/create post page 4/Page_Daftarkan Properti - Unggah Foto/Page_Daftarkan Properti - Unggah Foto/input_Gunakan pengunggah ringan_files'), 
    'C:\\Users\\99.co\\Katalon Studio\\desktop\\mulki.jpg')

WebUI.verifyImagePresent(findTestObject('create post/create post page 4/Page_Daftarkan Properti - Unggah Foto/div_verifikasi gambar'))

WebUI.click(findTestObject('create post/create post page 4/Page_Daftarkan Properti - Unggah Foto/button_Jadikan Gambar Utama'))

WebUI.closeBrowser()

