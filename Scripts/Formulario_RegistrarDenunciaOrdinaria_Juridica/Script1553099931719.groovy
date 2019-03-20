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

WebUI.navigateToUrl('http://172.16.179.243:4201/formulario/juridica')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_Razn Social()_razon_soci'), 'Melinna SAC')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_RUC ()_ruc_persona'), '10730084701')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_Direccin_dir_persona'), 'Jr Jorge Chavez 038')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_Tlefono de contacto()_te'), '980630721')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_Representante Legal()_re'), 'Carlos Rodriguez')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_Correo Electrnico()_corr'), 'melinna.rojas@unmsm.edu.pe')

WebUI.click(findTestObject('Formulario_RegistrarDenuncia_Juridica/label_S'))

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_No_entidad_presentada'), 'Organo de control institucional')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_Ejm rgano de Control Ins'), '15/04/2018')

WebUI.delay(2)

WebUI.click(findTestObject('Formulario_RegistrarDenuncia_Juridica/span_Lugar de trabajo del denu'))

WebUI.click(findTestObject('Formulario_RegistrarDenuncia_Juridica/span_FACULTAD DE INGENIERA DE'))

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_El campo es obligatorio_'), 'Melinna Rojas')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_Opcional_puesto_denuncia'), 'Decana')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/textarea_Detalle lo sucedido ('), 'Detalle para hacer pruebas wuwuwuwuw')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_Fecha de los hechos_fech'), '15/09/2018')

WebUI.click(findTestObject('Formulario_RegistrarDenuncia_Juridica/label_Estoy de acuerdo con el'))

WebUI.delay(1)

WebUI.click(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_Estoy de acuerdo con el'))

WebUI.click(findTestObject('Formulario_RegistrarDenuncia_Juridica/button_Aceptar'))

WebUI.closeBrowser()

