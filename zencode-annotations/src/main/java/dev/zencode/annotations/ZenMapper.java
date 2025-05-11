package dev.zencode.annotations;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ZenMapper {
    Class<?> from();
    Class<?> to();
}
