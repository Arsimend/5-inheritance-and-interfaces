# Inheritance and interfaces

This repository contains a set of Java exercises to help you get acquainted with inheritance and interfaces.

For this exercise, we recommend the following self-study materials:

* [Objects, Classes, Interfaces, Packages, and Inheritance (dev.java)](https://dev.java/learn/oop/)
* [Java Polymorphism Fully Explained In 7 Minutes (Coding with John, YouTube)](https://youtu.be/jhDUxynEQRI)
* [Super Keyword in Java Full Tutorial - How to Use "super" (Coding with John, YouTube)](https://www.youtube.com/watch?v=Qb_NUn0TSAU)

Additionally, you should independently seek information from various sources.

## Starting the exercise

First fork this repository into your own GitHub repository with GitHub's **Fork** button. The exercise is done in your own fork, so only then clone your fork to your computer (the address contains your own GitHub username):

```sh
git clone https://github.com/<your-github-username>/<repository-name>.git
```

After cloning the project to your local machine, open it in your code editor.

## Submitting solutions

Solutions to this exercise are not graded by any GitHub Actions workflow (YAML), and `git push` does not start any grading. Grading is done by the course system: submit your solution on the exercise page in the course system, where your code is compiled and the exercise's JUnit tests are run.

Finally, push everything to your public GitHub repository and press the **Lähetä tarkistettavaksi** (submit for checking) button on the exercise page. The course system's bot then fetches your code from your repository and checks it with the same tests.

💡 *You can submit your solution as many times as needed until the chapter deadline. Your best result is kept.*


### Part 1: inheritance *(basics, 10 % + 10 %)*

In the [inheritance.webshop](./src/main/java/inheritance/webshop/) package of this task template, there are four Java classes designed to model products in a fictional web-based buying and selling service. By default, all products, regardless of type, contain the information defined in the [`Product`](./src/main/java/inheritance/webshop/Product.java) class (title, description, price). There are separate classes for [vehicles](./src/main/java/inheritance/webshop/Vehicle.java), [apartments](./src/main/java/inheritance/webshop/Apartment.java), and [tickets](./src/main/java/inheritance/webshop/Ticket.java), which include additional information specific to these products:

```mermaid
classDiagram
  direction TB

  class Product {
    - title: String
    - description: String
    - price: double
  }

  class Vehicle {
    + title: String
    + description: String
    + price: double
    - manufacturer: String
    - model: String
    - year: int
  }

  class Apartment {
    + title: String
    + description: String
    + price: double
    - numberOfRooms: int
    - size: double
    - floorNumber: int
  }

  class Ticket {
    + title: String
    + description: String
    + price: double
    - eventDateTime: LocalDateTime
  }

  Product <|-- Vehicle: Extends
  Product <|-- Apartment: Extends
  Product <|-- Ticket: Extends
```

In this exercise, you should first implement the  [`Product`](./src/main/java/inheritance/webshop/Product.java) class according to the comments within it. Once you have implemented the `Product` class and it passes the tests written for the class, implement the [`Vehicle`](./src/main/java/inheritance/webshop/Vehicle.java) class according to the comments written within it.

Both classes have their own tests: [ProductTest](./src/test/java/inheritance/webshop/ProductTest.java) and [VehicleTest](./src/test/java/inheritance/webshop/VehicleTest.java). You can run the tests either using your code editor's testing tool ([VS Code](https://code.visualstudio.com/docs/java/java-testing), [Eclipse](https://www.vogella.com/tutorials/JUnitEclipse/article.html)) or using the [Gradle tool](https://docs.gradle.org/current/userguide/java_testing.html):

```sh
./gradlew test --tests ProductTest      # unix
.\gradlew.bat test --tests ProductTest  # windows
```

```sh
./gradlew test --tests VehicleTest      # unix
.\gradlew.bat test --tests VehicleTest  # windows
```

The [`Apartment`](./src/main/java/inheritance/webshop/Apartment.java) and [`Ticket`](./src/main/java/inheritance/webshop/Ticket.java) classes can be found in the same directory, and you can continue practicing inheritance independently with them. The implementation of these classes is so similar to the `Vehicle` class that there are no automatic tests for them, and they are not separately considered in the task evaluation.

### Part 2: polymorphism *(applying, 20%)*

Objects of the subclasses you implemented using inheritance can be used in place of superclass objects, for example, in collections or as method parameters. Complete the methods in the [`WebShop`](./src/main/java/inheritance/webshop/WebShop.java) class to practice using different types of objects together and, if necessary, to learn to identify which class an object actually belongs to at any given time.

This part is checked using the [`WebShopTest`](./src/test/java/inheritance/webshop/WebShopTest.java) class, which you can run in your code editor or with Gradle:

```sh
./gradlew test --tests WebShopTest      # unix
.\gradlew.bat test --tests WebShopTest  # windows
```

💡 *This part utilizes the `Product` and `Vehicle` classes implemented in the previous section, so make sure the previous section works before proceeding to this one.*

### Part 3: Comparable interface *(basics, 20 %)*

The [Country.java](./src/main/java/interfaces/country/Country.java) file contains a typical Java class designed to model countries and their populations. Extend this class to implement the `Comparable<Country>` interface.

The `Comparable` interface is [available in Java](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Comparable.html) and contains only one method: `compareTo`. Implement this method according to the rules presented in the class. You can test your solution using either the provided [`CountryMain`](./src/main/java/interfaces/country/CountryMain.java) main program class or the [`CountryTest`](./src/test/java/interfaces/country/CountryTest.java) unit test class:

```sh
./gradlew test --tests CountryTest      # unix
.\gradlew.bat test --tests CountryTest  # windows
```

### Part 4: implementing your own interface *(applying, 10% + 10%)*

**MarkdownExport interface**

In this part of the exercise, you need to implement your own interface named `MarkdownExport`. The interface should be implemented in the [MarkdownExport.java](./src/main/java/interfaces/markdown/MarkdownExport.java) file. Define one method in this interface: `exportMarkdown()`. The method should not take any parameters and should return a string.

The purpose of the interface is to define an `exportMarkdown()` method for the implementing classes, which generates a [markdown](https://www.markdownguide.org/) formatted string representation of the object, for example, for saving to a file. You do not need to be familiar with Markdown syntax to solve the task; just follow the given examples.

**Pizza Class**

Once you have defined the above interface, modify the provided [`Pizza`](./src/main/java/interfaces/markdown/Pizza.java) class in the task template so that it implements this interface.

The string returned by the `exportMarkdown()` method in the Pizza class should include the pizza's name as a heading (`# name`) and a list of toppings (`- topping`). At the end of the string, include the pizza's price, for example:

```md
# Hawaiian

Toppings:
- ham
- pineapple
- mozarella

Price: 10.90
```

The MarkdownExport interface and the Pizza class are tested using the provided [`MarkdownExportTest`](./src/test/java/interfaces/markdown/MarkdownExportTest.java) test class:

```sh
./gradlew test --tests MarkdownExportTest      # unix
.\gradlew.bat test --tests MarkdownExportTest  # windows
```

**Product class**

Further develop the [`Product`](./src/main/java/inheritance/webshop/Product.java) class from the previous part of this exercise package so that it also implements the [`MarkdownExport`](./src/main/java/interfaces/markdown/MarkdownExport.java) interface. For products, the markdown representation must include the product's name, description, and price, but you can otherwise define the string format freely.

Since the `Product` class is in a different package than the MarkdownExport interface, you need to write an `import` statement: `import interfaces.markdown.MarkdownExport;`

The task for the `Product` class is checked with a separate [`ProductMarkdownTest`](./src/test/java/interfaces/markdown/ProductMarkdownTest.java) test class:

```sh
./gradlew test --tests ProductMarkdownTest      # unix
.\gradlew.bat test --tests ProductMarkdownTest  # windows
```

💡 *Note that since the `Vehicle` class inherits from the `Product` class, `Vehicle` also automatically fulfills this interface. If you want vehicles to have a different markdown representation than other products, you are free to implement a different version of the exportMarkdown method for it.*

### Part 5: dependency injection *(advanced, 20 %)*

The final part of this task package is an example of applying inheritance with dependency injection:

> *"In software engineering, dependency injection is a programming technique in which an object or function receives other objects or functions that it requires, as opposed to creating them internally. Dependency injection aims to separate the concerns of constructing objects and using them, leading to loosely coupled programs"*
>
> Dependency injection. Wikipedia. https://en.wikipedia.org/wiki/Dependency_injection

Solving the final part of this task requires only minimal changes to the source code. The main focus of this part is to familiarize yourself with the given classes and the comments within them:

* [`Main`](./src/main/java/dependency_injection/Main.java)

  *The main task instructions can be found in this class. This is the only class that needs to be modified in this part.*

* [`Application`](./src/main/java/dependency_injection/Application.java)
* [`PrinterWithTimestamp`](./src/main/java/dependency_injection/PrinterWithTimestamp.java)

Since this task involves minimal coding, there is no provided unit test for it. Ensure the functionality of the program and your changes by running the [`Main`](./src/main/java/dependency_injection/Main.java) main program class and reviewing the program's output. The task will be automatically evaluated by running the `Main` class with Gradle and examining its output:

```sh
./gradlew run      # unix
.\gradlew.bat run  # windows
```

## License and authors

This exercise is made by Teemu Havulinna and translated to English by Kalle Ilves and it is licensed under a [Creative Commons BY-NC-SA license](https://creativecommons.org/licenses/by-nc-sa/4.0/).

ChatGPT 3.5 language model and GitHub copilot AI assistant has been used to implement the exercise.
