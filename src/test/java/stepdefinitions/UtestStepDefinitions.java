package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import model.UtestData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.Complet;
import tasks.OpenUp;
import tasks.Register;

import java.util.List;


public class UtestStepDefinitions {



    @Before

    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Juan wants to register on the uTest platform$")
    public void thatJuanWantsToRegisterOnTheUTestPlatform(List<UtestData> utestData)
            throws Exception {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage(), Register.
                onThePage(UtestData.get(0).getStrEmail()));
    }

    @When("^he registers on the uTest platform$")
    public void heRegistersOnTheUTestPlatform(List<UtestData> utestData)
            throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Complet.the(UtestData.get(0).getStrPassword()));
    }

    @Then("^he should be registered on the uTest platform$")
    public void heShouldBeRegisteredOnTheUTestPlatform(List<UtestData> utestData)
            throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(UtestData.get(0).getStrRegistro())));

    }
//    @Given("^that Juan wants to learn testing on the utest platform$")
//    public void thatJuanWantsToLearnTestingOnTheUtestPlatform() {
//        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
//
//    }
//
//    @When("^he searches for the Utest Mobile App course on the utest academy platform$")
//    public void heSearchesForTheUTestMobileAppCourseOnTheUtestAcademyPlatform() {
//        OnStage.theActorInTheSpotlight().attemptsTo(Search.onThePage());
//    }
//
//    @Then("^he finds the course called (.*)$")
//    public void heFindsTheCourseCalledUTestMobileApp(String question) {
//        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
//
//    }
}
