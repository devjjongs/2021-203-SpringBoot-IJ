package annotation;

import java.lang.annotation.Inherited;

@Inherited
public @interface SuperAnno {
    public String description() default "";
}
