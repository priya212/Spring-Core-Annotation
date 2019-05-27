package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemo implements InitializingBean, DisposableBean {
        @Override
        public void afterPropertiesSet() throws Exception {
            System.out.println("Init method after properties are set ");
        }

        @Override
        public void destroy() throws Exception {
            System.out.println("Spring container is destroyed ");
        }

        public void customInit()
        {
            System.out.println("Custom init called");
        }
        public void customDestroy()
        {
            System.out.println("Custom init destroyed");
        }
}
