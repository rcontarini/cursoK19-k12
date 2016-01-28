package br.com.k19.beanvalidators;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = br.com.k19.beanvalidators.CPFBeanValidators.class)
public @interface CPF {
	String message() default "O número de CPF não é valido.";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
