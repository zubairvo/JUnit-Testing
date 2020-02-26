package zubair.co.za;

import org.junit.*;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MyMavenAppTest {

    MyMavenApp Person = new MyMavenApp("Zubair", "VO");
    MyMavenApp Person2 = new MyMavenApp("Zurina", "Cassiem");
    MyMavenApp Boss = Person;

    //@Rule
    //public Timeout timeout = new Timeout(1000);

    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {

    }

    @Test (timeout = 1000)
    public void mavenTest() {
        assertEquals(Person, Person);
        assertTrue(Person == Boss);
        //Assert.fail("You managed to mess this up");

        //System.out.println(Person.getFirstName());


    }

    @Test @Ignore
    public void getFirstName() {


    }

    @Test @Ignore
    public void getSurname() {
    }
}