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

WebUI.navigateToUrl('http://172.16.179.243:4201/')

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/a_Realizar denuncia ordinaria'))

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/label_Jurdica'))

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_Razn Social()_razon_social_persona'), 
    'MELINA SAC')

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_RUC ()_ruc_persona'), 
    '10730084701')

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_Direccin_dir_persona'), 
    'Jr. Jorge Chavez 038')

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_Telfono de contacto()_tel_persona'), 
    '920841827')

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_Representante Legal()_representante_legal'), 
    'Carl ')

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_Correo Electrnico()_correo_electronico'), 
    'carlos.rodriguez47@unmsm.edu.pe')

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/label_S'))

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_No_entidad_presentada'), 
    'Organo de Control Institucional')

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_Ejm rgano de Control Institucional_fecha_presentada'), 
    '15/04/2017')

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/span_Lugar de trabajo del denunciado'))

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/span_ALIANZA ESTRATGICA'))

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_El campo es obligatorio_nom_ape_denunciado1'), 
    'Carlos Rodriguez')

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_Opcional_puesto_denunciado1'), 
    'Docente')

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/textarea_Detalle lo sucedido ()_detalle_hechos'), 
    'El señor en mención robaba y coimeaba a muchos jefes')

WebUI.setText(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_Fecha de los hechos_fecha_hechos'), 
    '15/04/2018')

WebUI.delay(1)

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/label_Estoy de acuerdo con el compromiso'))

WebUI.delay(1)

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/input_Estoy de acuerdo con el compromiso_btn btn-success'))

WebUI.delay(1)

WebUI.click(findTestObject('Registrar Denuncia/Formulario_RegistrarDenuncia_Juridica/button_Aceptar'))

WebUI.closeBrowser()

