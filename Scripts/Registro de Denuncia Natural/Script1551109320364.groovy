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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://172.16.179.243:4200/')

WebUI.click(findTestObject('Object Repository/Page_SDA/a_Realizar denuncia formal'))

WebUI.click(findTestObject('Object Repository/Page_SDA/label_Natural'))

WebUI.setText(findTestObject('Object Repository/Page_SDA/input_Nombres y Apellidos()_no'), 'Melinna Rojas Vargas')

WebUI.setText(findTestObject('Object Repository/Page_SDA/input_DNI()_dni_persona'), '70904040')

WebUI.setText(findTestObject('Object Repository/Page_SDA/input_Tlefono de contacto()_te'), '933150272')

WebUI.setText(findTestObject('Object Repository/Page_SDA/input_Ingrese el correo electr'), 'melinna.tu.diabla@hotmail.com')

WebUI.click(findTestObject('Object Repository/Page_SDA/label_S'))

WebUI.click(findTestObject('Object Repository/Page_SDA/label_S'))

WebUI.setText(findTestObject('Object Repository/Page_SDA/input_Lugar donde se present l'), 'Quipucamayoc')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_SDA/select_Seleccione()1551 INCUBA'), 'PROYECTO QUIPUCAMAYOC', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_SDA/textarea_Detalle lo sucedido() (1)'), 'Acoso Laboral')

WebUI.setText(findTestObject('Object Repository/Page_SDA/input_Contenido de las pruebas (1)'), 'Bxo')

WebUI.click(findTestObject('Object Repository/Page_SDA/label_Estoy de acuerdo con el'))

WebUI.click(findTestObject('Object Repository/Page_SDA/input_Estoy de acuerdo con el'))

WebUI.click(findTestObject('Object Repository/Page_SDA/button_Aceptar'))

WebUI.closeBrowser()

