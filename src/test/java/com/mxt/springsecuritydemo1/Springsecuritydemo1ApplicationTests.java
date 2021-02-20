package com.mxt.springsecuritydemo1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class Springsecuritydemo1ApplicationTests {


        @Test
        public void contextLoads() {
            PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
            //加密
            String encode=passwordEncoder.encode("123");
            System.out.println(encode);
            //比较密码
            System.out.println("==========================");
            boolean matches = passwordEncoder.matches("123", encode);
            System.out.println(matches);

    }

}
