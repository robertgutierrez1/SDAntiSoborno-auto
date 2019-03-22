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

WebUI.navigateToUrl('http://172.16.179.243:4201/')

WebUI.click(findTestObject('Iniciar Sesion/Iniciar_Sesion/a_Iniciar Sesin'))

WebUI.setText(findTestObject('Iniciar Sesion/Iniciar_Sesion/input_CANAL DE DENUNCIAS ANTIS'), user)

WebUI.setText(findTestObject('Iniciar Sesion/Iniciar_Sesion/input_unmsm.edu.pe_campoContra'), password)

WebUI.click(findTestObject('Iniciar Sesion/Iniciar_Sesion/button_Iniciar Sesin'))

not_run: WebUI.closeBrowser()

