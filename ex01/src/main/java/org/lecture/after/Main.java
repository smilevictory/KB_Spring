package org.lecture.after;

import org.lecture.after.NotiService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        NotiService service = context.getBean(NotiService.class);

        service.notify("스프링 DI 예제");

    }
}
