package noums.study.pizzahouse.interceptor;

import noums.study.pizzahouse.interceptor.OrderInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class OrderInterceptorConfig implements WebMvcConfigurer {

    // 특정 패턴의 URI 추가
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new OrderInterceptor())
//                .addPathPatterns("/orders");
//    }
}
