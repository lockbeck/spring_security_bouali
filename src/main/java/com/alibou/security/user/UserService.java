package com.alibou.security.user;

import com.alibou.security.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserDTO createUser(UserDTO dto) {
        User user = User.builder()
                .firstname(dto.getFirstname())
                .lastname(dto.getLastname())
                .email(dto.getEmail())
                .password(passwordEncoder.encode(dto.getPassword()))
                .role(dto.getRole())
                .build();
        var save = userRepository.save(user);
        UserDTO userDTO = UserDTO.builder()
                .firstname(save.getFirstname())
                .lastname(save.getLastname())
                .email(save.getEmail())
                .password(save.getPassword())
                .role(save.getRole())
                .build();
        return userDTO;
    }
}
