package cn.javastack.springboot.logging.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 功能描述:
 * 业务日志注解
 * 可以作用在控制器或其他业务类上，用于描述当前类的功能;
 * 也可以用于方法上，用于描述当前方法的作用;
 *
 * @author qintaxian
 * @since 2023/6/11
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface BusLog {

    /**
     * 功能名称
     *
     * @return String
     */
    String name() default "";

    /**
     * 功能描述
     *
     * @return String
     */
    String description() default "";
}
