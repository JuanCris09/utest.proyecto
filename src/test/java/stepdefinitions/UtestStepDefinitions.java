package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.Login;
import tasks.OpenUp;
import tasks.Search;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^that Juan wants to learn testing on the utest platform$")
    public void thatJuanWantsToLearnTestingOnTheUtestPlatform() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));

    }

    @When("^he searches for the Utest Mobile App course on the utest academy platform$")
    public void heSearchesForTheUTestMobileAppCourseOnTheUtestAcademyPlatform() {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.onThePage());
    }

    @Then("^he finds the course called (.*)$")
    public void heFindsTheCourseCalledUTestMobileApp(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }
}
