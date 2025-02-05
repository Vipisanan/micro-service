package com.vp.user_service.dto;

import com.vp.user_service.dao.UserDao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private int userId;
    private String name;
    private String email;
    private List<OrderDto> orders;

    public UserDto(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public static List<UserDto> from(List<UserDao> usersDao) {
        return usersDao.stream().map(userDao -> new UserDto(userDao.getUserId(), userDao.getName(), userDao.getEmail())).toList();
    }
}
