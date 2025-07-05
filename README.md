# 🧪 String Calculator Kata - Test Driven Development (TDD)

Welcome to the *String Calculator Kata*, a TDD-driven Java implementation showcasing **Test-Driven Development**, clean coding practices, and comprehensive JUnit testing.

This project follows the classic kata introduced by [Roy Osherove](http://osherove.com/kata), demonstrating *Test-Driven Development*, modular design, and thorough unit testing.

---

## 📘 What is TDD?

*Test-Driven Development (TDD)* is a development technique where you:

1. ✍ Write a failing test first  
2. 🛠 Write the minimal code to make the test pass  
3. 🔄 Refactor the code while keeping tests green  

It follows this powerful cycle:

> 🔁 *Failed → Passed → Refactor*

---

## 📐 How I Built This Project

This project was built incrementally, respecting TDD principles step-by-step:

- 🚦 Started with the *simplest test* for an empty string
- 🧪 Added tests one at a time for each new rule or requirement
- 🧹 Refactored after each passing test
- 💡 Never wrote unnecessary logic before the test demanded it

---

## ✅ Features Implemented

| Step | Requirement                                                                 | Status |
|------|-----------------------------------------------------------------------------|--------|
| 1️⃣  | Return 0 for empty string                                                 | ✅ Done |
| 2️⃣  | Handle 1 or 2 numbers "1", "1,2"                                        | ✅ Done |
| 3️⃣  | Allow unknown number of numbers "1,2,3,4"                                 | ✅ Done |
| 4️⃣  | Support newline characters "1\n2,3"                                       | ✅ Done |
| 5️⃣  | Support custom single delimiter "//;\n1;2"                                | ✅ Done |
| 6️⃣  | Throw exception for negative numbers with message                          | ✅ Done |
| 7️⃣  | Show all negative numbers in exception message                             | ✅ Done |
| 8️⃣  | Track how many times add() was called via getCalledCount()             | ✅ Done |
| 9️⃣  | Ignore numbers >1000 ("1,1001" → returns 1)                              | ✅ Done |
| 🔟  | Support multi-char delimiters like "//[***]\n1***2***3"                    | ✅ Done |
| 1️⃣1️⃣ | Support multiple single-char delimiters like "//[*][%]\n1*2%3"         | ✅ Done |
| 1️⃣2️⃣ | Support multiple multi-char delimiters like "//[**][%%]\n1**2%%3"     | ✅ Done |

---

## 💡 Sample Inputs & Outputs

| Input                                | Output / Behavior                        |
|--------------------------------------|-------------------------------------------|
| ""                                 | 0                                       |
| "1"                                | 1                                       |
| "1,2"                              | 3                                       |
| "1\n2,3"                           | 6                                       |
| "//;\n1;2"                         | 3                                       |
| "//[***]\n1***2***3"               | 10                                      |
| "//[*][%]\n1*2%3"                  | 10                                      |
| "//[**][%%]\n1**2%%3"              | 6                                       |
| "1,-2,-3"                          | Exception: negative numbers are not allowed [-2, -3] |
| "1,1001"                           | 1                                       |

---

## 🧪 Testing

JUnit 4 is used as the primary testing framework.

Test coverage includes:

- ✅ Empty string handling
- ✅ Single and multiple number inputs
- ✅ Unknown amount of numbers
- ✅ Newline character delimiters
- ✅ Custom single character delimiters
- ✅ Negative number exception handling
- ✅ Multiple negative numbers in exception message
- ✅ Method call counting functionality
- ✅ Numbers greater than 1000 ignored
- ✅ Multi-character custom delimiters
- ✅ Multiple single-character delimiters
- ✅ Multiple multi-character delimiters

> 🔍 All tests are located in SpringCalculatorTest.java

To run tests:

```bash
mvn test
```

---

## 📁 Project Structure

```
StringCalculator/
├── src/
│   ├── main/java/com/spring/
│   │   └── StringCalculator.java       ← Core calculator logic
│   └── test/java/com/spring/
│       └── SpringCalculatorTest.java   ← JUnit tests for the calculator
├── pom.xml                             ← Maven dependencies (JUnit)
└── README.md                           ← You're reading it!
```

---

## 🧱 Tech Stack

| Tool         | Description                              |
|--------------|------------------------------------------|
| ☕ Java       | Primary programming language             |
| 🧪 JUnit 4    | Unit testing framework                   |
| 🛠 Maven      | Build automation & dependency management |

---

## 🏗️ Key Implementation Details

### StringCalculator Class Features:
- **Method Call Tracking**: `getCalledCount()` tracks how many times `add()` is called
- **Advanced Delimiter Support**: Handles single-char, multi-char, and multiple delimiters
- **Regex Pattern Matching**: Sophisticated delimiter parsing with special character escaping
- **Input Validation**: Comprehensive negative number detection and exception handling
- **Number Filtering**: Automatically ignores numbers greater than 1000

### Test Class Features:
- **Comprehensive Coverage**: 12 test methods covering all kata requirements
- **Edge Case Testing**: Empty strings, single numbers, and complex delimiter combinations
- **Exception Testing**: Proper validation of negative number exceptions
- **State Testing**: Verification of method call counting functionality

---

## 📸 All Tests Passing

All scenarios from the kata are green ✅

---

This was an excellent exercise in writing clean, modular, and testable code with a clear purpose.

---

> "First make it work, then make it right, then make it fast."  
> — Kent Beck, Father of TDD
