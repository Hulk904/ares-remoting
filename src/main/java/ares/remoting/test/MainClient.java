package ares.remoting.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author liyebing created on 16/10/5.
 * @version $Id$
 */
public class MainClient {

    private static final Logger logger = LoggerFactory.getLogger(MainClient.class);

    public static void main(String[] args) throws Exception {

        //引入远程服务
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ares-client.xml");
        //获取远程服务
  //      final HelloService helloService = (HelloService) context.getBean("remoteHelloService");

   //     long count = 2L;

        //调用服务并打印结果
//        for (int i = 0; i < count; i++) {
//            try {
//                String result = helloService.sayHello("liyebing,i=" + i);
//                System.out.println(result);
//            } catch (Exception e) {
//                logger.warn("--------", e);
//            }
//        }

        TestService testService = (TestService) context.getBean("testService");
//        for(int i = 0 ;i < count ;i ++){
//            try{
//                System.out.println(testService.test("yangyuan"));
//            }catch (Exception exc){
//                System.out.println(exc);
//            }
//        }
        List list = testService.genericTest();
        for(Object s :  list){
            System.out.println("list return ==>" + s);
        }
        //关闭jvm
        System.exit(0);

    }
}
