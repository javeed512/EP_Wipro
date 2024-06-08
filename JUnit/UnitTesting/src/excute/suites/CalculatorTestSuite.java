package excute.suites;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import test.suites.AdditionTest;
import test.suites.MultiplicationTest;
import test.suites.SubstractionTest;

@Suite
@SelectClasses({AdditionTest.class , SubstractionTest.class , MultiplicationTest.class})

//@SelectPackages({"test.suites"})

@IncludeTags("dev")
@ExcludeTags("production")
class CalculatorTestSuite {


	
}
