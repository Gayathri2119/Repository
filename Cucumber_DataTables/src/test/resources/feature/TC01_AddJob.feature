Feature: I am automating Orange HRM appalication



Background: common steps
Given user enter launch the browser
Then user enter Url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario Outline: TC01_Datatable without Header.....> Creating a data table

And  user enters username as 
       |Admin|admin123|
When go to  Job page
Then Create Jobs Record

           |Java21|Java desc24|Test10|
           |Java30|Java desc40|Test2|
           |Java50|Java desc50|Test3|
           
Then user clicks logout button
Then close the browser