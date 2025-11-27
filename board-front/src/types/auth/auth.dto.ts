// =======================================
// Auth DTO - Backend 기준 자동 변환
// =======================================

// 로그인 요청
export interface LoginRequest {
  username: string;
  password: string;
}

// 로그인 응답
export interface LoginResponse {
  accessToken: string;
  accessTokenExpiresInMillis: number;
}

<<<<<<< HEAD
type Gender = "M" | "F" | "N";

=======
>>>>>>> a013a0241d4baf24e9419fc9fc515a716664b11f
// 회원가입 요청
export interface SignupRequest {
  username: string;
  password: string;
  confirmPassword: string;
  nickname: string;
  email: string; 
<<<<<<< HEAD
  gender: Gender;
  provider: string;
  // gender 등 추가 가능
}

=======
  // gender 등 추가 가능
}


>>>>>>> a013a0241d4baf24e9419fc9fc515a716664b11f
export interface PasswordResetRequestDto {
  token: string;
  newPassword: string;
  confirmPassword: string;
}