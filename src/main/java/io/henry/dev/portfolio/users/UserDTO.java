package io.henry.dev.portfolio.users;

import io.henry.dev.portfolio.projects.ProjectDTO;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public record UserDTO(Long id,
                      String firstname,
                      String middleName,
                      String lastname,
                      String email,
                      LocalDate birthdate,
                      Set<ProjectDTO> projects
) {
    public UserDTO(Long id,
                   String firstname,
                   String middleName,
                   String lastname,
                   String email,
                   LocalDate birthdate) {
        this(id, firstname, middleName, lastname, email, birthdate, new HashSet<>());
    }
}
