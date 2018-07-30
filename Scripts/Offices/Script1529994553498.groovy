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

WebUI.setEncryptedText(findTestObject('Page_Log in - Wandering Tail Oy (2)/input_Password'), '8uXumb4ehpEnFxeHmjm1VQ==')

WebUI.click(findTestObject('Page_Log in - Wandering Tail Oy (2)/input_btn btn-primary col-xs-1'))

WebUI.click(findTestObject('Page_Homepage - Wandering Tail Oy (6)/a_Offices'))

WebUI.click(findTestObject('Page_My offices - Wandering Tail Oy (5)/a_Change image'))

WebUI.takeScreenshot('C:\\Users\\tllabra\\Desktop\\kuva2.jpg')

//WebUI.uploadFile(findTestObject('Page_Change image - Wandering Tail (1)/label_Upload image'), 'C:\\Users\\tllabra\\Desktop\\koira.jpg')
//WebUI.click(findTestObject('Page_Change image - Wandering Tail (1)/label_Upload image'))

CustomKeywords.'omakeyword.WebUICustomKeyword.uploadFile'(findTestObject('Page_Change image - Wandering Tail (1)/label_Upload image'), 
    'C:\\Users\\tllabra\\Desktop\\koira.jpg')

WebUI.click(findTestObject('Object Repository/Page_Change image - Wandering Tail (4)/button_Save image'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My offices - Wandering Tail Oy (10)/div_Office image updated.'), 20)

WebUI.click(findTestObject('Page_My offices - Wandering Tail Oy (6)/a_Change map marker'))

WebUI.selectOptionByValue(findTestObject('Page_Change map marker - Wandering (1)/select_Please select...Dog foo'), '11', 
    true)

WebUI.click(findTestObject('Page_Change map marker - Wandering (1)/input_btn btn-primary col-xs-1'))

WebUI.click(findTestObject('Page_My offices - Wandering Tail Oy (7)/a_Change coordinates'))

WebUI.click(findTestObject('Page_Change coordinates - Wandering (2)/div_-Leaflet   OpenStreetMap'))

WebUI.click(findTestObject('Page_Change coordinates - Wandering (2)/input_btn btn-primary'))

WebUI.click(findTestObject('Page_My offices - Wandering Tail Oy (7)/a_Change name'))

WebUI.click(findTestObject('Page_Change office name - Wandering/div_Office name'))

WebUI.setText(findTestObject('Page_Change office name - Wandering/input_Name'), 'hei')

WebUI.click(findTestObject('Page_Change office name - Wandering/input_btn btn-primary'))

WebUI.click(findTestObject('Page_My offices - Wandering Tail Oy (8)/a_Change description'))

WebUI.setText(findTestObject('Page_Change description - Wandering/textarea_Description'), 'koira')

WebUI.click(findTestObject('Page_Change description - Wandering/input_btn btn-primary'))

WebUI.click(findTestObject('Page_My offices - Wandering Tail Oy (8)/a_Change contact information'))

WebUI.setText(findTestObject('Page_Change contact infromation - W/input_Street'), '123')

WebUI.setText(findTestObject('Page_Change contact infromation - W/input_ZipCode'), '123')

WebUI.setText(findTestObject('Page_Change contact infromation - W/input_City'), '123')

WebUI.setText(findTestObject('Page_Change contact infromation - W/input_Country'), '123')

WebUI.setText(findTestObject('Page_Change contact infromation - W/input_Phone'), '123')

WebUI.setText(findTestObject('Page_Change contact infromation - W/input_Email'), '123')

WebUI.setText(findTestObject('Page_Change contact infromation - W/input_Facebook'), '123')

WebUI.setText(findTestObject('Page_Change contact infromation - W/input_Website'), '123')

WebUI.click(findTestObject('Page_Change contact infromation - W/input_btn btn-primary'))

WebUI.click(findTestObject('Page_My offices - Wandering Tail Oy (8)/a_Change opening hours'))

WebUI.setText(findTestObject('Page_Change opening hours - Wanderi/textarea_OpeningHours'), '8-16')

WebUI.click(findTestObject('Page_Change opening hours - Wanderi/input_btn btn-primary'))

WebUI.closeBrowser()
