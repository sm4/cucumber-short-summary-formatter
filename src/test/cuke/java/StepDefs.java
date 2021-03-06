/*
 * Copyright (c) 2017 Martin Varga
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import cucumber.api.PendingException;
import cucumber.api.java8.En;

/**
 * @author Martin Varga
 */
public class StepDefs implements En {
    public StepDefs() {
        Given("^the coffee shop is open$", () -> {
        });
        Given("^the boss is around$", () -> {
        });
        When("^the boss buys me a coffee$", () -> {
        });
        Then("^I will drink coffee$", () -> {
        });
        Given("^I have a break$", () -> {
        });
        When("^I buy my own coffee$", () -> {
        });
        Given("^it's pizza day$", () -> {
        });
        When("^someone orders pizza$", () -> {
        });
        Then("^I will eat pizza$", () -> {
        });
        Given("^\"([^\"]*)\" is around$", (String arg0) -> {
        });
        When("^\"([^\"]*)\" buys coffee$", (String arg0) -> {
        });
    }
}
