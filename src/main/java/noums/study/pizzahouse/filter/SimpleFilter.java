package noums.study.pizzahouse.filter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@Component
public class SimpleFilter {

    //@Bean
    public FilterRegistrationBean<CorsFilter> corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("http://localhost:8080");
        config.addAllowedHeader("*");
        config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
        source.registerCorsConfiguration("/**", config);
        FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<>(new CorsFilter(source));
        bean.setOrder(0);
        System.out.println("########################################");
        System.out.println("create corsFilter !!!!!!!!");
        System.out.println("########################################");
        return bean;
    }



    @Bean
    public FilterRegistrationBean<MyFilter> myFilter() {
        // FilterRegistrationBean으로 감싸지 않아도 필터 작동은 한다.
        // 하지만 urlpattern 추가 등의 FilterRegistrationBean에서 제공해주는 기능을 사용하고 싶다면 감싸는게 편하다.
        FilterRegistrationBean<MyFilter> bean = new FilterRegistrationBean<>(new MyFilter());
        bean.addUrlPatterns("/orders/*");
        System.out.println("########################################");
        System.out.println("create myFilter !!!!!!!!");
        System.out.println("########################################");
        return bean;
    }


}
