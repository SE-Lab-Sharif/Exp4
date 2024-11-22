import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

import org.example.Calculator;

import static org.example.Operations.MULTIPLY;

public class StepDefs {
    private Calculator calculator;
    private double number1;
    private double number2;
    private double result;

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

    @Then("I should get the result {double}")
    public void checkingResult(double expectedResult) {
        Assert.assertEquals(expectedResult, result, 0.0001);
    }
}
