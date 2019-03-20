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

WebUI.navigateToUrl('http://172.16.179.243:4201/formulario/natural')

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/label_Jurdica'))

WebUI.setText(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/input_Razn Social()_razon_soci'), 
    'Melinna SAC')

WebUI.setText(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/input_RUC ()_ruc_persona'), 
    '20730084701')

WebUI.setText(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/input_Direccin_dir_persona'), 
    'Jr German Amenazaga 345')

WebUI.setText(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/input_Tlefono de contacto()_te'), 
    '980630721')

WebUI.setText(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/input_Representante Legal()_re'), 
    'Carlos Rodriguez')

WebUI.setText(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/input_Correo Electrnico()_corr'), 
    'melinna.rojas@unmsm.edu.pe')

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/label_S'))

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/div_En qu lugar fue denunciado'))

WebUI.setText(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/input_No_entidad_presentada'), 
    'Organo de Control Institucional')

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/div_Fecha de esa denuncia'))

WebUI.setText(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/input_El campo es obligatorio_'), 
    '15/04/2018')

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/span_Lugar de trabajo del denu'))

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/span_BECA 18'))

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/div_Nombres Completos'))

WebUI.setText(findTestObject('Acceso_RegistrarDenunciaOrdinaria/input_El campo es obligatorio_'), 'Carlos Chikorita Rodriguez')

WebUI.setText(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/input_vlido._puesto_denunciado'), 
    'Docente')

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/div_Detalle lo sucedido ()_mat'))

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/div_Fecha de los hechos_mat-fo'))

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/div_14'))

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/span_Seleccionar Archivo'))

WebUI.setText(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/textarea_Detalle lo sucedido ('), 
    'Esta denuncia es para pruebas de SQA uwwu')

WebUI.setText(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/input_Contenido de las pruebas'), 
    'Documento de pruebas')

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/label_Estoy de acuerdo con el'))

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/input_Estoy de acuerdo con el'))

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaJuridica/button_Aceptar'))

WebUI.closeBrowser()

