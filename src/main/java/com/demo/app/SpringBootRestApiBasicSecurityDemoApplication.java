package com.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootRestApiBasicSecurityDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestApiBasicSecurityDemoApplication.class, args);
    }


    @GetMapping
    public User getMessage() {
        return new User("user1", "User Successfully Logged into the System!!!!!.");
    }

}

class User {
    private String userName;
    private String loginStatus;

    public User(String userName, String loginStatus) {
        this.userName = userName;
        this.loginStatus = loginStatus;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }
}
