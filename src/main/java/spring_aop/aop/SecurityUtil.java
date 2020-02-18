package spring_aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Order(100)
public class SecurityUtil {
    @Before(value = "execution(* spring_aop..*(..))")
    public void security(JoinPoint joinPoint){
        Object[] obj = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        System.out.println(signature.getName()+"方法，安全框架, 参数为："+ Arrays.asList(obj));
    }
}
