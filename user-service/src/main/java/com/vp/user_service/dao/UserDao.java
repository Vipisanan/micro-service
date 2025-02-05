package com.vp.user_service.dao;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDao {
    private int userId;
    private String name;
    private String email;
}
