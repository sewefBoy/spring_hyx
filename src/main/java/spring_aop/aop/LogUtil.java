package spring_aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import spring_aop.service.StudentService;

import java.util.Arrays;

@Aspect
@Component
@Order(100)
public class LogUtil {

    @Pointcut("execution(* spring_aop..*(..))")
    public void pc(){};

    @Before(value = "pc()")
    public void start(JoinPoint joinPoint){
        Object[] obj = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        System.out.println(signature.getName()+"方法开始执行, 参数为："+ Arrays.asList(obj));
    }

    @After(value = "pc()")
    public void stop(JoinPoint joinPoint){
        Object[] obj = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        System.out.println(signature.getName()+"方法结束执行, 参数为："+ Arrays.asList(obj));
    }

    @AfterReturning(value = "pc()", returning = "result")
    public void afterReturning(JoinPoint joinPoint,int result){
        Object[] obj = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        System.out.println(signature.getName()+"后置返回通知, 参数为："+ Arrays.asList(obj));
    }

    @AfterThrowing(value = "pc()",throwing = "e")
    public void afterThrowing(JoinPoint joinPoint,Exception e){
        Object[] obj = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        System.out.println(signature.getName()+"后置异常通知, 参数为："+ Arrays.asList(obj));
    }

    @Around("pc()")
    public int aroundMethod(ProceedingJoinPoint pjp){
        Signature signature = pjp.getSignature();
        Object[] obj = pjp.getArgs();
        Object ret = null;
        try {
            System.out.println(signature.getName()+"方法，环绕通知前, 参数为："+ Arrays.asList(obj));
            ret = pjp.proceed();
            System.out.println(signature.getName()+"方法，环绕通知后, 参数为："+ Arrays.asList(obj));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println(signature.getName()+"方法，环绕异常通知, 参数为："+ Arrays.asList(obj));
        } finally {
            //System.out.println(signature.getName()+"方法，环绕返回通知, 参数为："+ Arrays.asList(obj));
            System.out.println("环绕返回通知："+signature.getName()+"方法返回结果是："+ret);
        }
        return (int) ret;
    }
}
