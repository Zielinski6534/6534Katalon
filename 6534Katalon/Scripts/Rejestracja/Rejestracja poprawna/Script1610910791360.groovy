import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Object Repository/Rejestracja poprawna/Page_My Store/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Rejestracja poprawna/Page_Login - My Store/input_Email address_email_create'), 
    findTestData('EmailData').getValue("email", 1))

WebUI.click(findTestObject('Object Repository/Rejestracja poprawna/Page_Login - My Store/span_Create an account'))

WebUI.setText(findTestObject('Object Repository/Rejestracja poprawna/Page_Login - My Store/input__customer_firstname'), 
    'jan')

WebUI.setText(findTestObject('Object Repository/Rejestracja poprawna/Page_Login - My Store/input__customer_lastname'), 'kowalski')

WebUI.setEncryptedText(findTestObject('Object Repository/Rejestracja poprawna/Page_Login - My Store/input__passwd'), 'iGDxf8hSRT4=')

WebUI.setText(findTestObject('Object Repository/Rejestracja poprawna/Page_Login - My Store/input__address1'), 'zlota')

WebUI.setText(findTestObject('Object Repository/Rejestracja poprawna/Page_Login - My Store/input__city'), 'wroclaw')

WebUI.selectOptionByValue(findTestObject('Object Repository/Rejestracja poprawna/Page_Login - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Rejestracja poprawna/Page_Login - My Store/input__postcode'), '11111')

WebUI.setText(findTestObject('Object Repository/Rejestracja poprawna/Page_Login - My Store/input__phone_mobile'), '123123123')

WebUI.click(findTestObject('Object Repository/Rejestracja poprawna/Page_Login - My Store/i_Register_icon-chevron-right right'))

WebUI.closeBrowser()

