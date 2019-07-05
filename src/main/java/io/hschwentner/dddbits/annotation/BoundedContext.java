package io.hschwentner.dddbits.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//@Target({ElementType.MODULE, ElementType.PACKAGE})
@Target({ElementType.PACKAGE})
@Documented
public @interface BoundedContext {

}
