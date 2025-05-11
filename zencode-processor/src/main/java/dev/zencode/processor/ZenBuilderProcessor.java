package dev.zencode.processor;

import com.squareup.javapoet.*;
import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import java.io.IOException;
import java.util.Set;

@SupportedAnnotationTypes("dev.zencode.annotations.ZenBuilder")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class ZenBuilderProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (Element element : roundEnv.getElementsAnnotatedWith(dev.zencode.annotations.ZenBuilder.class)) {
            if (element.getKind() != ElementKind.CLASS) continue;
            TypeElement classElement = (TypeElement) element;
            // Example: print the annotated class name
            processingEnv.getMessager().printMessage(javax.tools.Diagnostic.Kind.NOTE, "Processing " + classElement.getSimpleName());
        }
        return true;
    }
}
