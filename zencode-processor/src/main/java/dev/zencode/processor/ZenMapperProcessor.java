package dev.zencode.processor;

import dev.zencode.annotations.ZenMapper;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import java.util.Set;

@SupportedAnnotationTypes("dev.zencode.annotations.ZenMapper")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class ZenMapperProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (Element element : roundEnv.getElementsAnnotatedWith(ZenMapper.class)) {
            if (element.getKind() != ElementKind.INTERFACE) continue;
            ZenMapper annotation = element.getAnnotation(ZenMapper.class);
            processingEnv.getMessager().printMessage(javax.tools.Diagnostic.Kind.NOTE,
                "Mapping from " + annotation.from().getSimpleName() + " to " + annotation.to().getSimpleName());
            // Actual code generation logic would go here
        }
        return true;
    }
}
