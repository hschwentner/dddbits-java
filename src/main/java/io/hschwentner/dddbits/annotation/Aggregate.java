package io.hschwentner.dddbits.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Marks a package as an aggregate of the domain.
 * An aggregate draws a boundary around its entity or entities.
 * Inner entities may only be accessed through the root entity.
 *
 * @author Henning Schwentner
 * @since 1.0
 */
//@Target({ElementType.PACKAGE, ElementType.MODULE})
@Target({ElementType.PACKAGE})
@Documented
public @interface Aggregate {

}
