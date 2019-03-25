package liuxg.client3;

import com.alibaba.dubbo.config.annotation.Reference;
import liuxg.test1.dubbo.server.ServiceInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Client3ApplicationTests {

	@Autowired
	Client client;

    @Reference
    ServiceInterface serviceInterface;

	@Test
	public void contextLoads() {
        serviceInterface.service();

		client.consume();
	}

}
