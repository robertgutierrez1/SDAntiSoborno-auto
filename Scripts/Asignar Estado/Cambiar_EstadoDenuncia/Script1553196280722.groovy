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

WebUI.click(findTestObject('DetalleDenuncia/Cambiar_EstadoDenuncia/button'))

WebUI.delay(1)

//Extraigo el texto para saber en que estado estaba
text = WebUI.getText(findTestObject('DetalleDenuncia/Cambiar_EstadoDenuncia/select_RecepcionadoEn ProcesoPendienteArchivadoConcluido'))

WebUI.selectOptionByIndex(findTestObject('DetalleDenuncia/Cambiar_EstadoDenuncia/select_RecepcionadoEn ProcesoPendienteArchivadoConcluido'), 
    variable, FailureHandling.STOP_ON_FAILURE)

switch (variable) {
    case 0:
        // Caso Recepcionado
        if ((text == 'En Proceso') || (text == 'Pendiente')) {
			WebUI.delay(1);
            WebUI.click(findTestObject('DetalleDenuncia/Cambiar_EstadoDenuncia/button_S'))
        }
        
        break
    case 1:
        // Caso En Proceso
        if (text == 'Pendiente') {
			WebUI.delay(1);
			WebUI.click(findTestObject('DetalleDenuncia/Cambiar_EstadoDenuncia/button_S'))
        }
        
        break
    case 2:
        //Caso Pendiente
        break
    case 3:
        //Caso Archivado
        WebUI.delay(1)

        WebUI.setText(findTestObject('DetalleDenuncia/Cambiar_EstadoDenuncia/textarea_'+text+'_motivo_cambio_estado'), 
            'Por motivos personales')

        break
    case 4:
        //Caso Concluido
		WebUI.delay(1)
        WebUI.setText(findTestObject('DetalleDenuncia/Cambiar_EstadoDenuncia/textarea_'+text+'_motivo_cambio_estado'), 
            'Ya se resolvio la denuncia')

        break
}

WebUI.delay(2)

WebUI.click(findTestObject('DetalleDenuncia/Cambiar_EstadoDenuncia/input_Cancelar_btn btn-success'))

WebUI.closeBrowser()

