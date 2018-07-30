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

WebUI.setText(findTestObject('Page_Log in - Wandering Tail Oy (2)/input_Email'), 'eemeli1400@student.hamk.fi')

WebUI.setText(findTestObject('Page_Log in - Wandering Tail Oy (2)/input_Password'), 'wandering1')

WebUI.click(findTestObject('Page_Log in - Wandering Tail Oy (2)/input_btn btn-primary col-xs-1'))

CustomKeywords.'omakeyword.WebUICustomKeyword2'(findTestObject('Page_Homepage - Wandering Tail Oy (6)/a_Offices'))

//WebUI.click(findTestObject('Page_Homepage - Wandering Tail Oy (4)/a_Buy offices'))

//WebUI.click(findTestObject('Page_Buy office slots - Wandering T (5)/a_BUY'))

//WebUI.waitForElementVisible(findTestObject('Page_Buy office slots - Wandering T (5)/button_BUY'), 1000)

//WebUI.click(findTestObject('Page_Buy office slots - Wandering T (5)/button_BUY'))

//WebUI.acceptAlert()

