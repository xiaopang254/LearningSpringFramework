package com.jxlearning.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) { };
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
        var person = new Person("Jun Xiang", 27);
        return person;
    }
    @Bean
    public Address address() {
        var address = new Address("Punggol", "Singapore");
        return address;
    }
}
