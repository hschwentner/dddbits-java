package io.hschwentner.dddbits.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Marks a class as a service of the application layer.
 * Not to be confused with {@link DomainService}.
 *
 * @author Henning Schwentner
 * @since 1.0
 */
@Target(ElementType.TYPE)
@Documented
public @interface ApplicationService {

}
