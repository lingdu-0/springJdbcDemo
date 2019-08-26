import com.wb.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {
    @Test
    public void main() {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        UserDao userDao = (UserDao) context.getBean("userDao");
//        userDao.addUser();
//        List<User> list = userDao.findAll();
//        for (User u : list)
//            System.out.println(u);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.zhuanzhang();
    }
}
