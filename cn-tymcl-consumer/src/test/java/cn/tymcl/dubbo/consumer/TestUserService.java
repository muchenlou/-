package cn.tymcl.dubbo.consumer;

import cn.tymcl.dubbo.pojo.User;
import cn.tymcl.dubbo.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserService {

    @Reference(version = "1.0.0")
    private UserService userService;

    @Test
    public void testQueryAll(){
        List<User> users = userService.queryAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
