import com.beans.User;
import com.beans.UserController;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.Arrays;

public class SpringTest
{
    public static void main(String[] args)
    {

        //1.使用ApplicationContext 获取spring上下文
        /* Application在项目启动的时候全部进行加载
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        User user =(User)context.getBean("user");
        user.hello();*/

       /*2.使用BeanFactory获取spring上下文
            BeanFactory是懒加载
           BeanFactory factory=new XmlBeanFactory(new ClassPathResource("spring.xml"));*/
       /* User user =(User) factory.getBean("user");
        user.hello();*/

      /*  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //根据类型获取
        // User user = context.getBean(User.class);
        User user =context.getBean("user",User.class);
        user.hello();*/

        //通过注解存储bean
      /*  ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");*/
        //useController 使用了@Controller注解
        //@Controller 控制器
        //@Service    服务
        //@Repository 仓库
        //@Configuration 配置
        //@Component 组件

    /*    UserController userController=context.getBean("userController",UserController.class);
        userController.hello();*/

        //使用@Bean注解,需要配合五大类注解使用
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        User user=context.getBean("user1",User.class);
        System.out.println(user);

    }
}
