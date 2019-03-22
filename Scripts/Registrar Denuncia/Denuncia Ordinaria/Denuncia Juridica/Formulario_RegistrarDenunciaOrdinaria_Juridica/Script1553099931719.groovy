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

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/label_Jurdica'))

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_Razn Social()_razon_social_persona'), 
    razonSocial_j)

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_RUC ()_ruc_persona'), ruc_j)

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_Direccin_dir_persona'), direccion_j)

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_Telfono de contacto()_tel_persona'), 
    telefono_j)

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_Representante Legal()_representante_legal'), 
    representanteL_j)

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_Correo Electrnico()_correo_electronico'), 
    correo_j)

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/label_S'))

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_No_entidad_presentada'), entidad_j)

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_Ejm rgano de Control Institucional_fecha_presentada'), 
    fechasPast_j)

'Delay para que busque el span del Lugar de Trabajo'
WebUI.delay(1)

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/span_Lugar de trabajo del denunciado'))

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/span_ALIANZA ESTRATGICA'))

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_El campo es obligatorio_nom_ape_denunciado1'), 
    implicado_j)

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_Opcional_puesto_denunciado1'), 
    puesto_j)

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/textarea_Detalle lo sucedido ()_detalle_hechos'), 
    detalle_j)

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_Fecha de los hechos_fecha_hechos'), 
    fechaPresent_j)

'Delay para que valide los campos'
WebUI.delay(1)

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/label_Estoy de acuerdo con el compromiso'))

WebUI.delay(1)

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_Estoy de acuerdo con el compromiso_btn btn-success'))

'Delay para que aparezca la ventana emergente\r\n'
WebUI.delay(1)

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/button_Aceptar'))

WebUI.closeBrowser()

