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

WebUI.callTestCase(findTestCase('Registrar Denuncia/Denuncia Anonima/Ingresar_RegistrarDenunciaAnonima'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Anonima/input_Datos personales_correo_'), email_an)

'Se eligió "No" para que el sistema no lo confunda con el siguiente RadioButton'
WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Anonima/label_No'))

'Se elegió "Sí" para que se activen dos campos.'
WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Anonima/label_S'))

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Anonima/input_No_entidad_presentada'), lugar_an)

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Anonima/input_Ejm rgano de Control Ins'), fechaPast_an)

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Anonima/span_Lugar de trabajo del denu'))

'Para elegir otro se tendría que cambiar el nombre de span(Estan en la carpeta)'
WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Anonima/Span_LugardeTrabajo/span_CENTRO PREUNIVERSITARIO'))

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Anonima/input_El campo es obligatorio_'), implicado_an)

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Anonima/input_Opcional_puesto_denuncia'), puesto_an)

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Anonima/textarea_Detalle lo sucedido ('), detalle_an)

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Anonima/input_Fecha de los hechos_fech'), fechaPresent_an)

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Anonima/label_Estoy de acuerdo con el'))

'Delay para que valide los campos'
WebUI.delay(1)

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Anonima/input_Estoy de acuerdo con el'))

'Delay para que identifique después la ventana emergente'
WebUI.delay(1)

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Anonima/button_Aceptar'))

WebUI.closeBrowser()

