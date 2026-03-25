package io.henry.dev.portfolio.users;

public interface UserExternalAPI {

    UserDTO addUser(UserDTO userDTO);
    UserDTO getUserById(Long userId);
}
