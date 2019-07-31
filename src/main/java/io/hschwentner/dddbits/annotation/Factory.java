package io.hschwentner.dddbits.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Marks a type as a factory.
 * A factory is an element of the domain layer that creates domain objects.
 *
 * @author Henning Schwentner
 * @since 1.0
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
public @interface Factory {

}
