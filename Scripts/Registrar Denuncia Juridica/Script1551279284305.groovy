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

WebUI.navigateToUrl('http://172.16.179.243:4200/formulario/juridica')

WebUI.click(findTestObject('Object Repository/Registrar Denuncia Juridica/Page_SDA/label_Jurdica'))

WebUI.setText(findTestObject('Object Repository/Registrar Denuncia Juridica/Page_SDA/input_Razn Social()_razon_soci'), 'Quipucamayoc SAC')

WebUI.setText(findTestObject('Object Repository/Registrar Denuncia Juridica/Page_SDA/input_RUC()_ruc_persona'), '2032432165')

WebUI.setText(findTestObject('Object Repository/Registrar Denuncia Juridica/Page_SDA/input_Direccin_dir_persona'), 'Jr.. German Amenaga 756')

WebUI.setText(findTestObject('Object Repository/Registrar Denuncia Juridica/Page_SDA/input_Tlefono de contacto()_te'), '980630721')

WebUI.setText(findTestObject('Object Repository/Registrar Denuncia Juridica/Page_SDA/input_Representante Legal()_re'), 'Melinna Rojas')

WebUI.setText(findTestObject('Object Repository/Registrar Denuncia Juridica/Page_SDA/input_Correo Electrnico()_corr'), 'atencion.quipu@unmsm.edu.pe')

WebUI.click(findTestObject('Object Repository/Registrar Denuncia Juridica/Page_SDA/label_S'))

WebUI.setText(findTestObject('Object Repository/Registrar Denuncia Juridica/Page_SDA/input_Lugar donde se present l'), 'Rectorado UNMSM')

WebUI.delay(1)

WebUI.setText(findTestObject('Registrar Denuncia Juridica/Page_SDA/input_Fecha de los hechos_fech'), '20/02/2019')

WebUI.setText(findTestObject('Object Repository/Registrar Denuncia Juridica/Page_SDA/input_Nombres y Apellidos_nom_'), 'Carlos Rodriguez')

WebUI.setText(findTestObject('Object Repository/Registrar Denuncia Juridica/Page_SDA/input_Puesto(s) de trabajo_pue'), 'Decano')

WebUI.selectOptionByValue(findTestObject('Object Repository/Registrar Denuncia Juridica/Page_SDA/select_Seleccione1551 INCUBADO'), 
    'PROYECTO QUIPUCAMAYOC', true)

WebUI.delay(1)

WebUI.setText(findTestObject('Registrar Denuncia Juridica/Page_SDA/input_Fecha()_fecha_presentada'), '17/02/2019')

WebUI.setText(findTestObject('Object Repository/Registrar Denuncia Juridica/Page_SDA/textarea_Detalle lo sucedido()'), 'Actos ilicitos')

WebUI.setText(findTestObject('Object Repository/Registrar Denuncia Juridica/Page_SDA/input_Contenido de las pruebas'), 'Imagenes comprometedoras')

WebUI.delay(1)

WebUI.click(findTestObject('Registrar Denuncia Juridica/Page_SDA/label_Estoy de acuerdo con el'))

not_run: WebUI.scrollToElement(findTestObject('Registrar Denuncia Juridica/Page_SDA/label_Estoy de acuerdo con el'), 1)

not_run: WebUI.waitForElementClickable(findTestObject('Registrar Denuncia Juridica/Page_SDA/label_Estoy de acuerdo con el'), 
    1)

not_run: WebUI.delay(2)

WebUI.delay(1)

WebUI.click(findTestObject('Registrar Denuncia Juridica/Page_SDA/input_Estoy de acuerdo con el'))

WebUI.click(findTestObject('Object Repository/Registrar Denuncia Juridica/Page_SDA/button_Aceptar'))

not_run: WebUI.delay(2)

WebUI.closeBrowser()

