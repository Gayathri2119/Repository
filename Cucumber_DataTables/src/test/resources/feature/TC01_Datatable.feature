Feature: I am automating Orange HRM appalication



Background: common steps
Given user enter launch the browser
Then user enter Url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario Outline: TC01_Datatable without Header.....> Creating a data table

And  user enters username as 
       |Admin|admin123|
When go to skills page
Then Create skills Record

           |Java113|Java desc1132|
           |Java3012|Java desc40W21|
           |Java50WE1|Java desc5F01|
           
Then user clicks logout button
Then close the browser