package noums.study.pizzahouse.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MenuCheckAspect {

    @Around("execution(public * noums.study.pizzahouse.controller.*..*(..))")
    public Object menuCheck(ProceedingJoinPoint joinPoint) throws Throwable {
        Object proceed = null;
        System.out.println(">>>> MenuCheckAspect start ...");
        proceed = joinPoint.proceed();
        System.out.println(">>>> MenuCheckAspect end ...");
        return proceed;
    }
}
