WHY SPRING
Let us consider an application scenario of generating a report in different formats such as PDF/HTML using Java.
Consider the following code:
ReportGenerator.java --> Interface

package com.infosys.demo;
    
public interface ReportGenerator {
    public String generateReport(int recordsPerPage);
    }

HTMLReportGenerator.java --> Implementation class for generating HTML reports

package com.infosys.demo;
public class HTMLReportGenerator implements ReportGenerator{
    @Override
    public String generateReport(int recordsPerPage) {              
            return "Generated HTML Report  with " + recordsPerPage + "records";
    }
}
PDFReportGenerator.java --> Implementation class for generating PDF reports

package com.infosys.demo;
public class PDFReportGenerator implements ReportGenerator{
        @Override
        public String generateReport( int recordsPerPage) {
                        return "Generated PDF Report with " + recordsPerPage + "records";
        }
}

ReportService .java --> Service class to provide report generation service

package com.infosys.demo;
public class ReportService {
    ReportGenerator master = new HTMLReportGenerator();   // Line1
    int recordsPerPage = 100;
    public void generateReport() {
        System.out.println(master.generateReport(recordsPerPage));
    }
}
 
In the above code,

ReportService is responsible for instantiating HTMLReportGenerator to generate the report in an appropriate format which makes it tight coupled. This is bad design because of the following reasons:

You cannot use a different implementation of ReportGenerator other than HTMLReportGenerator because of tight coupling. If the pdf report needs to be generated then Line1 of ReportService has to be modified.

Also, if you want to unit test generateReport() method then you need a mock object of ReportGenerator. But you cannot use mock object because there is no way to substitute the HTMLReportGenerator object that ReportService has. So testing ReportService becomes difficult.

Refer complete source code of Report Generation application implemented using Java (demo1-report-java) from downloaded demos.

Are we developing a loosely coupled application in the above scenario?
The answer is No because code change is required for any changes to the dependencies. In a traditional way, it is the application developer's responsibility to manage the application object life cycle along with its dependencies. Hence the application code is not completely loosely coupled which results in more complexity as the application grows bigger.



Spring Framework is an open source Java application development framework which supports developing all types of Java applications such as enterprise applications, web applications, cloud based applications and many more.

Java applications developed using Spring are simple, easily testable, reusable and maintainable.

Spring modules does not have tight coupling on each other, developer can pick and choose the modules as per the need for building an enterprise application.



Spring Framework 5.x has the following key module groups:

Core Container: These are core modules that provide key features of the Spring framework.

Data Access/Integration: These modules support JDBC and ORM data access approaches in Spring applications.

Web: These modules provide support to implement web applications.

Others: Spring also provides few other modules such as the Test for testing Spring applications.



Core container has the following modules:

Core: This is the key module of Spring Framework which provides fundamental support on which all other modules of the framework are dependent.

Bean: This module provides a basic Spring container called BeanFactory.

Context: This module provides one more Spring container called ApplicationContext which inherits the basic features of the BeanFactory container and also provides additional features to support enterprise application development.

Spring Expression Language (SpEL): This module is used for querying/manipulating object value.

AOP (Aspect Oriented Programming) and aspects: These modules help in isolating cross-cutting functionality from business logic.

We will discuss BeanFactory and ApplicationContext containers in detail later in this course.



The following modules support Data Access/Integration:

Java Database Connectivity (JDBC): It provides an abstract layer to support JDBC calls to relational databases.

Object Relational Mapping (ORM): It provides integration support for popular ORM(Object-Relational Mapping) solutions such as Hibernate, JPA, etc.

Transactions: It provides simple transaction API which abstracts the complexity of underlying repository specific transaction API's from the application.

Spring Framework Web module provides basic support for web application development. Web module has a web application context that is built on the application context of the core container. Web module provides complete Model-View-Controller(MVC) implementation to develop a presentation tier of the application and also support a simpler way to implement RESTful web services.



Spring Framework provides the following modules to support web application development:

Web: This module has a container called web application context which inherits basic features from ApplicationContext container and adds features to develop web based applications.

Webmvc: It provides the implementation of the MVC(model-view-controller) pattern to implement the server side presentation layer and also support features to implement RESTful Web Services.

WebFlux: Spring 5.0 introduced a reactive stack with a web framework called Spring WebFlux to support Reactive programming in Spring's web layer and runs on containers such as Netty, Undertow, and Servlet 3.1+.

WebSocket: It is used for 2 way communication between client and server in WebSocket based web applications.



Test: This module provides required support to test Spring applications using TestNG or JUnit.\





The current version of Spring Framework is 5.x, the framework has been enhanced with new features keeping core concepts same as Spring 4.x.

At a high level, the new features of Spring Framework 5.x are:

JDK baseline update

Core framework revision

Reactive Programming Model: Introduces a new non-blocking web framework called Spring WebFlux

Functional programming using Kotlin language support

Testing improvements by supporting integration with JUnit5

Let us look at Spring core relevant changes in detail:

JDK baseline update
The entire Spring framework 5.x codebase runs on Java 8 and designed to work with Java 9. Therefore, Java 8 is the minimum requirement to work on Spring Framework 5.x

Core framework revision
The core Spring Framework 5.x has been revised, one of the main changes is Spring comes with its own commons-logging through spring-jcl jar instead of standard Commons Logging.

There are few more changes in Spring 5.x with respect to library support and discontinued support, you can refer the Spring documentation for additional details.

