package org.testobject.rest.api.appium.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TestObject {

	boolean testLocally() default false;

	String testObjectApiEndpoint() default TestObjectCapabilities.TESTOBJECT_API_ENDPOINT;

	String testObjectApiKey() default "";

	long testObjectSuiteId() default 0;

	long testObjectAppId() default 0;

	String[] testObjectDeviceIds() default {};

	int timeout() default 60;

	TimeUnit timeoutUnit() default TimeUnit.MINUTES;

}