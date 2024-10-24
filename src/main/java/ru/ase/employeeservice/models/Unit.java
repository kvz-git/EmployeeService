package ru.ase.employeeservice.models;

import jakarta.persistence.*;

@Entity(name= "Unit")
@Table(name= "unit", schema="dom", indexes = {
        @Index(name = "iUnitParentId", columnList = "parentId"),
        @Index(name = "iUnitName", columnList = "name")
})
public class Unit {
    @Id
    @GeneratedValue
    private long id;                // Уникальный идентификатор
    private long parentId;          // Уникальный идентификатор родительского подразделения
    private String code;            // Код подразделения
    private String name;            // Наименование подразделения
}
