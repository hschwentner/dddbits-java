package io.hschwentner.dddbits.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Marks a type as a domain service.
 * Such a service contains only domain logic.
 * It keeps no own state, although it typically changes the state of the {@link Aggregate}s it is working on.
 *
 * @author Henning Schwentner
 * @since 1.0
 */
@Target(ElementType.TYPE)
@Documented
public @interface DomainService {

}
