package ua.profitsoft.lecture.docker.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * @author Anton Leliuk
 */
@Table(name = "student")
@Entity
@Data
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue
    private Long id;

    private String surname;

    private String name;

    @Column(name = "birth_date")
    private LocalDate birthDate;
}
