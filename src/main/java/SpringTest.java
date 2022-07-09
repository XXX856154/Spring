import com.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class SpringTest
{
    public static void main(String[] args)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        User user =(User)context.getBean("user");
        user.hello();

    }
}
