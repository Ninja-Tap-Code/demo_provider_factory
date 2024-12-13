package util;

import org.reflections.Reflections;

import java.util.Set;

public class ClassScanner {
    // Reflection sẽ quét tất cả các class trong 1 package
    public static <T> Set<Class<? extends T>> findSubTypes(String packageName, Class<T> parentType) {
        Reflections reflections = new Reflections(packageName);
        return reflections.getSubTypesOf(parentType);
    }
}
