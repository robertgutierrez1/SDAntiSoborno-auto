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

WebUI.callTestCase(findTestCase('Ingresar_RegistrarDenunciaOrdinaria'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Formulario_RegistrarDenuncia_Juridica/label_Jurdica'))

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_Razn Social()_razon_soci'), 'Melinna SAC')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_RUC ()_ruc_persona'), '10730084701')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_Direccin_dir_persona'), 'Jr Jorge Chavez 038')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_Tlefono de contacto()_te'), '920842827')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_Representante Legal()_re'), 'Carlex Ro')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_Correo Electrnico()_corr'), 'carlos.rodriguez47@unmsm.edu.pe')

WebUI.click(findTestObject('Formulario_RegistrarDenuncia_Juridica/label_S'))

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_No_entidad_presentada'), 'Organo de control INstitucional')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_Ejm rgano de Control Ins'), '15/04/2017')

WebUI.click(findTestObject('Formulario_RegistrarDenuncia_Juridica/span_Lugar de trabajo del denu'))

WebUI.click(findTestObject('Formulario_RegistrarDenuncia_Juridica/span_ALIANZA ESTRATGICA'))

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_El campo es obligatorio_'), 'Carlos Rodriguez')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_Opcional_puesto_denuncia'), 'Jefe')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/textarea_Detalle lo sucedido ('), 'Elige a los CAS según su conveniencia y cobra')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_Fecha de los hechos_fech'), '15/04/2018')

WebUI.click(findTestObject('Formulario_RegistrarDenuncia_Juridica/label_Estoy de acuerdo con el'))

'Delay para futura validación'
WebUI.delay(1)

WebUI.click(findTestObject('Formulario_RegistrarDenuncia_Juridica/input_Estoy de acuerdo con el'))

'Delay para que aparezca la ventana emergente'
WebUI.delay(1)

WebUI.click(findTestObject('Formulario_RegistrarDenuncia_Juridica/button_Aceptar'))

WebUI.closeBrowser()

