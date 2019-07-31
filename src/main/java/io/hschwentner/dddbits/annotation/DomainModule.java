package io.hschwentner.dddbits.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Marks a package as a module from the domain.
 *
 * @author Henning Schwentner
 * @since 1.0
 */
//@Target({ElementType.PACKAGE, ElementType.MODULE})
@Target({ElementType.PACKAGE})
@Documented
public @interface DomainModule {

}
