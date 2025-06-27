# Selenium LogIn Tests with Excel Reader

This project showcases how to automate login functionality using Selenium WebDriver and TestNG, with test data pulled from an Excel file (`.xlsx`) via Apache POI.

## 🔧 Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Apache POI
- Excel (data source)
- Maven

## 📁 Project Structure
- `Base/` – Base setup classes (`BaseTest`, `ExcelReader`)
- `Pages/` – Page Object Model classes (`LogInPage`, `HomePage`)
- `Tests/` – TestNG test classes (`LogInTest`)

## ✅ What It Tests
- Valid login using correct credentials
- Invalid login attempts (wrong username or password)
- Data-driven testing powered by Excel

## ▶️ How to Run
1. Clone this repository
2. Open the project in IntelliJ IDEA or your preferred IDE
3. Ensure Maven dependencies are installed
4. Run test methods from the `LogInTest` class

## 📌 Note
These tests use the demo site: `https://the-internet.herokuapp.com/login` for all login operations.
