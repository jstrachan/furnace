package org.jboss.forge.arquillian;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
/**
 * Specifies an Addon that must be installed before this Deployment may be performed.
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 */
public @interface AddonDependency
{
   String name();

   /**
    * Always attempt to run against the latest version by default
    */
   String version() default "LATEST";
}