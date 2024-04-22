# Setting Up Selenium Project in Eclipse

This repository contains a Selenium project base that you can use to automate web browser testing. This document will guide you through the necessary steps to configure and run the project in Eclipse.

## Prerequisites

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) installed on your system.
- [Eclipse IDE](https://www.eclipse.org/downloads/) installed on your system.

## Configuration Steps

1. **Clone the Repository:** Clone this repository to your local system using Git:

    ```
    git clone https://github.com/user/selenium-project.git
    ```

2. **Open Eclipse:** Launch Eclipse IDE on your system.

3. **Import the Project:**

   - Go to `File` -> `Import`.
   - Select `Existing Maven Projects` and click `Next`.
   - Navigate to the directory where you cloned the repository and select the project.
   - Click `Finish` to import the project into Eclipse.

4. **Install Maven Dependencies:** Eclipse should automatically start downloading the project dependencies via Maven. If this doesn't happen automatically, right-click on the project in the `Project Explorer`, select `Maven`, and then `Update Project`.

5. **Configure WebDriver:** This project uses WebDriver for test automation. Make sure to download the appropriate driver for the browser you wish to automate (e.g., [ChromeDriver](https://chromedriver.chromium.org/downloads) for Google Chrome, [GeckoDriver](https://github.com/mozilla/geckodriver/releases) for Mozilla Firefox).

6. **Configure Driver in the Project:**

   - Download the driver for your preferred browser.
   - Place the downloaded file in an accessible location on your system.
   - In the Eclipse project, ensure that the path to the driver is correctly configured. You can modify the path in the project configuration file as needed.

## Running Tests

Once you have configured the project successfully, you can run the automated tests as follows:

1. Open the test class you wish to run in Eclipse.
