package org.example.boardback.service.user;

import org.example.boardback.dto.ResponseDto;
import org.example.boardback.dto.user.request.UserProfileUpdateRequest;
import org.example.boardback.dto.user.response.MeResponseDto;
import org.example.boardback.dto.user.response.UserResponseDto;

public interface UserService {
    ResponseDto<MeResponseDto> getMe(Long userId);
<<<<<<< HEAD
    ResponseDto<UserResponseDto> getUserById(Long userId);
    ResponseDto<UserResponseDto> updateProfile(Long userId, UserProfileUpdateRequest request);
}
=======

    ResponseDto<UserResponseDto> getUserById(Long userId);

    ResponseDto<UserResponseDto> updateProfile(Long userId, UserProfileUpdateRequest request);
}
>>>>>>> a013a0241d4baf24e9419fc9fc515a716664b11f
