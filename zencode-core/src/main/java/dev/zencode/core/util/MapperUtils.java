package dev.zencode.core.util;

public class MapperUtils {
    public static <T, U> U mapObject(T source, Class<U> targetClass) {
        try {
            U instance = targetClass.getDeclaredConstructor().newInstance();
            // Use reflection to map matching fields
            // TODO: add logic here
            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Mapping failed", e);
        }
    }
}
