package ru.ase.employeeservice.models.references;

import jakarta.persistence.*;

@Entity(name= "Level")
@Table(name= "level", schema="ref")
public class Level {
    @Id
    @GeneratedValue
    private long id;                // Уникальный идентификатор
    private String code;            // Наименование кода уровня
    private String name;            // Наименование уровня
}
