package br.com.dicasdeumdev.api.config;

import br.com.dicasdeumdev.api.domain.User;
import br.com.dicasdeumdev.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    UserRepository repository;
        @Bean
        public void startDB() {
            User u1 = new User(1, "Maria", "maria@email", "123");
            User u2 = new User(2, "Pedro", "pedro@email", "123");

            repository.saveAll(List.of(u1,u2));
        }
}
