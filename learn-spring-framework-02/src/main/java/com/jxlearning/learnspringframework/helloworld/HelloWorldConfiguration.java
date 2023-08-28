package com.jxlearning.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) { };
record Address(String firstLine, String city) { };
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Ranga";
    }
    @Bean
    public int age() {
        return 27;
    }
    @Bean
    public Person person(){
        var person = new Person("Jun Xiang", 27, new Address("Baker Street", "London"));
        return person;
    }
    @Bean
    @Primary
    public Person person4Paramters(String name, int age, Address address) {
        return new Person(name, age, address);
    }
    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
        return new Person(name, age, address);
    }


    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }
    @Bean
    public Person person3Paramters(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        var address = new Address("Punggol", "Singapore");
        return address;
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3() {
        return new Address("Buangkok", "Thailand");
    }
}
