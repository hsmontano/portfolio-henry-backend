package io.henry.dev.portfolio.gateway;

import io.henry.dev.portfolio.projects.ProjectDTO;
import io.henry.dev.portfolio.projects.ProjectExternalAPI;
import io.henry.dev.portfolio.users.UserDTO;
import io.henry.dev.portfolio.users.UserExternalAPI;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class GatewayManagement {

    private final ProjectExternalAPI projectExternalAPI;
    private final UserExternalAPI userExternalAPI;

    @PostMapping("/projects")
    private ProjectDTO addProject(@RequestBody ProjectDTO projectDTO) {
        return projectExternalAPI.addProject(projectDTO);
    }

    @PostMapping("/users")
    private UserDTO addUser(@RequestBody UserDTO userDTO) {
        return userExternalAPI.addUser(userDTO);
    }

    @GetMapping("/users/{userId}")
    private UserDTO getUserById(@PathVariable("userId") Long userId) {
        return userExternalAPI.getUserById(userId);
    }
}
