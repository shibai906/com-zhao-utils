import com.zhao.utils.spring.DIExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("applicationContext.xml")
public class TestSpring {

    @Test
    public void testSpring() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DIExample diExample = context.getBean("DI1",DIExample.class);
        System.out.println(diExample.toString());

    }

}
