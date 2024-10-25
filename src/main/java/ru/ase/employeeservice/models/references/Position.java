package ru.ase.employeeservice.models.references;

import jakarta.persistence.*;

@Entity(name= "Position")
@Table(name= "position", schema="ref")
public class Position {
    @Id
    @GeneratedValue
    private long id;                // Уникальный идентификатор
    private String code;            // Наименование кода должности
    private String name;            // Наименование должности
}
