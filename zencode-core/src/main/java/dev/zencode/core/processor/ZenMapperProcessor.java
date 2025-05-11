package dev.zencode.core.processor;

import dev.zencode.core.annotation.ZenField;
import dev.zencode.core.annotation.ZenMapper;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import java.util.Set;

@SupportedAnnotationTypes({
    "dev.zencode.core.annotation.ZenMapper",
    "dev.zencode.core.annotation.ZenField"
})
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class ZenMapperProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        // TODO: generate mapper classes here
        return true;
    }
}
