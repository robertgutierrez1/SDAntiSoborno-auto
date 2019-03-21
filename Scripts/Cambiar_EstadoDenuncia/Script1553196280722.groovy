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

WebUI.callTestCase(findTestCase('Iniciar_Sesion'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Cambiar_EstadoDenuncia/button'))

WebUI.delay(1)

'Editar los inputs para otros estados, ya que no son span\'s'
WebUI.selectOptionByValue(findTestObject('Cambiar_EstadoDenuncia/select_RecepcionadoEn ProcesoP'), 'En Proceso', true)

WebUI.click(findTestObject('Cambiar_EstadoDenuncia/input_Cancelar_btn btn-success'))

WebUI.closeBrowser()

