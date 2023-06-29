import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import com.netkathir.Util as WebUtil


WebUI.navigateToUrl((GlobalVariable.base_url), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/fetch_url/search_xpath'))
WebUI.delay(2)


try
{
for (int n=0; n<66;n++)
{

for (int i=0;i<3;i++)
	{
		WebUtil.robot.keyPress(KeyEvent.VK_TAB)
		WebUtil.robot.keyRelease(KeyEvent.VK_TAB)			
	}

	WebUtil.robot.keyPress(KeyEvent.VK_SHIFT)
	WebUtil.robot.keyPress(KeyEvent.VK_ENTER)
	WebUtil.robot.keyRelease(KeyEvent.VK_ENTER)
	WebUtil.robot.keyRelease(KeyEvent.VK_SHIFT)
	WebUI.delay(3)
	WebUI.switchToWindowIndex(1)
	WebUI.delay(3)
	String currentPage = WebUI.getUrl()
//	print(currentPage)
	try
	{
	position_name = WebUI.getText(findTestObject('Object Repository/fetch_url/job_name'))
//	print(position_name)
	owner_name = WebUI.getText(findTestObject('Object Repository/fetch_url/owner_name'))
//	print(owner_name)
	address = WebUI.getText(findTestObject('Object Repository/fetch_url/address'))
//	print(address)
	provider_name = WebUI.getText(findTestObject('Object Repository/fetch_url/provider_name'))
	print(provider_name)
	tag1 = WebUI.getText(findTestObject('Object Repository/fetch_url/tag1'))
	print(tag1)
	tag2 = WebUI.getText(findTestObject('Object Repository/fetch_url/tag2'))
	print(tag2)
	WebElement element = WebUI.findWebElement(findTestObject('Object Repository/fetch_url/external_url'),5)
	external_url = element.getAttribute('href')
//	print(external_url)
	WebUtil.generateData(testCaseName, testCaseData, currentPage,provider_name,owner_name,position_name,address,external_url,tag1,tag2)
	WebUI.delay(2)
	} catch (org.openqa.selenium.NoSuchElementException | com.kms.katalon.core.exception.StepFailedException e) {
		WebUtil.reportAndtakeScreenshot(testCaseName, testCaseData, 'Tutor add class has error : ' + e.getMessage(), true);
		WebUI.closeWindowIndex(1);
		continue; // Break the inner loop and continue with the next iteration of the outer loop
	}
	
	WebUI.closeWindowIndex(1)
	WebUI.delay(3)	
}
}
catch (org.openqa.selenium.NoSuchElementException | com.kms.katalon.core.exception.StepFailedException  e)
{
	WebUtil.reportAndtakeScreenshot(testCaseName, testCaseData, 'Tutor add class has error : ' + e.getMessage(), true)
}
