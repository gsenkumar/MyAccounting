package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by aikkiasenthil on 28/10/2018.
 */
public class Hooks {

    public WebDriver driver;

    @Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
       /* this.driver = driver;
        this.driver = new SafariDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
*/    }

    @After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }

   /* public class Hooks {

        @Before
        public void beforeScenario(){
            System.out.println("This will run before the every Scenario");
        }
        @Before
        public void beforeScenarioStart(){
            System.out.println("-----------------Start of Scenario-----------------");
        }

        @Before("@First")
        public void beforeFirst(){
            System.out.println("This will run only before the First Scenario");
        }

        @After("@First")
        public void afterFirst(){
            System.out.println("This will run only after the First Scenario");
        }

        @After
        public void afterScenarioFinish(){
            System.out.println("-----------------End of Scenario-----------------");
        }
        @After
        public void afterScenario(){
            System.out.println("This will run after the every Scenario");
        }

        @Before(order=1)
        public void beforeScenario(){
            System.out.println("Start the browser and Clear the cookies");
        }
        @Before(order=0)
        public void beforeScenarioStart(){
            System.out.println("-----------------Start of Scenario-----------------");
        }


        @After(order=0)
        public void afterScenarioFinish(){
            System.out.println("-----------------End of Scenario-----------------");
        }
        @After(order=1)
        public void afterScenario(){
            System.out.println("Log out the user and close the browser");
        }

    }*/
}
