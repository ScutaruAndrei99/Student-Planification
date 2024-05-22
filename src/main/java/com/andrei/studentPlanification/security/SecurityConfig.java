//package com.andrei.studentPlanification.security;
//
//import com.andrei.studentPlanification.repository.UserRepository;
//import lombok.AllArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.User;
//
//import java.util.List;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//@Configuration
//@AllArgsConstructor
//@EnableWebSecurity
//public class SecurityConfig {
//
//    private UserRepository userRepository;
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.csrf(AbstractHttpConfigurer::disable);
//        http
//                .authorizeHttpRequests(authorize -> authorize.requestMatchers(HttpMethod.GET,"/api/**").hasAnyRole("User","Admin"))
//                .authorizeHttpRequests(authorize -> authorize.requestMatchers(HttpMethod.POST,"/api/**").hasAnyRole("Admin"))
//                .authorizeHttpRequests(authorize -> authorize.requestMatchers(HttpMethod.PUT,"/api/**").hasAnyRole("Admin"))
//                .authorizeHttpRequests(authorize -> authorize.requestMatchers(HttpMethod.DELETE,"/api/**").hasAnyRole("Admin"))
//                .formLogin(withDefaults())
//                .httpBasic(withDefaults());
//        return http.build();
//    }
//
//    @Bean
//    public UserDetailsService userDetailService() {
//        var uds =new InMemoryUserDetailsManager();
//        List<com.andrei.studentPlanification.model.User> users =userRepository.findAll();
//        users.forEach(u -> uds.createUser(User.withUsername(u.getUsername())
//                .password(passwordEncoder().encode(u.getPassword()))
//                .roles(u.getUsername())
//                .build()));
//        return uds;
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//}
