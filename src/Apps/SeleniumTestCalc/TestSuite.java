package Apps.SeleniumTestCalc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        VisualTest.class,
        ButtonTest.class,
        ButtonJoinTest.class,
        ResultTest.class
})



public class TestSuite
{


}
