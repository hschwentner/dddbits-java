package io.hschwentner.dddbits.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Represents a value of the domain.
 * A value has no identity and is immutable.
 *
 * @author Henning Schwentner
 * @since 1.0
 */
@Target(ElementType.TYPE)
@Documented
public @interface ValueObject {

}
