package com.example.persongaldiary.mapper;

import com.example.persongaldiary.entity.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface IUser {
    Boolean userRegister(User user);
}
