package seleniumzxq;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ a.class, b.class })
public class AllTests {


@BeforeClass
public static void d() {
	
	a.a=2;
	a.b=2;
}
}