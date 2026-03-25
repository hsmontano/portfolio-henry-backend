package io.henry.dev.portfolio.users.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    @Column(name = "middle_name")
    private String middleName;
    private String lastname;
    private String email;
    private LocalDate birthdate;
}
