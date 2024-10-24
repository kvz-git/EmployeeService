package ru.ase.employeeservice.models.references;

import jakarta.persistence.*;

@Entity(name= "State")
@Table(name= "state", schema="ref")
public class State {
    @Id
    @GeneratedValue
    private long id;                // Уникальный идентификатор
    private String code;            // Наименование кода состояния
    private String name;            // Наименование состояния
}
