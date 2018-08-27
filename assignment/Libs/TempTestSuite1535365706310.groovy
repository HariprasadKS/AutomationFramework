import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/API_Sanity_TestSuite')

suiteProperties.put('name', 'API_Sanity_TestSuite')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\personal\\profile\\assignment\\Reports\\API_Sanity_TestSuite\\20180827_155826\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/API_Sanity_TestSuite', suiteProperties, [new TestCaseBinding('Test Cases/API/SampleApplication/API_comments', 'Test Cases/API/SampleApplication/API_comments',  null), new TestCaseBinding('Test Cases/API/SampleApplication/API_delete_posts_1', 'Test Cases/API/SampleApplication/API_delete_posts_1',  null), new TestCaseBinding('Test Cases/API/SampleApplication/API_posts', 'Test Cases/API/SampleApplication/API_posts',  null), new TestCaseBinding('Test Cases/API/SampleApplication/API_posts_1', 'Test Cases/API/SampleApplication/API_posts_1',  null), new TestCaseBinding('Test Cases/API/SampleApplication/API_put_posts_1', 'Test Cases/API/SampleApplication/API_put_posts_1',  null), new TestCaseBinding('Test Cases/API/SampleApplication/API_todos', 'Test Cases/API/SampleApplication/API_todos',  null), new TestCaseBinding('Test Cases/API/SampleApplication/API_users', 'Test Cases/API/SampleApplication/API_users',  null)])
