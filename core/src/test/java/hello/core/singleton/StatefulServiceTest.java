package hello.core.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class StatefulServiceTest {

    @Test
    public void order(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService = ac.getBean("statefulService", StatefulService.class);

        statefulService.order("userA",10000);
        statefulService.order("userB",20000);

        System.out.println(statefulService.getPrice());
    }


    public static class TestConfig{

        @Bean
        public StatefulService statefulService(){
            return new StatefulService();
        }

    }
}
