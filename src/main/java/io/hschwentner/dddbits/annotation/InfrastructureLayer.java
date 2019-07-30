package io.hschwentner.dddbits.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Marks a package as infrastructure layer of a DDD style layered architecture of four layers.
 *
 * @author Henning Schwentner
 * @since 1.0
 */
//@Target({ElementType.MODULE, ElementType.PACKAGE})
@Target({ElementType.PACKAGE})
@Documented
public @interface InfrastructureLayer {

}
