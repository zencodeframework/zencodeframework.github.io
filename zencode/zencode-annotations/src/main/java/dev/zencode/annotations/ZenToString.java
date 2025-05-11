package dev.zencode.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface ZenToString {
    @Retention(RetentionPolicy.SOURCE)
    @Target(ElementType.FIELD)
    @interface Exclude {}
}
