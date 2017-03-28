package com.pedro.jdg.configuration;

import org.infinispan.client.hotrod.RemoteCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.pedro.jdg.spring.session.infinispan.remote.config.annotation.web.http.EnableInfinispanRemoteHttpSession;



@Configuration
@EnableInfinispanRemoteHttpSession

public class RemoteJDGConfiguration {


    @Bean
    public RemoteCacheManager remoteCacheManager() {
        return new RemoteCacheManager(
                new org.infinispan.client.hotrod.configuration.ConfigurationBuilder()
                        .addServers("localhost:11222")
                        .build());
    }

}
