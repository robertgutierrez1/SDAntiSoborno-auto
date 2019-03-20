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

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/div_D.N.I._mat-select-arrow'))

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/div_Seleccione_mat-form-field-'))

WebUI.setText(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/input_Seleccione_dni_persona'), 
    '73008470')

WebUI.setText(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/input_Nombres y Apellidos ()_n'), 
    'Melinna Rojas Camargo')

WebUI.setText(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/input_Direccin de Vivienda_dir'), 
    'Av. German Amezaga 756')

WebUI.setText(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/input_Tlefono de contacto ()_t'), 
    '980630721')

WebUI.setText(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/input_Correo electrnico ()_cor'), 
    'melinna.rojas@unmsm.edu.pe')

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/label_S'))

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/label_S'))

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/div_En qu lugar fue denunciado'))

WebUI.setText(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/input_No_entidad_presentada'), 
    'Organo de control institucional')

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/button_Fecha de esa denuncia_m'))

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/td_1'))

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/span_Lugar de trabajo del denu'))

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/span_CENTRO CULTURAL'))

WebUI.setText(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/input_El campo es obligatorio_'), 
    'Carlos Rodriguez')

WebUI.setText(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/input_Opcional_puesto_denuncia'), 
    'Docente')

WebUI.setText(findTestObject('Acceso_RegistrarDenunciaOrdinaria/textarea_Detalle lo sucedido ('), 'Hechos delictivos, cobros excesivos por parte del docente manipulador')

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/div_10'))

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/button_Seleccionar Archivo'))

WebUI.setText(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/input_Contenido de las pruebas'), 
    'El docente robando a escondidas')

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/label_Estoy de acuerdo con el'))

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/input_Estoy de acuerdo con el'))

WebUI.click(findTestObject('Acceso_RegistrarDenunciaOrdinaria/Formulario_DenunciaNatural/button_Aceptar'))

WebUI.closeBrowser()

