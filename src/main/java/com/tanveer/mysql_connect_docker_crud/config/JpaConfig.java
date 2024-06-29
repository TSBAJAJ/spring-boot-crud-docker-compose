package com.tanveer.mysql_connect_docker_crud.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

/**
 * @author tanvsingh
 * @created 10/08/2023
 */
@Configuration
//@EnableJpaRepositories(basePackages = {"org.cognome.hackathon.process.jpa.repos"})
@RequiredArgsConstructor
@Slf4j
public class JpaConfig {

    private final Environment env;

    @Bean
    DataSource dataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(env.getProperty("datasource.url"));
        ds.setUsername(env.getProperty("datasource.username"));
        ds.setPassword(env.getProperty("datasource.password"));
//        ds.setDefaultSchema(env.getProperty("datasource.schema"));
        log.info("URL :{} ", ds.getUrl());
        log.info("USERNAME :{} ", ds.getUserName());
        log.info("PASSWORD :{} ", ds.getPassword());
        return ds;
    }
}
