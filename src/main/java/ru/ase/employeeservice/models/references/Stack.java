package ru.ase.employeeservice.models.references;

import jakarta.persistence.*;

@Entity(name= "Stack")
@Table(name= "stack", schema="ref")
public class Stack {
    @Id
    @GeneratedValue
    private long id;                // Уникальный идентификатор
    private String code;            // Наименование кода стека
    private String name;            // Наименование стека
}
