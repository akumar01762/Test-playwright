import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class calculatorStepDef {

    MyTest myTest = new MyTest();
    Integer result ;
    @Given("I have a calculator")
    public void i_have_a_calculator() {
        myTest.mytest();
        System.out.println("i have calculator");
    }
    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        result = int1 +int2;
    }
    @Then("I should get {int}")
    public void i_should_get(Integer int3) {
        assertThat(result,equalTo(int3));
    }
}
