import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class CalcDemoTest {

    @org.junit.Test
    public void exec() {
        assertTrue( 2-CalcDemo.exec("(1+1)")<0.001);

    }
    @org.junit.Test
    public void exec2() {
        assertTrue( 1-CalcDemo.exec("1")<0.001);
    }

    @org.junit.Test
    public void calc() {
        assertTrue( 2-CalcDemo.calc("1+1")<0.001);
    }
    @org.junit.Test
    public void calc2() {
        assertTrue( 2-CalcDemo.calc("(1+1)")<0.001);
    }


}

