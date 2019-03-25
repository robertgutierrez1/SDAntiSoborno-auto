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

WebUI.callTestCase(findTestCase('Iniciar Sesion/Iniciar_Sesion'), [:], FailureHandling.STOP_ON_FAILURE)


flag = WebUI.verifyElementVisible(findTestObject('DetalleDenuncia/Ver_Detalle/a_'+estado+'_button'))
if(flag){
	WebUI.click(findTestObject('DetalleDenuncia/Ver_Detalle/a_'+estado+'_button'))
}else{
	WebUI.closeBrowser()
	}
'Se debe abrir en otra pantalla la denuncia.'
WebUI.delay(4)

not_run: WebUI.closeBrowser()

