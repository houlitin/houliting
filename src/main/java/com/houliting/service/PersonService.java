package com.houliting.service;

import com.houliting.model.Person;

/**
 * Created by User on 2015/9/5.
 */
public class PersonService {
    public void updatePerson(Person person,String name,int age){
        person.setName(name);
        person.setAge(age);
    }
    public String selfIntroduce(Person person){
        String introduce = "I am "+person.getName()+",I am "+person.getAge();
        return introduce;
    }
}
