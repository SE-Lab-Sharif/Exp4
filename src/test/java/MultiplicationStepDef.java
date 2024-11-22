import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

import org.example.Calculator;

public class MultiplicationStepDef {
    private Calculator calculator;
    private double number1;
    private double number2;
    private double result;

    @Given("I have a calculator")
    public void settingUpCalculator(double number1, double number2) {
        calculator = new Calculator();
    }

    @And("I have two numbers {double} and {double}")
    public void settingUpOperands(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @When("I multiply them")
    public void multiplyingNumbers() {
        result = calculator.multiply(number1, number2);
    }

    @Then("I should get the result {double}")
    public void checkingResult(double expectedResult) {
        Assert.assertEquals(expectedResult, result, 0.0001);
    }
}
