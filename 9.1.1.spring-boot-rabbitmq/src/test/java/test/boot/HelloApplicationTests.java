package test.boot;

import com.cloud.Ch911Application;
import com.cloud.product.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Admin on 2017/7/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Ch911Application.class)
public class HelloApplicationTests {

    @Autowired
    private Sender sender;

    @Test
    public void hello() {
        sender.send();
    }
}
