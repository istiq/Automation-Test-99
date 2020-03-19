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

Mobile.startApplication('/Users/istiqomah-/Downloads/99Crm-debug-1000413.apk', true)

Mobile.setText(findTestObject('Android/android.widget.EditText0 (5)'), '83829943719', 0)

Mobile.tap(findTestObject('Android/android.widget.Button0 - CONTINUE (1)'), 0)

Mobile.setText(findTestObject('Android/android.widget.EditText0 (6)'), '1', 0)

Mobile.setText(findTestObject('Android/android.widget.EditText0 (7)'), '1', 0)

Mobile.setText(findTestObject('Android/android.widget.EditText0 (8)'), '1', 0)

Mobile.setText(findTestObject('Android/android.widget.EditText0 (9)'), '1', 0)

Mobile.tap(findTestObject('Android/android.widget.Button0 - CONFIRM (1)'), 0)

Mobile.tap(findTestObject('Android/android.widget.TextView0 - NEXT'), 0)

Mobile.tap(findTestObject('Android/android.widget.TextView0 - NEXT'), 0)

Mobile.tap(findTestObject('Android/android.widget.TextView0 - NEXT'), 0)

Mobile.tap(findTestObject('Android/android.widget.TextView0 - NEXT'), 0)

Mobile.tap(findTestObject('Android/android.widget.Button0 - OPEN SETTINGS'), 0)

Mobile.pressBack()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Android/android.widget.TextView0 - DECLINE (1)'), 0)

Mobile.tap(findTestObject('Android/android.widget.Button0 - SUBMIT (1)'), 0)

Mobile.delay(25, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Android/android.widget.TextView0 - DECLINE (1)'), 0)

Mobile.tap(findTestObject('Android/android.widget.Button0 - SUBMIT (1)'), 0)

