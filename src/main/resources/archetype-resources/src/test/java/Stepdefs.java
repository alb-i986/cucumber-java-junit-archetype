#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import cucumber.api.java.en.Given;

public class Stepdefs {
    @Given("^I have (${symbol_escape}${symbol_escape}d+) cukes in my belly${symbol_dollar}")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);
    }
}
