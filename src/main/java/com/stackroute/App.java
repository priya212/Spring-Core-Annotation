package com.stackroute;

import com.stackroute.config.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        Movie movie = (Movie) ctx.getBean("Movie");
        System.out.println(movie.getActor().getName()+ " acted in : "+movie.getMovieName());

        Movie movie1 = (Movie) ctx.getBean("Movie1");
        System.out.println(movie1.getActor().getName()+ " acted in : "+movie1.getMovieName());
    }

}
