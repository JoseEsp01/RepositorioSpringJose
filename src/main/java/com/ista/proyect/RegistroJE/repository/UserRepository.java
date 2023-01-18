package com.ista.proyect.RegistroJE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ista.proyect.RegistroJE.model.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Integer> {
}
