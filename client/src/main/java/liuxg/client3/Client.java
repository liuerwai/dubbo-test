package liuxg.client3;

import com.alibaba.dubbo.config.annotation.Reference;
import liuxg.test1.dubbo.server.ServiceInterface;
import org.springframework.stereotype.Component;

/**
 * @author liuxg
 * @date 2019/3/14
 */
@Component
public class Client {

    @Reference
    ServiceInterface serviceInterface;

    public void consume(){
        serviceInterface.service();
    }
}
