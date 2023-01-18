package com.ista.proyect.RegistroJE.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ista.proyect.RegistroJE.model.Usuario;
import com.ista.proyect.RegistroJE.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl extends GenericServiceImpl<Usuario, Integer> implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public CrudRepository<Usuario, Integer> getDao() {
        return userRepository;
    }
}
