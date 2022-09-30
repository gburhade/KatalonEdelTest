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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://edelivery.cse-dev.tibcocloud.com/storefront/index.ep')

WebUI.click(findTestObject('Object Repository/EdeliveryEmployeeMyProfileFields_OR/Page_eDelivery Site/a_SIGN IN'))

WebUI.setText(findTestObject('Object Repository/EdeliveryEmployeeMyProfileFields_OR/Page_TIBCO Accounts/input_Email address_email'), 
    'gmadhavr@tibco.com')

WebUI.click(findTestObject('Object Repository/EdeliveryEmployeeMyProfileFields_OR/Page_TIBCO Accounts/button_NEXT'))

WebUI.setEncryptedText(findTestObject('Object Repository/EdeliveryEmployeeMyProfileFields_OR/Page_TIBCO Accounts/input_Password_password'), 
    'jUgwvQqof344mstwBWspkA==')

WebUI.click(findTestObject('Object Repository/EdeliveryEmployeeMyProfileFields_OR/Page_TIBCO Accounts/button_TIBCO LOGIN'))

WebUI.click(findTestObject('Object Repository/EdeliveryEmployeeMyProfileFields_OR/Page_eDelivery Site/a_MY ACCOUNT'))

WebUI.click(findTestObject('Object Repository/EdeliveryEmployeeMyProfileFields_OR/Page_Download History/a_My Profile'))

WebUI.verifyElementText(findTestObject('Object Repository/EdeliveryEmployeeMyProfileFields_OR/Page_My Account Profile/b_gmadhavrtibco.com'), 
    'gmadhavr@tibco.com')

WebUI.verifyElementText(findTestObject('Object Repository/EdeliveryEmployeeMyProfileFields_OR/Page_My Account Profile/b_Gaurav'), 
    'Gaurav')

WebUI.verifyElementText(findTestObject('Object Repository/EdeliveryEmployeeMyProfileFields_OR/Page_My Account Profile/b_Burhade'), 
    'Burhade')

WebUI.verifyElementText(findTestObject('Object Repository/EdeliveryEmployeeMyProfileFields_OR/Page_My Account Profile/b_TIBCO Software Inc'), 
    'TIBCO Software Inc.')

WebUI.verifyElementText(findTestObject('Object Repository/EdeliveryEmployeeMyProfileFields_OR/Page_My Account Profile/b_IT - Custom Software Engineering'), 
    'IT - Custom Software Engineering')

WebUI.click(findTestObject('Object Repository/EdeliveryEmployeeMyProfileFields_OR/Page_My Account Profile/a_SIGN OUT'))

WebUI.closeBrowser()

