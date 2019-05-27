package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfiguration {
    private  Actor actor;
    @Bean(name="Movie")
    @Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Movie getMovie()
    {
        return new Movie(3,"Race 3",getActor());
    }

    @Bean(name="Actor")
    public Actor getActor()
    {
        actor=new Actor();
        actor.setName("Salman");
        actor.setAge(55);
        actor.setGender("Male");
        return  actor;
    }
    private Actor actor1;

    @Bean(name="Movie1")
    @Scope(value= ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Movie getMovie1()
    {
        return new Movie(7,"Ek villain",getActor1());
    }
    @Bean(name="Actor1")
    public Actor getActor1()
    {
        actor1=new Actor();
        actor1.setName("Shraddha");
        actor1.setAge(23);
        actor1.setGender("Female");
        return  actor1;
    }
}
