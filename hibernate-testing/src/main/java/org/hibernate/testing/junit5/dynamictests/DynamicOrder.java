/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.testing.junit5.dynamictests;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Specifies the order in which tests will be sorted and executed.
 * <p/>
 * This is based on Junit 5.4's {@code @Order} annotation.
 *
 * @author Chris Cranford
 */
@Target(METHOD)
@Retention(RUNTIME)
@Inherited
public @interface DynamicOrder {
	/**
	 * The order value for annotated element.
	 * <p/>
	 * The elements are ordered based on priority where a lower value has greater priority than a higher value.
	 * For example, {@link Integer#MAX_VALUE} has the lowest priority.
	 */
	int value() default Integer.MAX_VALUE;
}
