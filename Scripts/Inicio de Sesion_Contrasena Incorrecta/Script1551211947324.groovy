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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://172.16.179.243:4200/')

WebUI.click(findTestObject('Object Repository/Login_SDA/Page_SDA/a_Iniciar Sesin'))

WebUI.setText(findTestObject('Object Repository/Login_SDA/Page_SDA/input_CANAL DE DENUNCIAS ANTIS'), 'carlos.torres24')

WebUI.setEncryptedText(findTestObject('Object Repository/Login_SDA/Page_SDA/input_unmsm.edu.pe_form-contro'), '9McOUIL6o1IepyqU/P40BA==')

WebUI.click(findTestObject('Object Repository/Login_SDA/Page_SDA/button_Iniciar Sesin'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Login_SDA/Page_SDA/button_Aceptar'))

WebUI.closeBrowser()

