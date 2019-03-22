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

WebUI.callTestCase(findTestCase('Registrar Denuncia/Denuncia Ordinaria/Ingresar_RegistrarDenunciaOrdinaria'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Natural/label_Natural'))

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Natural/Campo_DNI/div_D.N.I.'))

'Cambiar por span_Carnet de extranjera de ser necesario.'
WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Natural/Campo_DNI/span_D.N.I.'))

'Cambiar por otro número'
WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Natural/input_Seleccione_dni_persona'), '73008470')

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Natural/input_Nombres y Apellidos ()_n'), 'Melinna Rojas Camargo')

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Natural/input_Direccin de Vivienda_dir'), 'Jr. Jorge Chavez 038')

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Natural/input_Tlefono de contacto ()_t'), '980630721')

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Natural/input_Correo electrnico ()_cor'), 'melinna.rojas@unmsm.edu.pe')

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Natural/label_No'))

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Natural/label_S'))

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Natural/input_No_entidad_presentada'), 'Organo de Control Institucional')

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Natural/input_Ejm rgano de Control Ins'), '15/04/2017')

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Natural/span_Lugar de trabajo del denu'))

'Cambiar por otro de ser necesario(span ubicado en la carpeta)'
WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Natural/Span_LugarDeTrabajo/span_BECA 18'))

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Natural/div_Nombres Completos'))

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Natural/input_El campo es obligatorio_'), 'Carlos Rodriguez')

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Natural/input_Opcional_puesto_denuncia'), 'Docente')

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Natural/textarea_Detalle lo sucedido ('), 'Docente inescrupuloso roba becas 18')

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Natural/input_Fecha de los hechos_fech'), '15/04/2018')

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Natural/label_Estoy de acuerdo con el'))

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Natural/input_Estoy de acuerdo con el'))

WebUI.delay(1)

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Natural/button_Aceptar'))

WebUI.closeBrowser()

