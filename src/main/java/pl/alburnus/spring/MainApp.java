package pl.alburnus.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.alburnus.spring.config.AppConfig;
import pl.alburnus.spring.model.User;


import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws SQLException {
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(AppConfig.class);
//
//        UserService userService = context.getBean(UserService.class);
//
//        // Add User
//        userService.add(User.builder().birthday(LocalDate.now()).email("janusz@wp.pl").name("Janusz").password("JanuszoweHaslo").build());
//        System.out.println("GetByname: " + userService.getByName("Janusz"));
//
//        // Get users
//        List<User> users = userService.getAll();
//        for (User user : users) {
//            System.out.println("Id = " + user.getId());
//            System.out.println("Name = " + user.getName());
//            System.out.println("Email = " + user.getEmail());
//            System.out.println("Password = " + user.getPassword());
//            System.out.println();
//        }
//
//        context.close();
    }
}
