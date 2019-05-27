package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {
    @Bean(name="Movie")
    public Movie getMovie()
    {
        return new Movie(1,"Jodha Akhbar",getActor());
    }

    @Bean(name="Actor")
    public Actor getActor()
    {
        return new Actor("Hritik","Male",40);
    }

    @Bean(name="Movie1")
    public Movie getMovie1()
    {
        return new Movie(2,"Veer zaara",getActor1());
    }
    @Bean(name="Actor1")
    public Actor getActor1()
    {
        return new Actor("Preety","Female",45);
    }
}
