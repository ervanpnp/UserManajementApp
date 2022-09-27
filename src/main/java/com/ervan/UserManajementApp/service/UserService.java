/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ervan.UserManajementApp.service;

import com.ervan.UserManajementApp.dto.User;
import java.util.List;

/**
 *
 * @author FX506PE
 */
public interface UserService {

    List<User> getAllUsers();

    public User getUser(String id);

    public void addUser(User user);

    public User updateUser(User user);

    public User deleteUser(String id);
    
}
