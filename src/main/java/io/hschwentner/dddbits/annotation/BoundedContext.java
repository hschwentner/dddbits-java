package io.hschwentner.dddbits.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Marks a package as a bounded context.
 * The domain model in the bounded context may only be accessed through its interface.
 *
 * @author Henning Schwentner
 * @since 1.0
 */
//@Target({ElementType.MODULE, ElementType.PACKAGE})
@Target({ElementType.PACKAGE})
@Documented
public @interface BoundedContext {

}
