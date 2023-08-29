# Data Table Selection

This project is designed to test the selection a checkbox against a specific name `https://www.primefaces.org/primereact-v5/#/datatable/selection`.

## Features:

- Uses Serenity BDD for better structured tests
- Implemented with Page Object Model pattern
- Uses Java 11 and Maven 3.9.4
- Complete assertions using Hamcrest
- BDD implementation and search name parameterization

## Setup:

1. Clone this repo
2. Navigate to the root directory
3. Run `mvn clean install` to install the dependencies
4. Run `mvn verify serenity:aggregate` to execute the tests and generate report
5. Go to the target/site/serenity/ directory and open the file index.html
