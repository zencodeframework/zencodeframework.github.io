package dev.zencode.core.annotation;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
public @interface ZenField {
    String name() default "";
    boolean ignore() default false;
}
