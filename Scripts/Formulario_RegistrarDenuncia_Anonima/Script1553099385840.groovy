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

WebUI.navigateToUrl('http://172.16.179.243:4201/formulario/anonima')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Anonima/input_Datos personales_correo_'), 'melinna.rojas@unmsm.edu.pe')

'Se eligió "No" para que el sistema no lo confunda con el siguiente RadioButton'
WebUI.click(findTestObject('Formulario_RegistrarDenuncia_Anonima/label_No'))

'Se elegió "Sí" para que se activen dos campos.'
WebUI.click(findTestObject('Formulario_RegistrarDenuncia_Anonima/label_S'))

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Anonima/input_No_entidad_presentada'), 'Organo de Control Institucional')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Anonima/input_Ejm rgano de Control Ins'), '15/04/2017')

WebUI.click(findTestObject('Formulario_RegistrarDenuncia_Anonima/span_Lugar de trabajo del denu'))

'Para elegir otro se tendría que cambiar el nombre de span(Estan en la carpeta)'
WebUI.click(findTestObject('Formulario_RegistrarDenuncia_Anonima/Span_LugardeTrabajo/span_CENTRO PREUNIVERSITARIO'))

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Anonima/input_El campo es obligatorio_'), 'Carlos Rodriguez')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Anonima/input_Opcional_puesto_denuncia'), 'Docente')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Anonima/textarea_Detalle lo sucedido ('), 'Cobro a los alumnos de la pre por libros77777')

WebUI.setText(findTestObject('Formulario_RegistrarDenuncia_Anonima/input_Fecha de los hechos_fech'), '15/04/2018')

WebUI.click(findTestObject('Formulario_RegistrarDenuncia_Anonima/label_Estoy de acuerdo con el'))

'Delay para que valide los campos'
WebUI.delay(1)

WebUI.click(findTestObject('Formulario_RegistrarDenuncia_Anonima/input_Estoy de acuerdo con el'))

'Delay para que identifique después la ventana emergente'
WebUI.delay(1)

WebUI.click(findTestObject('Formulario_RegistrarDenuncia_Anonima/button_Aceptar'))

WebUI.closeBrowser()
