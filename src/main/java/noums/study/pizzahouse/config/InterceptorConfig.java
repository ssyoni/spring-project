package noums.study.pizzahouse.config;


import noums.study.pizzahouse.interceptor.LoggingInterceptor;
import noums.study.pizzahouse.interceptor.MenuCheckingInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new LoggingInterceptor())
                .addPathPatterns("/**");

        registry.addInterceptor(new MenuCheckingInterceptor())
                .addPathPatterns("/orders/**");


    }
}
