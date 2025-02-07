package com.vp.user_service.service;

import com.vp.user_service.dao.UserDao;
import com.vp.user_service.dto.UserDto;
import com.vp.user_service.feign.OrderInterface;
import com.vp.user_service.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderInterface orderInterface;

    public List<UserDto> getAllUsers(){
       List<UserDao> usersDao =  userRepository.getAllUsers();
         return UserDto.from(usersDao);
    }

    public List<UserDto> getAllUsersWithOrders() {
        List<UserDto> usersDto =  UserDto.from(userRepository.getAllUsers());
        for(UserDto userDto: usersDto){
            userDto.setOrders(orderInterface.getOrdersByUserId(userDto.getUserId()).getBody());
        }
        return usersDto;
    }
}
