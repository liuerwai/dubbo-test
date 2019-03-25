package liuxg.test1.dubbo.server;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author liuxg
 * @date 2019/3/13
 */
@Component
@Service
public class ServiceInterfaceImpl implements ServiceInterface {

    public String service() {
        System.out.println("=====================dubbo服务================");
        return "dubbo服务";
    }
}
