package com.jin01.settingGit.day06_optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalPractice {
    public Optional<String> getUserEmail(Map<String,String> userEmail, String name){
        // 이 메소드는 Map에서 name으로 이메일을 찾아서 Optional<String> 타입으로 반환해야 합니다.
        String email =userEmail.get(name);

        return Optional.ofNullable(email);
    }

    public static void main(String[] args) {

        OptionalPractice practice = new OptionalPractice();

        Map<String, String> userEmail = new HashMap<>();
        userEmail.put("Ailice", "ailice@gmail.com");

        Optional<String> optionalEmail1 = practice.getUserEmail(userEmail,"Ailice");
        optionalEmail1.ifPresent(email-> System.out.println("ailice님의 이메일은 " + email + "입니다."));

        Optional<String> optionalEmail2 = practice.getUserEmail(userEmail,"Bob");
        String emailOfDefault = optionalEmail2.orElse("등록되지 않았습니.");
        System.out.println("Bob님의 이메일은 "+ emailOfDefault);






    }
}
