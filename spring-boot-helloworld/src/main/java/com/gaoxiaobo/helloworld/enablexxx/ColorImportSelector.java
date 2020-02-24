package com.gaoxiaobo.helloworld.enablexxx;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import sun.tools.java.Imports;

public class ColorImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{Blue.class.getName()};
    }
}
