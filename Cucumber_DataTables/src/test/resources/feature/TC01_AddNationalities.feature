Feature: I am automating Orange HRM appalication



Background: common steps
Given user enter launch the browser
Then user enter Url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario Outline: TC01_AddNationalities-- without Header.....> Creating a data table

And  user enters username as 
       |Admin|admin123|
When go to Nationalities page
Then Create Nationalities Record

           |Java9|
           |Java30|
           |Java50|
           
Then user clicks logout button
Then close the browser