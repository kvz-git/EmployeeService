package ru.ase.employeeservice.repositories;

import org.springframework.data.jpa.repository.Query;
import ru.ase.employeeservice.models.DTO.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select e.id, p.lastname + dom.person.firstname + dom.person.lastname, pos.name, u.name from Employee e left join Person p on e.personId=e.id left join Unit u on e.unitId=u.id left join Position pos on e.positionId=e.id")
    default List<User> joinUsers() {
        return null;
    }
}
