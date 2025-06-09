package org.scoula.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * 🌐 Spring MVC Web Context 설정 클래스
 * - Spring MVC의 웹 계층(Presentation Layer)을 담당하는 컨텍스트 설정 클래스
 * - 사용자 요청 처리와 관련된 모든 웹 컴포넌트들을 관리하고 설정함
 */
@EnableWebMvc
@ComponentScan(basePackages = {"org.scoula.controller"}) // Spring MVC용 컴포넌트 등록을 위한 스캔 패키지
public class ServletConfig implements WebMvcConfigurer {


    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/resources/**") // URL이 /resources/로 시작하는 모든 경로
                .addResourceLocations("/resources/"); // webapp/resources/ 경로로 매핑
    }


    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);           // JSTL 지원 활성화
        bean.setPrefix("/WEB-INF/views/");           // JSP 파일 기본 경로
        bean.setSuffix(".jsp");                      // JSP 파일 확장자
        registry.viewResolver(bean);                 // ViewResolver 등록
    }
}