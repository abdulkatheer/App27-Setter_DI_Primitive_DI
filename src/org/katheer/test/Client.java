package org.katheer.test;

import org.katheer.bean.Transportation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*
        How it works?
        Actually a primitive type in a Bean object can be set using property tag inside bean tag.
        It checks for the corresponding setXXX method to set the value. If no setXXX for a particular property is not available
        or if the setXXX method is not accessible (private or something), then the following exception will be thrown at runtime.
        Error setting property values; nested exception is org.springframework.beans.NotWritablePropertyException:
        Invalid property 'cost' of bean class [org.katheer.bean.Transportation]: Bean property 'cost' is not writable or has an invalid setter method.
        Does the parameter type of the setter match the return type of the getter?
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("org/katheer/resource/applicationContext.xml");

        Transportation t1 = (Transportation) context.getBean("t1");
        t1.getTransportationDetails();
    }
}
