# Software Automation Solution (SAS)

***Introduction***

Automation Testing is a software testing technique that performs using special automated testing software tools to execute a test case suite. 


**Note***
This solution is able to update and change all the time until to reach the optimal method

**Benefits of automation testing**
•	Providing wider function coverage
•	Reducing the total test cost
•	Performing tests that manual testers cannot
•	Shortening the test execution period
•	Increasing the test frequency/reducing the time required for test cycles

**My Work**
I designed common software automation solution, which is suitable for any kind of automation projects. This product contains framework, and integration points with project management, test management, configuration management.

***Product layers***

**The Test Generation Layer**
                    Responsible from supports the manual design of test cases. It provides the means for designing test cases.
                    
**The Test Definition Layer**

 Responsible from supports the definition and implementation of test suites and/or test cases. It separates the test definition from the SUT and/or test system technologies and tools.
 
**The Test Execution Layer**

Responsible from supports the execution of test cases and test logging. It provides a
test execution tool to execute the selected tests automatically and a logging and reporting component.

**The Test Adaptation Layer**

Responsible from provides the necessary code to adapt the automated tests for the
various components or interfaces of the SUT. It provides different adaptors for connecting to the
SUT via APIs, protocols, services, and others.

These layers comply with below principles that support easy development, evolution, maintenance:

Single responsibility: Every component every component of the product framework is in charge of exactly one thing.
Extension: Every component must be open for extension, but closed for modification
Replacement: Every component is replaceable without affecting the overall behavior of the other components 
Component segregation: It is better to have more specific components than a general
Dependency inversion: The components of a TAS must depend on abstractions rather than on low level
Details

**Benefits**

1. A significant reduction in maintenance costs
2. A significant increase in software performance
3. Faster time to market (TTM)
4. Increase effective communication& collaboration due to integration with project management, test management, configuration management tools
5. Improving test efficiency
6. Scalability
7. Providing wider function coverage
8. Reducing the total test cost
9. Integration with Jira, which automatically in case there is a issue the solution will open Jira ticket with the ability to assign the ticket to specified person, all these happens without user interfere.

![image](https://user-images.githubusercontent.com/73906550/190955387-b47e61b0-0fa6-4959-adcd-f8bd37c161dd.png)


**Application and Impact**
The main goal of designing of this automation solution is to reduce the time consumed in building automation frameworks and help companies to integrate automation testing easily as part of their testing coverage. This product used to in web application automation project using below technologies into the different layers:
*Test conditions/Procedures/Test cases-Page Object Model
*Test execution Java, Selenium, TestNG
*Test Logging- Log4j
*Test Reporting- Extent HTML report
*Test Adaptation Layer Maven


My invention provided new methods for faster handoffs, the higher performance of implementing software automation project and better returns on investment with respect to with respect to timing, costs, efforts, and benefits. 

***The Solution Architecture***

![TestAutomationFrameworkUsingML](https://user-images.githubusercontent.com/73906550/183692912-deb70a44-6ea8-4dac-ab77-be1d567bbcb5.jpg)


**Testing result of this Product**

I tried this solution on many projects, which building framework using machine learning & deep learning, below diagram show where the integration of AI engine in this product. As we can see it become any easy for me using this architecture in integrate AI engine  between test definition and execution layers.

![image](https://user-images.githubusercontent.com/73906550/190896520-083ed94d-3558-47af-bc01-643cd531baba.png)




**Tools & Technologyies**

1. Java
2. Selenium
3. Page object model
4. Cucumber 
5. Testng
6. Maven 
7. Jenkins(CI): I integrated Github with Jenkins
8. Log4j for logging
9. Reporting : Extent HTML report & Screenshot
