package io.henry.dev.portfolio.users.management;

import io.henry.dev.portfolio.projects.ProjectDTO;
import io.henry.dev.portfolio.projects.ProjectInternalAPI;
import io.henry.dev.portfolio.users.UserDTO;
import io.henry.dev.portfolio.users.UserExternalAPI;
import io.henry.dev.portfolio.users.mapper.UserMapper;
import io.henry.dev.portfolio.users.model.UserEntity;
import io.henry.dev.portfolio.users.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserManagement implements UserExternalAPI {

    private final UserRepository repository;
    private final ProjectInternalAPI projectInternalAPI;
    private final UserMapper mapper;

    @Transactional
    @Override
    public UserDTO addUser(UserDTO userDTO) {
        UserEntity entity = this.mapper.toUserEntity(userDTO);
        return this.mapper.toUserDTO(this.repository.save(entity));
    }

    @Override
    public UserDTO getUserById(Long userId) {
        Set<ProjectDTO> projects = this.projectInternalAPI.getProjectsByUserId(userId);
        UserDTO userDTO = this.mapper.toUserDTO(this.repository.findById(userId).orElseThrow());
        return new UserDTO(
                userDTO.id(),
                userDTO.firstname(),
                userDTO.middleName(),
                userDTO.lastname(),
                userDTO.email(),
                userDTO.birthdate(),
                projects
        );
    }
}
