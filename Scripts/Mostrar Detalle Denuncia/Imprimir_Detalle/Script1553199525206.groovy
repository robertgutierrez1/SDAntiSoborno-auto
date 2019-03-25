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

WebUI.callTestCase(findTestCase('Mostrar Detalle Denuncia/Ver_DetalleDenuncia'), [:], FailureHandling.STOP_ON_FAILURE)

'Botón que te descarga la denuncia'

if(WebUI.verifyElementVisible(findTestObject('DetalleDenuncia/Ver_Detalle/Imprimir_Detalle/button_'+estado_imprimir+'_btn btn-lg btn-primary mr-1'))){
	WebUI.click(findTestObject('DetalleDenuncia/Ver_Detalle/Imprimir_Detalle/button_'+estado_imprimir+'_btn btn-lg btn-primary mr-1'))
}
else{
	texto = WebUI.getText(findTestObject('DetalleDenuncia/Ver_Detalle/Imprimir_Detalle/Button/div_+'+estado_imprimir+'_container col-md-3'))
	WebUI.click(findTestObject('DetalleDenuncia/Ver_Detalle/Imprimir_Detalle/Button/button_'+texto+'_btn btn-lg btn-primary mr-1'))
	}

WebUI.closeBrowser()

