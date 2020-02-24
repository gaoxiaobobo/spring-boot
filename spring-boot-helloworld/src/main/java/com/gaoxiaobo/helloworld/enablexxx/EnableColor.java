package com.gaoxiaobo.helloworld.enablexxx;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Import({Red.class,ColorRegistrarConfiguration.class,
        ColorImportSelector.class,
        ColorImportBeanDefinitionRegistrar.class})
public @interface EnableColor {
}
