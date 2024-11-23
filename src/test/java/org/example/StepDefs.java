package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.jetbrains.annotations.NotNull;
import org.junit.Assert;

import static org.example.Operations.DIVIDE;
import static org.example.Operations.MULTIPLY;
import static org.example.Operations.ADD;

public class StepDefs {
    private Calculator calculator;
    private double number1;
    private double number2;
    private double result;
    private String exception;

    @Given("I have a calculator")
    public void settingUpCalculator() {
        calculator = new Calculator();
    }

    @And("I have two numbers {double} and {double}")
    public void settingUpOperands(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @When("I multiply them")
    public void multiplyingNumbers() {
        result = calculator.process(number1, number2, MULTIPLY);
    }

    @When("I divide them")
    public void dividingNumbers() {
        try {
            result = calculator.process(number1, number2, DIVIDE);
            exception = null;
        } catch (InvalidOperation e) {
            exception = e.getMessage();
        }
    }

    @When("I add them")
    public void addingNumbers() {
        result = calculator.process(number1, number2, ADD);
    }

    @When("I Subtract them")
    public void subtractNumbers(){
        result = calculator.process(number1, number2, SUBTRACT)
    }

    @Then("I should get the result {double} or an exception {string}")
    public void checkResult(Double expectedResult, @NotNull String expectedException) {
        if (expectedException.isEmpty()) {
            Assert.assertEquals(expectedResult, result, 0.0001);
        } else {
            Assert.assertEquals(expectedException, exception);
        }
    }
}
