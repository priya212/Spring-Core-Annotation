package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfiguration {
    private  Actor actor;
    private Movie movie;
    /*@Bean(name={"Movie","movie3"})
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
    }*/

    @Bean(name="Movie",autowire = Autowire.BY_NAME)
    public Movie getMovie()
    {
        movie=new Movie();
        movie.setId(3);
        movie.setMovieName("Jai Ho");
        return movie;
    }
    @Bean(name="actor")
    public Actor getActor()
    {
        actor =new Actor();
        actor.setName("Salman");
        actor.setGender("Male");
        actor.setAge(55);
        return  actor;
    }

    @Bean(name="actor1")
    public Actor getActor1()
    {
        actor =new Actor();
        actor.setName("Tabbu");
        actor.setGender("Female");
        actor.setAge(52);
        return  actor;
    }


}
