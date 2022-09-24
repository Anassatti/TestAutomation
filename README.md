# Software Automation Solution (SAS)

**Note***

This solution is undergoing enhancement and improvement all the time until to reach the optimal method.

***Introduction***

Automation Testing is a software testing technique that performs using special automated testing software tools to execute a test case suite. The purpose of this framework helps test automation engineer is to build a robust automation solution and focus only on writing code the rest will be taken care of by this solution.

**Benefits of automation testing**

1.	Providing wider function coverage
2.	Reducing the total test cost
3.	Performing tests that manual testers cannot
4.	Shortening the test execution period
5.	Increasing the test frequency/reducing the time required for test cycles


To design an efficient automation solution  TAE should have extensive experience in many areas, which is taking time to master such as :

1. Technical experience.
2. Knowledge of automation frameworks patterns
3. Programming Language experience and skills
4. Knowledge of how to integrate with Project management, test management, and continuous integration tools


This SAS solution was brought up to make TAE avoid all these complications.

**My Work**

I designed common software automation solution library, which is suitable for any kind of automation projects mobile, web application,... This product contains framework, and integration points with project management, test management(Jira,DevOps), configuration management. The solution will avaliable in the image of JAR file, so TAE or developer only extract it, and the library will setup all the basics. It advisibale to use it with Maven. The solution will be setup a complete framework, which make the life of TAE, developer easir. Below is example of Ecommerce project, which the library setup structure that highlighted in red.

![image](https://user-images.githubusercontent.com/73906550/192098339-bdb913fb-4680-4357-ae09-c7173c4bc95c.png)



**Solution high level Workflow & Methodolgy**

![image](https://user-images.githubusercontent.com/73906550/191713094-b01a6332-a8c5-44ad-a486-04597e287ca5.png)


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

**Integration Layer**

This layer specialist in the integration points between these workflow and test management tool, defect tools,and any kinds of integration to isolate what I called the keys from the core. For example, in Jira integration the user should has his own Jira username and password,so this can be change in the integration layer only and the framework will take care of the rest including attaching the screenshot on the ticket. Also, the can add the name of the person, which the ticket will be assigned to.

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
10. Deep learning and machine learning integration, which comes by default with this architecture, which optionally if the TAE wants to activate it.

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

![image](https://user-images.githubusercontent.com/73906550/191803822-92c67b2c-6ccd-4b3e-b845-32ec6107a4e7.png)



**Product Realizatoon**

I tried this solution on many projects like the project that I shared here, also in other project such as building framework using machine learning & deep learning, below diagram show where the integration of AI engine in this product. The product is working perfectly to add path way to build fast framework. As we can see it become any easy for me using this architecture in integrate AI engine  between test definition and execution layers.

![image](https://user-images.githubusercontent.com/73906550/191729726-43955a2a-3420-450c-974e-e0afb43b8c6f.png)





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


***Next Step***

Build the project as library, which automtically will stepup everything in place
