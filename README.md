# TestAutomation_Solution
Automation Product

Introduction
Automation Testing is a software testing technique that performs using special automated testing software tools to execute a test case suite. 

Benefits of automation testing
•	Providing wider function coverage
•	Reducing the total test cost
•	Performing tests that manual testers cannot
•	Shortening the test execution period
•	Increasing the test frequency/reducing the time required for test cycles
My Work
I designed common software automation product architecture, which is suitable for any kind of automation projects. This product contains framework, and integration points with project management, test management, configuration management.


This product divided into layers:

	The Test Generation Layer
                    Responsible from supports the manual design of test cases. It provides the means for designing test cases
	The Test Definition Layer
 Responsible from supports the definition and implementation of test suites and/or test cases. It separates the test definition from the SUT and/or test system technologies and tools.
	The Test Execution Layer
Responsible from supports the execution of test cases and test logging. It provides a
test execution tool to execute the selected tests automatically and a logging and reporting component.
	The Test Adaptation Layer
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

Benefits of this solution
•	A significant reduction in maintenance costs
•	A significant increase in software performance
•	Faster time to market (TTM)
•	Increase effective communication& collaboration due to integration with project management, test management, configuration management tools
•	Improving test efficiency
•	Scalability
•	Providing wider function coverage
•	Reducing the total test cost

Application and Impact
The main goal of designing of this automation solution is to reduce the time consumed in building automation frameworks and help companies to integrate automation testing easily as part of their testing coverage. This product used to in web application automation project using below technologies into the different layers:
	Test conditions/Procedures/Test cases-Page Object Model
	Test execution Java, Selenium, TestNG
	Test Logging- Log4j
	Test Reporting- Extent HTML report
	Test Adaptation Layer Maven

**Tools & Technologyies**

1. Java
2. Selenium
3. Page object model
4. Cucumber 
5. Testng
6. Maven 
7. Jenkins(CI): I integrated Github with Jenkins
8. Log4j for logging

My invention provided new methods for faster handoffs, the higher performance of implementing software automation project and better returns on investment with respect to with respect to timing, costs, efforts, and benefits. 


**Report**
1. Extent HTML report


![TestAutomationFrameworkUsingML](https://user-images.githubusercontent.com/73906550/183692912-deb70a44-6ea8-4dac-ab77-be1d567bbcb5.jpg)
