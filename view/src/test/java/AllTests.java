import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@SuiteClasses({ entities.AllEntitiesTests.class, view.AllViewTests.class, worlds.AllWorldsTests.class, mapdao.AllMapTests.class })
public class AllTests {
} 