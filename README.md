# Instagram Comment Deletion Automation

This project demonstrates an automation script to delete comments on an Instagram activity page using the Selenide library.

## Prerequisites

- Java Development Kit (JDK)
- Gradle
- ChromeDriver executable (for Selenium)

## Setup

1. Clone this repository to your local machine.
2. Download and place the ChromeDriver executable in a location on your machine. Update the path to the ChromeDriver in the `Main.java` file.
3. Configure your Instagram username and password in the `InstagramPage.java` file. Alternatively, you can modify the code to read credentials from system properties, environment variables, or a properties file for security reasons.

## Running the Tests

1. Open a terminal and navigate to the project directory.
2. Run the following command to execute the tests:
   This will execute the `InstagramTest` class which contains the test logic.

## Explanation

The project is organized as follows:

- `InstagramPage.java`: Contains methods to interact with the Instagram login and comments page.
- `InstagramTest.java`: Contains the main test logic for deleting Instagram comments. Modify the loop and comment count as needed.

## Important Note

This project is for educational and testing purposes only. Hard-coding usernames and passwords in code is not recommended for production applications. To improve security, consider using environment variables or properties files to manage sensitive information.
