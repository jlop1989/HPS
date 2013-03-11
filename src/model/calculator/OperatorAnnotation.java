package model.calculator;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface OperatorAnnotation {
    String value();
    
}
