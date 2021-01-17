# SecurePay contact us page automation

**Requirements**
* Java
* Cucumber

Make sure the installed version of the Chrome Driver is compatible with the installed version of your web browser as your tests may not run as expected.

**Installation instructions**
* POM.xml has all the dependencies
* cucumber path/to/feature
* By default chrome browser is selected otherwise user has option to parameterize the browser from data.properties  or define it as environment parameter from command line.

**Tagging tests to run**
* Used @smoke at feature and Scenario level to have the classification

**Reports**
*Enabled the cucumber reports in the console.
*For example : https://reports.cucumber.io/reports/b9853745-c6c8-4fb3-8497-2ee74c375cd2 

**Screenshots**
*Screenshot method is implemented. Event listeners can use this method in case of failures.

**Logs**
*Java console logs are used, but this framework can be extended to use any other logging mechanisms.

**Last execution log**
***************************************************************************************************************************************************
I use the generated data to fill in the contact us form
First Name is:Austin
Last Name is:Reed
Email Id is:austin.reed@memortechassociates.biz
Phone Number is:256-329-0923
Company Name is:Vitae
Website url is:http://www.vitae.com
  And I use the generated data to fill in the contact us form           # StepDefinitions.contactDetails_PageFactory.fill_in_contact_us_form()
  Then I enter "message_text"                                           # StepDefinitions.contactDetails_PageFactory.i_enter(java.lang.String)
I close the browser
  And I close the browser                                               # StepDefinitions.contactDetails_PageFactory.close_browser()

1 Scenarios (1 passed)
8 Steps (8 passed)
0m18.402s


????????????????????????????????????????????????????????????????????????????
? View your Cucumber Report at:                                            ?
? https://reports.cucumber.io/reports/b9853745-c6c8-4fb3-8497-2ee74c375cd2 ?
?                                                                          ?
? This report will self-destruct in 24h.                                   ?
? Keep reports forever: https://reports.cucumber.io/profile                ?
????????????????????????????????????????????????????????????????????????????
***************************************************************************************************************************************************