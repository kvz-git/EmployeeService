package ru.ase.employeeservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.ase.employeeservice.models.DTO.User;

public interface UserRepository extends JpaRepository<User, Integer> {
//    @Query("select e.id,  from ")
//    User findByEmail(String email);
}
