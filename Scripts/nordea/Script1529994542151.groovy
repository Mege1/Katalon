import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://develop-wanderingtailweb.azurewebsites.net/')

WebUI.setText(findTestObject('Page_Log in - Wandering Tail Oy (3)/input_Email'), 'eemeli1400@student.hamk.fi')

WebUI.setText(findTestObject('Page_Log in - Wandering Tail Oy (3)/input_Password'), 'wandering1')

WebUI.click(findTestObject('Page_Log in - Wandering Tail Oy (3)/input_btn btn-primary col-xs-1'))

WebUI.click(findTestObject('Page_Homepage - Wandering Tail Oy (7)/a_Buy WT -credits'))

WebUI.click(findTestObject('Page_Buy WT-credits - Wandering Tai/a_BUY'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Buy WT-credits - Wandering Tai (1)/button_BUY'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Page_Valitse maksutapa/input_method-btn-1'))

WebUI.click(findTestObject('Page_Solo E-maksu63085446(0001) kyt/td_Kyttjtunnus'))

WebUI.setText(findTestObject('Page_Solo E-maksu63085446(0001) kyt/input_A02Y_USERID'), '123456')

WebUI.click(findTestObject('Page_Solo E-maksu63085446(0001) kyt/td_'))

WebUI.setText(findTestObject('Page_Solo E-maksu63085446(0001) kyt/input_A02Y_IDNBR'), '1234')

WebUI.click(findTestObject('Page_Solo E-maksu63085446(0001) kyt/input_Ok'))

WebUI.setText(findTestObject('Page_Solo E-maksu63085446(0002) vah/input_A03Y_PMTCONNB'), '1234')

WebUI.click(findTestObject('Page_Solo E-maksu63085446(0002) vah/input_A03Y_SAVEBTN'))

WebUI.click(findTestObject('Page_Solo E-maksu63085446(0003) hyv/input_button'))

WebUI.click(findTestObject('Page_Payment success - Wandering Ta/a_Back to home'))

WebUI.closeBrowser()

