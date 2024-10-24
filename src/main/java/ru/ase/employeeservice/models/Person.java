package ru.ase.employeeservice.models;

import jakarta.persistence.*;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Entity(name= "Person")
@Getter
@Setter
@Table(name= "person", schema="dom", indexes = {
        @Index(name = "iPersonId", columnList = "personId", unique = true),
        @Index(name = "iPersonLastname", columnList = "lastname"),
        @Index(name = "iPersonStackLevel", columnList = "stack, level"),
        @Index(name = "iPersonLevel", columnList = "level"),
        @Index(name = "iPersonState", columnList = "state")
})
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;                // Уникальный идентификатор
    private long personId;          // Табельный номер
    private String firstname;       // Имя сотрудника
    private String middlename;      // Отчество сотрудника
    @Column(nullable = false, length = 60)
    private String lastname;        // Фамилия сотрудника
    private long birthday;          // ДР в формате YYYYMMDD
    private String address;         // Домашний адрес сотрудника
    private String phoneNumber;     // Номер телефона сотрудника
    private short stack;            // Ссылка на справочник стеков
    private short level;            // Ссылка на справочник уровней
    private short state;            // Ссылка на справочник состояний (найм / работает / в процессе увольнения / уволен)
    private Date hireDate;          // Дата приема на работу
    private Date terminationDate;   // Дата приема на работу
    @Column(columnDefinition="TEXT")
    private String equipment;       // Выданное оборудование
}
