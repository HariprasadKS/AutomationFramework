package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile DEV API : DEV Login URL
Profile DEV UI : QA Login URL
Profile QA API : QA Login URL
Profile QA UI : QA Login URL
Profile QAEnv : QA Login URL</p>
     */
    public static Object app_url
     
    /**
     * <p>Profile DEV API : API URL
Profile QA API : API URL
Profile QA UI : API URL
Profile QAEnv : API URL</p>
     */
    public static Object rest_endpoint
     
    /**
     * <p>Profile DEV API : Admin Username
Profile DEV UI : Admin Username
Profile QA API : Admin Username
Profile QA UI : Admin Username
Profile QAEnv : Admin Username</p>
     */
    public static Object admin_username
     
    /**
     * <p>Profile DEV API : Admin Password
Profile DEV UI : Admin Password
Profile QA API : Admin Password
Profile QA UI : Admin Password
Profile QAEnv : Admin Password</p>
     */
    public static Object admin_pwd
     
    /**
     * <p>Profile DEV API : SSO Client ID
Profile QA API : SSO Client ID
Profile QAEnv : SSO Client ID</p>
     */
    public static Object sso_clientid
     
    /**
     * <p>Profile DEV API : SSO Client Secret
Profile QA API : SSO Client Secret
Profile QAEnv : SSO Client Secret</p>
     */
    public static Object sso_client_secret
     
    /**
     * <p>Profile DEV API : Azure SSO Url
Profile QA API : Azure SSO Url
Profile QAEnv : Azure SSO Url</p>
     */
    public static Object azure_sso_url
     
    /**
     * <p>Profile DEV API : Azure SSO Resource Url
Profile QA API : Azure SSO Resource Url
Profile QAEnv : Azure SSO Resource Url</p>
     */
    public static Object azure_sso_resource_url
     
    /**
     * <p>Profile DEV API : Elastic Search Url
Profile QA API : Elastic Search Url
Profile QAEnv : Elastic Search Url</p>
     */
    public static Object elasticsearh_server
     
    /**
     * <p>Profile DEV API : Elastic Search Port
Profile QA API : Elastic Search Port
Profile QAEnv : Elastic Search Port</p>
     */
    public static Object elasticsearch_port
     
    /**
     * <p>Profile DEV API : Session token.
Profile QA API : token created will be stored here.</p>
     */
    public static Object token
     
    /**
     * <p>Profile DEV API : Environment profile.
Profile DEV UI : environment details.
Profile QA API : Environment Profile.
Profile QA UI : Environment profile.</p>
     */
    public static Object environment
     
    /**
     * <p>Profile DEV API : Account Id for verification
Profile QA API : Account Id for verification.</p>
     */
    public static Object accountId
     
    /**
     * <p>Profile DEV API : Account Name for verification.
Profile QA API : Account NAme for verification.</p>
     */
    public static Object accountName
     
    /**
     * <p>Profile DEV API : environment url difference.
Profile QA API : url environment paramter</p>
     */
    public static Object url_env
     
    /**
     * <p>Profile DEV API : grant type parameter.
Profile QA API : grant type</p>
     */
    public static Object grant_type
     
    /**
     * <p>Profile DEV API : Site ID 
Profile QA API : Site id for verification.</p>
     */
    public static Object siteId
     
    /**
     * <p>Profile DEV API : Company Id.
Profile QA API : company id for verification.</p>
     */
    public static Object companyId
     
    /**
     * <p>Profile DEV UI : time used for small delays required
Profile QA UI : time used for small delays required
Profile QAEnv : time used for small delays required</p>
     */
    public static Object timeout_small
     
    /**
     * <p>Profile DEV UI : time used for an average time wait
Profile QA UI : time used for an average time wait
Profile QAEnv : time used for an average time wait</p>
     */
    public static Object timeout_medium
     
    /**
     * <p>Profile DEV UI : The mandatory fields required for company creation.
Profile QA UI : The mandatory fields required for company creation.
Profile QAEnv : The mandatory fields required for company creation.</p>
     */
    public static Object company_creation
     
    /**
     * <p>Profile DEV UI : Email error for invalid email entries.
Profile QA UI : Email error for invalid email entries.
Profile QAEnv : Email error for invalid email entries.</p>
     */
    public static Object invalid_email
     
    /**
     * <p>Profile DEV UI : Message when there is no data in the list.
Profile QA UI : Message when there is no data in the list.
Profile QAEnv : Message when there is no data in the list.</p>
     */
    public static Object no_records_msg
     
    /**
     * <p>Profile DEV UI : Login user's name
Profile QA UI : Login user's name
Profile QAEnv : Login user's name</p>
     */
    public static Object created_by
     
    /**
     * <p>Profile DEV UI : Edit company details
Profile QA UI : Edit company details
Profile QAEnv : Edit company details</p>
     */
    public static Object company_edit
     
    /**
     * <p>Profile DEV UI : mix of special characters, alphabets and numbers
Profile QA UI : mix of special chars, alphabets and numbers.
Profile QAEnv : mix of special characters, alphabets and numbers</p>
     */
    public static Object mix_chars
     
    /**
     * <p></p>
     */
    public static Object SampleData
     
    /**
     * <p>Profile DEV UI : account creation details
Profile QA UI : account creation details
Profile QAEnv : account creation details</p>
     */
    public static Object account_creation
     
    /**
     * <p>Profile DEV UI : DB port number
Profile QA UI : DB port number
Profile QAEnv : DB port number</p>
     */
    public static Object db_port
     
    /**
     * <p>Profile QA API : Company name for verification.</p>
     */
    public static Object companyName
     
    /**
     * <p>Profile QA API : Site name for the verification.</p>
     */
    public static Object siteName
     
    /**
     * <p>Profile QA API : Sample application URL</p>
     */
    public static Object sample_appli_url
     
    /**
     * <p>Profile QA UI : DB Name
Profile QAEnv : DB Name</p>
     */
    public static Object db_name
     
    /**
     * <p>Profile QA UI : DB Username
Profile QAEnv : DB Username</p>
     */
    public static Object db_username
     
    /**
     * <p>Profile QA UI : DB password
Profile QAEnv : DB password</p>
     */
    public static Object db_password
     
    /**
     * <p>Profile QA UI : DB Hostname
Profile QAEnv : DB Hostname</p>
     */
    public static Object db_host
     
    /**
     * <p></p>
     */
    public static Object site_creation
     
    /**
     * <p>Profile QA UI : Distributor manager name</p>
     */
    public static Object distributormanager_username
     
    /**
     * <p>Profile QA UI : Distributor user</p>
     */
    public static Object distributoruser_username
     
    /**
     * <p>Profile QA UI : site manager</p>
     */
    public static Object sitemanager_username
     
    /**
     * <p>Profile QA UI : Site user</p>
     */
    public static Object siteuser_username
     
    /**
     * <p></p>
     */
    public static Object distributormanager_password
     
    /**
     * <p></p>
     */
    public static Object distributoruser_password
     
    /**
     * <p></p>
     */
    public static Object sitemanager_password
     
    /**
     * <p></p>
     */
    public static Object siteuser_password
     
    /**
     * <p>Profile QA UI : chemicalcompanyadmin</p>
     */
    public static Object chemicalcompanyadmin_username
     
    /**
     * <p>Profile QA UI : chemical company manager</p>
     */
    public static Object chemicalcompanymanager_username
     
    /**
     * <p>Profile QA UI : chemical company user</p>
     */
    public static Object chemicalcompuser_user
     
    /**
     * <p></p>
     */
    public static Object chemicalcompanyadmin_password
     
    /**
     * <p></p>
     */
    public static Object chemicalcompanymanager_password
     
    /**
     * <p></p>
     */
    public static Object chemicalcompuser_password
     
    /**
     * <p>Profile QAEnv : Browser for execution</p>
     */
    public static Object browser
     
    /**
     * <p></p>
     */
    public static Object test
     

    static {
        def allVariables = [:]        
        allVariables.put('default', [:])
        allVariables.put('DEV API', allVariables['default'] + ['app_url' : 'https://devhydro-digital.dovertech.co.in/', 'rest_endpoint' : 'https://devhydro-digital.dovertech.co.in/', 'admin_username' : 'binisha@doverhydrodev.onmicrosoft.com', 'admin_pwd' : 'Dover_123$', 'sso_clientid' : 'bf339333-6924-484a-a243-f5f0c935896c', 'sso_client_secret' : 'U04JmKfW0cEEVf4zakO3kDIByfiAPmis2cS0i51jmWE=', 'azure_sso_url' : 'https://login.microsoftonline.com/doverhydro.onmicrosoft.com', 'azure_sso_resource_url' : 'bf339333-6924-484a-a243-f5f0c935896c', 'elasticsearh_server' : '52.173.138.29', 'elasticsearch_port' : '9200', 'token' : '${token}', 'environment' : 'DEV API', 'accountId' : '83985b269a0b42e5bb7e34d2293b7ad8', 'accountName' : 'Account1', 'url_env' : 'doverhydrodev', 'grant_type' : 'password', 'siteId' : 'd7363f3ecfba460192671c5345aee3ca', 'companyId' : '76dab3cd1e3a460f80880dd7e25cc4db'])
        allVariables.put('DEV UI', allVariables['default'] + ['app_url' : 'https://devhydro-digital.dovertech.co.in/', 'admin_username' : 'binisha@doverhydrodev.onmicrosoft.com', 'admin_pwd' : 'Dover_123$', 'timeout_small' : 5, 'timeout_medium' : 15, 'company_creation' : [('city') : findTestData('UI/Admin/Company/new_company_data').getValue(3, 1), ('address1') : findTestData('UI/Admin/Company/new_company_data').getValue(2, 1), ('zipCode') : findTestData('UI/Admin/Company/new_company_data').getValue(6, 1), ('country') : findTestData('UI/Admin/Company/new_company_data').getValue(5, 1), ('state') : findTestData('UI/Admin/Company/new_company_data').getValue(4, 1), ('companyName') : findTestData('UI/Admin/Company/new_company_data').getValue(1, 1), ('description') : findTestData('UI/Admin/Company/new_company_data').getValue(7, 1), ('contact_name') : findTestData('UI/Admin/Company/new_company_data').getValue(9, 1), ('site_name') : findTestData('UI/Admin/Company/new_company_data').getValue(12, 1), ('contact_number') : findTestData('UI/Admin/Company/new_company_data').getValue(10, 1), ('contact_email') : findTestData('UI/Admin/Company/new_company_data').getValue(11, 1), ('contact_title') : findTestData('UI/Admin/Company/new_company_data').getValue(8, 1)], 'invalid_email' : 'Email is invalid', 'no_records_msg' : 'No records available.', 'created_by' : 'Hima Velaga', 'company_edit' : [('site_name') : findTestData('UI/Admin/Company/edit_company_data').getValue(13, 1), ('contact_email') : findTestData('UI/Admin/Company/edit_company_data').getValue(12, 1), ('contact_number') : findTestData('UI/Admin/Company/edit_company_data').getValue(11, 1), ('contact_name') : findTestData('UI/Admin/Company/edit_company_data').getValue(10, 1), ('contact_title') : findTestData('UI/Admin/Company/edit_company_data').getValue(9, 1), ('description') : findTestData('UI/Admin/Company/edit_company_data').getValue(8, 1), ('zipCode') : findTestData('UI/Admin/Company/edit_company_data').getValue(7, 1), ('country') : findTestData('UI/Admin/Company/edit_company_data').getValue(6, 1), ('state') : findTestData('UI/Admin/Company/edit_company_data').getValue(5, 1), ('city') : findTestData('UI/Admin/Company/edit_company_data').getValue(4, 1), ('address2') : findTestData('UI/Admin/Company/edit_company_data').getValue(3, 1), ('address1') : findTestData('UI/Admin/Company/edit_company_data').getValue(2, 1), ('companyName') : findTestData('UI/Admin/Company/edit_company_data').getValue(1, 1)], 'mix_chars' : 'aA _-123+@', 'SampleData' : 'TestingGlobalVariable issue', 'account_creation' : [('accountName') : findTestData('UI/Admin/Account/new_account_data').getValue(1, 1), ('address1') : findTestData('UI/Admin/Account/new_account_data').getValue(2, 1), ('address2') : findTestData('UI/Admin/Account/new_account_data').getValue(3, 1), ('city') : findTestData('UI/Admin/Account/new_account_data').getValue(6, 1), ('country') : findTestData('UI/Admin/Account/new_account_data').getValue(4, 1), ('state') : findTestData('UI/Admin/Account/new_account_data').getValue(5, 1), ('description') : findTestData('UI/Admin/Account/new_account_data').getValue(8, 1), ('zipcode') : findTestData('UI/Admin/Account/new_account_data').getValue(7, 1), ('contactTitle') : findTestData('UI/Admin/Account/new_account_data').getValue(9, 1), ('contactName') : findTestData('UI/Admin/Account/new_account_data').getValue(10, 1), ('contactNumber') : findTestData('UI/Admin/Account/new_account_data').getValue(11, 1), ('contactEmail') : findTestData('UI/Admin/Account/new_account_data').getValue(12, 1)], 'db_port' : '3306', 'environment' : 'DEV UI'])
        allVariables.put('QA API', allVariables['default'] + ['app_url' : 'https://qahydro-digital.dovertech.co.in/', 'rest_endpoint' : 'https://hydro-digital-qa-webapp.azurewebsites.net/hydro/api', 'admin_username' : 'qauser@qahydro.onmicrosoft.com', 'admin_pwd' : 'Dover@123$', 'sso_clientid' : '6f03985d-67d2-446a-8b2e-1fb4e29cf3cd', 'sso_client_secret' : 'UaLl3xg6luipDPjkImAWs/WWFa3BwRNnl0+WV01s41E=', 'azure_sso_url' : 'https://login.microsoftonline.com/qahydro.onmicrosoft.com', 'azure_sso_resource_url' : '6f03985d-67d2-446a-8b2e-1fb4e29cf3cd', 'elasticsearh_server' : '52.171.62.154', 'elasticsearch_port' : '9200', 'token' : 'eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6IjdfWnVmMXR2a3dMeFlhSFMzcTZsVWpVWUlHdyIsImtpZCI6IjdfWnVmMXR2a3dMeFlhSFMzcTZsVWpVWUlHdyJ9.eyJhdWQiOiI2ZjAzOTg1ZC02N2QyLTQ0NmEtOGIyZS0xZmI0ZTI5Y2YzY2QiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC9hMGIyMWE4OC04NmM0LTRlMzctOGRhMi0yZWNiZWVhNDhiZmEvIiwiaWF0IjoxNTM1MzU3ODI5LCJuYmYiOjE1MzUzNTc4MjksImV4cCI6MTUzNTM2MTcyOSwiYWlvIjoiNDJCZ1lKQ2R0Q1V2VkZYZUluckRTUjlmL2MrN3l3TmJLbzUzaXJKM2VIUVVySTVrTkFFQSIsImFtciI6WyJwd2QiXSwiaXBhZGRyIjoiMjAzLjIwMC4yMDUuMjUzIiwibmFtZSI6ImhhcmlwcmFzYWQgS1MiLCJub25jZSI6ImM5MGZjZTRjLWE4MmItNGUyOC04MGY3LTBiZTNjODlmYTMwNSIsIm9pZCI6IjNkMTg1ZjFlLWMzYWEtNGNjMi04MTg5LWY5MDIyNDE4OGRkOSIsInN1YiI6ImNwT0hKcG1OYjA3YUtGN2lvQ2tkLXRUaDNEYXZ2Z2RHQ3VLOTJhZFdZOFEiLCJ0aWQiOiJhMGIyMWE4OC04NmM0LTRlMzctOGRhMi0yZWNiZWVhNDhiZmEiLCJ1bmlxdWVfbmFtZSI6ImhhcmlwcmFzYWRAcWFoeWRyby5vbm1pY3Jvc29mdC5jb20iLCJ1cG4iOiJoYXJpcHJhc2FkQHFhaHlkcm8ub25taWNyb3NvZnQuY29tIiwidXRpIjoiNjhUMWpuV1hWME9CZ2FKRFFtVnZBQSIsInZlciI6IjEuMCJ9.nDoINBcMjuStnYncp4gGpM6ILvd0627E7VMt5oQxqVF_LM2_bAn2_EPwAh5kzy-zCpbIAiFH2J3geTMN2o-iUQf6o2CN5uxIorTUkKI9JpNP8-Z92g0RpVcrnuiT4zNunQgugAfNkgoc5jiXNyvrTeUpU9uA3i846zCVko43ohg3I01ZFO0grxQkcfojeMb5hVjolqB_IOer9VL0SDtXDqA114CdxuIM1s3bVbQg-Axf-mq02I-6ghE1sA4zakaPGu_vVhhxZd1nh202FqYXAlR1ccyTtSjxXXXC2umudzP-3907Pqpk6IG-HOOI6XpVnw2Q73zTuMj12mIRAjOpTg', 'environment' : 'QA API', 'accountId' : '2e29fc647c264edf9df2c83b7a249792', 'accountName' : 'Account1', 'companyName' : 'TestCompany', 'companyId' : '547d52f8fc2647b98a9d9f1014d0a536', 'siteName' : 'sanico_June25', 'siteId' : '145fc128f59348f88e5d9c3933a07db7', 'grant_type' : 'password', 'url_env' : 'qahydro', 'sample_appli_url' : 'http://jsonplaceholder.typicode.com/'])
        allVariables.put('QA UI', allVariables['default'] + ['app_url' : 'https://qahydro-digital.dovertech.co.in/', 'rest_endpoint' : 'https://hydro-digital-qa-webapp.azurewebsites.net/hydro/api', 'admin_username' : 'qauser@qahydro.onmicrosoft.com', 'admin_pwd' : 'Dover@123$', 'db_name' : 'hydro', 'db_username' : 'hydroqamysql@hydro-digital-qa-mysql', 'db_password' : 'DoverDigital123', 'db_host' : 'hydro-digital-qa-mysql.mysql.database.azure.com', 'timeout_small' : 5, 'timeout_medium' : 15, 'company_creation' : [('city') : findTestData('UI/Admin/Company/new_company_data').getValue(3, 1), ('address1') : findTestData('UI/Admin/Company/new_company_data').getValue(2, 1), ('zipCode') : findTestData('UI/Admin/Company/new_company_data').getValue(6, 1), ('country') : findTestData('UI/Admin/Company/new_company_data').getValue(5, 1), ('state') : findTestData('UI/Admin/Company/new_company_data').getValue(4, 1), ('companyName') : findTestData('UI/Admin/Company/new_company_data').getValue(1, 1), ('description') : findTestData('UI/Admin/Company/new_company_data').getValue(7, 1), ('contact_name') : findTestData('UI/Admin/Company/new_company_data').getValue(9, 1), ('site_name') : findTestData('UI/Admin/Company/new_company_data').getValue(12, 1), ('contact_number') : findTestData('UI/Admin/Company/new_company_data').getValue(10, 1), ('contact_email') : findTestData('UI/Admin/Company/new_company_data').getValue(11, 1), ('contact_title') : findTestData('UI/Admin/Company/new_company_data').getValue(8, 1)], 'invalid_email' : 'Email is invalid', 'no_records_msg' : 'No records available.', 'created_by' : 'Hima Velaga', 'company_edit' : [('site_name') : findTestData('UI/Admin/Company/edit_company_data').getValue(13, 1), ('contact_email') : findTestData('UI/Admin/Company/edit_company_data').getValue(12, 1), ('contact_number') : findTestData('UI/Admin/Company/edit_company_data').getValue(11, 1), ('contact_name') : findTestData('UI/Admin/Company/edit_company_data').getValue(10, 1), ('contact_title') : findTestData('UI/Admin/Company/edit_company_data').getValue(9, 1), ('description') : findTestData('UI/Admin/Company/edit_company_data').getValue(8, 1), ('zipCode') : findTestData('UI/Admin/Company/edit_company_data').getValue(7, 1), ('country') : findTestData('UI/Admin/Company/edit_company_data').getValue(6, 1), ('state') : findTestData('UI/Admin/Company/edit_company_data').getValue(5, 1), ('city') : findTestData('UI/Admin/Company/edit_company_data').getValue(4, 1), ('address2') : findTestData('UI/Admin/Company/edit_company_data').getValue(3, 1), ('address1') : findTestData('UI/Admin/Company/edit_company_data').getValue(2, 1), ('companyName') : findTestData('UI/Admin/Company/edit_company_data').getValue(1, 1)], 'mix_chars' : 'aA _-123+@', 'SampleData' : 'TestingGlobalVariable issue', 'account_creation' : [('accountName') : findTestData('UI/Admin/Account/new_account_data').getValue(1, 1), ('address1') : findTestData('UI/Admin/Account/new_account_data').getValue(2, 1), ('address2') : findTestData('UI/Admin/Account/new_account_data').getValue(3, 1), ('city') : findTestData('UI/Admin/Account/new_account_data').getValue(6, 1), ('country') : findTestData('UI/Admin/Account/new_account_data').getValue(4, 1), ('state') : findTestData('UI/Admin/Account/new_account_data').getValue(5, 1), ('description') : findTestData('UI/Admin/Account/new_account_data').getValue(8, 1), ('zipcode') : findTestData('UI/Admin/Account/new_account_data').getValue(7, 1), ('contactTitle') : findTestData('UI/Admin/Account/new_account_data').getValue(9, 1), ('contactName') : findTestData('UI/Admin/Account/new_account_data').getValue(10, 1), ('contactNumber') : findTestData('UI/Admin/Account/new_account_data').getValue(11, 1), ('contactEmail') : findTestData('UI/Admin/Account/new_account_data').getValue(12, 1)], 'db_port' : '3306', 'environment' : 'QA UI', 'site_creation' : [('siteName') : 'AutomatedSite', ('addressLine1') : 'Vijayanagar', ('addressLine2') : 'BTP,Bangalore', ('country') : 'India', ('state') : 'Karnataka', ('selectUnitsofMeasurement') : 'US', ('city') : 'Bangalore', ('zipcode') : '876546', ('description') : 'AutomatedDescription', ('title') : 'Mr', ('contactName') : 'Hariprasad', ('contactNumber') : '999875644', ('primaryEmail') : 'testing@testing.com', ('selectAccount ') : ''], 'distributormanager_username' : 'distributormanager@qahydro.onmicrosoft.com', 'distributoruser_username' : 'distributoruser@qahydro.onmicrosoft.com', 'sitemanager_username' : 'sitemanager@qahydro.onmicrosoft.com', 'siteuser_username' : 'siteuser@qahydro.onmicrosoft.com', 'distributormanager_password' : 'D0ver@32', 'distributoruser_password' : 'D0ver@32', 'sitemanager_password' : 'D0ver@32', 'siteuser_password' : 'D0ver@32', 'chemicalcompanyadmin_username' : 'chemicalcompanyadmin@qahydro.onmicrosoft.com', 'chemicalcompanymanager_username' : 'chemicalcompanymanager@qahydro.onmicrosoft.com', 'chemicalcompuser_user' : 'chemicalcompuser@qahydro.onmicrosoft.com', 'chemicalcompanyadmin_password' : 'D0ver@32', 'chemicalcompanymanager_password' : 'D0ver@32', 'chemicalcompuser_password' : 'D0ver@32'])
        allVariables.put('QAEnv', allVariables['default'] + ['app_url' : 'https://qahydro-digital.dovertech.co.in/', 'rest_endpoint' : 'https://hydro-digital-qa-webapp.azurewebsites.net/hydro/api', 'admin_username' : 'qauser@qahydro.onmicrosoft.com', 'admin_pwd' : 'Dover@123$', 'browser' : 'Chrome', 'sso_clientid' : '6f03985d-67d2-446a-8b2e-1fb4e29cf3cd', 'sso_client_secret' : 'UaLl3xg6luipDPjkImAWs/WWFa3BwRNnl0+WV01s41E=', 'azure_sso_url' : 'https://login.microsoftonline.com/qahydro.onmicrosoft.com', 'azure_sso_resource_url' : '6f03985d-67d2-446a-8b2e-1fb4e29cf3cd', 'elasticsearh_server' : '52.171.62.154', 'elasticsearch_port' : '9200', 'db_name' : 'hydro', 'db_username' : 'hydroqamysql@hydro-digital-qa-mysql', 'db_password' : 'DoverDigital123', 'db_host' : 'hydro-digital-qa-mysql.mysql.database.azure.com', 'timeout_small' : 5, 'timeout_medium' : 15, 'company_creation' : [('city') : findTestData('UI/Admin/Company/new_company_data').getValue(3, 1), ('address1') : findTestData('UI/Admin/Company/new_company_data').getValue(2, 1), ('zipCode') : findTestData('UI/Admin/Company/new_company_data').getValue(6, 1), ('country') : findTestData('UI/Admin/Company/new_company_data').getValue(5, 1), ('state') : findTestData('UI/Admin/Company/new_company_data').getValue(4, 1), ('companyName') : findTestData('UI/Admin/Company/new_company_data').getValue(1, 1), ('description') : findTestData('UI/Admin/Company/new_company_data').getValue(7, 1), ('contact_name') : findTestData('UI/Admin/Company/new_company_data').getValue(9, 1), ('site_name') : findTestData('UI/Admin/Company/new_company_data').getValue(12, 1), ('contact_number') : findTestData('UI/Admin/Company/new_company_data').getValue(10, 1), ('contact_email') : findTestData('UI/Admin/Company/new_company_data').getValue(11, 1), ('contact_title') : findTestData('UI/Admin/Company/new_company_data').getValue(8, 1)], 'invalid_email' : 'Email is invalid', 'no_records_msg' : 'No records available.', 'created_by' : 'Hima Velaga', 'company_edit' : [('site_name') : findTestData('UI/Admin/Company/edit_company_data').getValue(13, 1), ('contact_email') : findTestData('UI/Admin/Company/edit_company_data').getValue(12, 1), ('contact_number') : findTestData('UI/Admin/Company/edit_company_data').getValue(11, 1), ('contact_name') : findTestData('UI/Admin/Company/edit_company_data').getValue(10, 1), ('contact_title') : findTestData('UI/Admin/Company/edit_company_data').getValue(9, 1), ('description') : findTestData('UI/Admin/Company/edit_company_data').getValue(8, 1), ('zipCode') : findTestData('UI/Admin/Company/edit_company_data').getValue(7, 1), ('country') : findTestData('UI/Admin/Company/edit_company_data').getValue(6, 1), ('state') : findTestData('UI/Admin/Company/edit_company_data').getValue(5, 1), ('city') : findTestData('UI/Admin/Company/edit_company_data').getValue(4, 1), ('address2') : findTestData('UI/Admin/Company/edit_company_data').getValue(3, 1), ('address1') : findTestData('UI/Admin/Company/edit_company_data').getValue(2, 1), ('companyName') : findTestData('UI/Admin/Company/edit_company_data').getValue(1, 1)], 'mix_chars' : 'aA _-123+@', 'SampleData' : 'TestingGlobalVariable issue', 'account_creation' : [('accountName') : findTestData('UI/Admin/Account/new_account_data').getValue(1, 1), ('address1') : findTestData('UI/Admin/Account/new_account_data').getValue(2, 1), ('address2') : findTestData('UI/Admin/Account/new_account_data').getValue(3, 1), ('city') : findTestData('UI/Admin/Account/new_account_data').getValue(6, 1), ('country') : findTestData('UI/Admin/Account/new_account_data').getValue(4, 1), ('state') : findTestData('UI/Admin/Account/new_account_data').getValue(5, 1), ('description') : findTestData('UI/Admin/Account/new_account_data').getValue(8, 1), ('zipcode') : findTestData('UI/Admin/Account/new_account_data').getValue(7, 1), ('contactTitle') : findTestData('UI/Admin/Account/new_account_data').getValue(9, 1), ('contactName') : findTestData('UI/Admin/Account/new_account_data').getValue(10, 1), ('contactNumber') : findTestData('UI/Admin/Account/new_account_data').getValue(11, 1), ('contactEmail') : findTestData('UI/Admin/Account/new_account_data').getValue(12, 1)], 'db_port' : '3306', 'test' : 'will remove', 'environment' : 'QA Env'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        app_url = selectedVariables['app_url']
        rest_endpoint = selectedVariables['rest_endpoint']
        admin_username = selectedVariables['admin_username']
        admin_pwd = selectedVariables['admin_pwd']
        sso_clientid = selectedVariables['sso_clientid']
        sso_client_secret = selectedVariables['sso_client_secret']
        azure_sso_url = selectedVariables['azure_sso_url']
        azure_sso_resource_url = selectedVariables['azure_sso_resource_url']
        elasticsearh_server = selectedVariables['elasticsearh_server']
        elasticsearch_port = selectedVariables['elasticsearch_port']
        token = selectedVariables['token']
        environment = selectedVariables['environment']
        accountId = selectedVariables['accountId']
        accountName = selectedVariables['accountName']
        url_env = selectedVariables['url_env']
        grant_type = selectedVariables['grant_type']
        siteId = selectedVariables['siteId']
        companyId = selectedVariables['companyId']
        timeout_small = selectedVariables['timeout_small']
        timeout_medium = selectedVariables['timeout_medium']
        company_creation = selectedVariables['company_creation']
        invalid_email = selectedVariables['invalid_email']
        no_records_msg = selectedVariables['no_records_msg']
        created_by = selectedVariables['created_by']
        company_edit = selectedVariables['company_edit']
        mix_chars = selectedVariables['mix_chars']
        SampleData = selectedVariables['SampleData']
        account_creation = selectedVariables['account_creation']
        db_port = selectedVariables['db_port']
        companyName = selectedVariables['companyName']
        siteName = selectedVariables['siteName']
        sample_appli_url = selectedVariables['sample_appli_url']
        db_name = selectedVariables['db_name']
        db_username = selectedVariables['db_username']
        db_password = selectedVariables['db_password']
        db_host = selectedVariables['db_host']
        site_creation = selectedVariables['site_creation']
        distributormanager_username = selectedVariables['distributormanager_username']
        distributoruser_username = selectedVariables['distributoruser_username']
        sitemanager_username = selectedVariables['sitemanager_username']
        siteuser_username = selectedVariables['siteuser_username']
        distributormanager_password = selectedVariables['distributormanager_password']
        distributoruser_password = selectedVariables['distributoruser_password']
        sitemanager_password = selectedVariables['sitemanager_password']
        siteuser_password = selectedVariables['siteuser_password']
        chemicalcompanyadmin_username = selectedVariables['chemicalcompanyadmin_username']
        chemicalcompanymanager_username = selectedVariables['chemicalcompanymanager_username']
        chemicalcompuser_user = selectedVariables['chemicalcompuser_user']
        chemicalcompanyadmin_password = selectedVariables['chemicalcompanyadmin_password']
        chemicalcompanymanager_password = selectedVariables['chemicalcompanymanager_password']
        chemicalcompuser_password = selectedVariables['chemicalcompuser_password']
        browser = selectedVariables['browser']
        test = selectedVariables['test']
        
    }
}
