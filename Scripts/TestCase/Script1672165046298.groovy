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

Mobile.startExistingApplication('com.google.android.calculator')

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (2)'), 0)

Mobile.tap(findTestObject('android.widget.ImageButton (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (4)'), 0)

Mobile.takeScreenshot('D:\\KatalonTest\\screenshot1.png')

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (5)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (6)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (7)'), 0)

Mobile.tap(findTestObject('android.widget.ImageButton (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (8)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (9)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (5)'), 0)

Mobile.takeScreenshot('D:\\KatalonTest\\screenshot2.png')

Mobile.closeApplication()

