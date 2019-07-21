package io.hschwentner.dddbits.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Marks a type as an entity of the domain.
 * An entity has an identity, a life cycle and may have a mutable state.
 *
 * The name DomainEntity was chosen so it cannot easily be confused with {@link javax.persistence.Entity}.
 *
 * @author Henning Schwentner
 * @since 1.0
 */
@Target(ElementType.TYPE)
@Documented
public @interface DomainEntity {

}
