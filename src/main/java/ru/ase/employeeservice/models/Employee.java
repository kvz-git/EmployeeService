package ru.ase.employeeservice.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity(name= "Employee")
@Table(name= "employee", schema="dom", indexes = {
        @Index(name = "iEmployeePosition", columnList = "positionId"),
        @Index(name = "iEmployeeUnitPosition", columnList = "unitId, positionId")
})
public class Employee {
    @Id
    @GeneratedValue
    private long id;                // Уникальный идентификатор
    private long employeeCode;      // Код штатной единицы
    private long unitId;            // Id подразделения
    private long positionId;        // Id должности
    private long personId;          // Id персоны
    private Date hireDate;          // Дата занятия должности
}
