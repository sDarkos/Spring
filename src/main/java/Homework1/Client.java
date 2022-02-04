package Homework1;

import Homework1.IHospital.IHospital;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        IHospital hospital = context.getBean("hospital", IHospital.class);

        hospital.doService();
    }
}
