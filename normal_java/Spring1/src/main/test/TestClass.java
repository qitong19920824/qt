import dao.IuserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

/**
 * @Author: qitong
 * @Date: 2019/12/1 21:36
 */

public class TestClass {
    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IuserDao iuserdao = (IuserDao) applicationContext.getBean("Iuserdao");
        iuserdao.saveuser();

    }
    @Test
    public void test2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
         UserService userService = (UserService) context.getBean("userService");
         userService.save();
    }
}
