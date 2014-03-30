# JUnit Testing

This repository contains a project for Eclipse that lets you explore
test-driven development. It uses the JUnit 4 testing library.

Clone this repository and import the project into Eclipse.

## How to use this

The `src/Car.java` class contains a simple class representing a car, and 
a few methods are already implemented. You'll use test-driven development 
to add some new features to the class.

The `src/CarTest.java` file contains unit tests for the existing functionality
of the `Car` object, but you'll need to add more.

## Things To Do

1. Implement the `toString()` method of Car by using the existing unit test as
a guide. Return a string that matches the expectation of the test.

2. Implement the `decelerate()` method of Car by writing a unit test first. Ensure
that when you call the `decelerate()` method and pass an `amount` as its argument, 
     that the `speed` property decreases by that amount.

3. Write another test that ensures that you can't decelerate more than 0. Then
modify the implementation of the `decelerate()` method so that new test passes.

## Rules

1. Do not write any code unless it's to make a failing test pass.
2. Do not write any more of a unit test than is sufficient to fail, and not compiling is failing.
3. Do not write more code in the `Car` class than you need to make the current unit test pass.


