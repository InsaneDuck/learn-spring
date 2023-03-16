package dev.insaneduck.spring_security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class DemoSecurityConfig
{

    @Bean
    public InMemoryUserDetailsManager userDetailsManager()
    {
        UserDetails john = User.builder().username("john").password("test123").roles("ADMIN").build();
        UserDetails mary = User.builder().username("john").password("test123").roles("MANAGER").build();
        UserDetails susan = User.builder().username("john").password("test123").roles("EMPLOYEE").build();

        return new InMemoryUserDetailsManager(john, mary, susan);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
    {
        return http.authorizeHttpRequests(configurer -> configurer.anyRequest().authenticated())
                .formLogin(configurer -> configurer.loginPage("/loginPage").loginProcessingUrl(
                        "/auth").permitAll()).build();
    }
}
