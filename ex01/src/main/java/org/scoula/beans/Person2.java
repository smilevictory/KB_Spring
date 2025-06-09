package org.scoula.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person2 {

    // 어노테이션으로 주입(조립)하는 3가지 방법
    // 1. 필드위에 표시 --> 아주 간단 -> 예전에 많이 사용
    // Person2 먼저 생성 후 나중에 Parrot을 끼는 방식 -> 현재는 비선호
    // 2. 생성자에 표시 --> 권장! 미리 만들어서 객체 생성할 때 주입~
    // 3. set메서드에 표시 --> 비권장 ! Parrot을 나중에 끼고 싶을 때 사용 (가끔 사용)

    private String name;

    // 싱글톤중에서 자동으로 Parrot2의 클래스로 만들어진 것 있으면 주입해줘
    // 1번 방법
    // @Autowired
    //private final Parrot2 parrot; // 2번 방법) 생성자로 주입한 것은 final을 써서
    // 처음에 주입한 parrot을 계속 사용할 수 있는 안정성을 확보!
    // 생성자 주입의 장점 (Spring 팀에서 권장)
    // 1) final을 통해 불변성을 확보 가능
    // 2) 의존성 보장 가능 (순환 참조 문제 해결)
    // 3) 코드 가독성 향상 ( 해당 객체가 어떤 의존성을 가진지 명확히 알 수 있음)
    // set메서드 사용 X

    // 3번 방법 -> final사용 X
    private Parrot2 parrot;

    // 2번 방법
    //@Autowired
    Person2(Parrot2 parrot){
        this.parrot = parrot;
    }

    public Parrot2 getParrot(){

        return parrot;
    }

    public String getName(){

        return name;
    }

    public void setParrot(@Qualifier("kiki") Parrot2 parrot){

        this.parrot = parrot;
    }

    public void setName(String name){

        this.name = name;
    }
}
