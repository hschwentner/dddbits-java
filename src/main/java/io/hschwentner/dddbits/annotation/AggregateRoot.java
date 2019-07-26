package io.hschwentner.dddbits.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Marks a class as the root entity of an aggregate.
 * Inner entities of the aggregate may only be accessed through this root entity.
 *
 * @author Henning Schwentner
 * @since 1.0
 */
@Target(ElementType.TYPE)
@Documented
@DomainEntity
public @interface AggregateRoot {

}
