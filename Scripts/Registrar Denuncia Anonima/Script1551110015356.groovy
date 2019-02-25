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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Menu_SDA/a_Realizar denuncia annima'))

WebUI.setText(findTestObject('Formulario_Anonimo_SDA/input_Datos personales_correo_'), 'melina@unmsm.edu.pe')

WebUI.click(findTestObject('Formulario_Anonimo_SDA/label_DP_S'))

WebUI.click(findTestObject('Formulario_Anonimo_SDA/label_DD_S'))

WebUI.setText(findTestObject('Page_SDA/input_Lugar donde se present l'), 'Quipucamayoc')

WebUI.delay(1)

WebUI.setText(findTestObject('Formulario_Anonimo_SDA/input_Fecha()_fecha_presentada'), '12022019')

not_run: WebUI.delay(3)

not_run: WebUI.sendKeys(findTestObject('Formulario_Anonimo_SDA/input_Fecha()_fecha_presentada'), Keys.chord(Keys.NUMPAD1, 
        Keys.NUMPAD2, Keys.NUMPAD0, Keys.NUMPAD2, Keys.NUMPAD2, Keys.NUMPAD0, Keys.NUMPAD1, Keys.NUMPAD9))

not_run: WebUI.executeJavaScript('document.getElementById(\'fecha_presentada\').value = \'10/02/2019\'', null)

WebUI.delay(1)

WebUI.setText(findTestObject('Page_SDA/input_Nombres y Apellidos_nom_'), 'Melina Vargas')

WebUI.setText(findTestObject('Page_SDA/input_Puesto(s) de trabajo_pue'), 'Rectora')

WebUI.selectOptionByValue(findTestObject('Page_SDA/select_Seleccione1551 INCUBADO'), 'ALIANZA ESTRATÉGICA', true)

WebUI.setText(findTestObject('Formulario_Anonimo_SDA/input_Fecha de los hechos_fech'), '12022019')

WebUI.setText(findTestObject('Page_SDA/textarea_Detalle lo sucedido()'), 'Perrovaca me mordio')

WebUI.setText(findTestObject('Page_SDA/input_Contenido de las pruebas'), 'Equis')

WebUI.click(findTestObject('Page_SDA/label_Estoy de acuerdo con el'))

WebUI.scrollToElement(findTestObject('Formulario_Anonimo_SDA/input_Estoy de acuerdo con el'), 0)

WebUI.waitForElementClickable(findTestObject('Formulario_Anonimo_SDA/input_Estoy de acuerdo con el'), 0)

WebUI.click(findTestObject('Page_SDA/input_Estoy de acuerdo con el'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_SDA/button_Aceptar'))

WebUI.delay(2)

WebUI.closeBrowser()

