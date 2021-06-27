package noums.study.pizzahouse.test;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//interceptor 설정파일 ...
public class TestInterceptor implements HandlerInterceptor {

    // 요청을 처리할 Handler 에 가기전에 호출
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle 호출 ~~~~~~");
        return true;
    }

    // preHandle 메서드가 요청을 처리하고 true 리턴 하면 호출.
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // postHandle 메소드에 정의된 모든 작업이 끝나면 View 를 랜더링
        System.out.println("postHandle 호출 ~~~~~~");
    }

    // View 랜더링 끝나고 호출
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // afterCompletion 에 정의된 모든 작업이 끝나면 클라이언트에 Response 를 전달한다.
        System.out.println("afterCompletion 호출 ~~~~~~");
    }
}
