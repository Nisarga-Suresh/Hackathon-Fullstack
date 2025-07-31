package com.dsce.portal.repository;

import com.dsce.portal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    Optional<User> findByEmail(String email);
    
    Optional<User> findByEmailAndActive(String email, Boolean active);
    
    List<User> findByUserType(User.UserType userType);
    
    List<User> findByUserTypeAndActive(User.UserType userType, Boolean active);
    
    List<User> findByDepartment(String department);
    
    List<User> findByDepartmentAndUserType(String department, User.UserType userType);
    
    boolean existsByEmail(String email);
    
    boolean existsByUsn(String usn);
    
    Optional<User> findByUsn(String usn);
    
    Optional<User> findByEmailAndUserType(String email, User.UserType userType);
    
    long countByUserType(User.UserType userType);
}