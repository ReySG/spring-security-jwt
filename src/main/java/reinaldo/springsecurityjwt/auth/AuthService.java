package reinaldo.springsecurityjwt.auth;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import reinaldo.springsecurityjwt.jwt.JwtService;
import reinaldo.springsecurityjwt.user.Role;
import reinaldo.springsecurityjwt.user.User;
import reinaldo.springsecurityjwt.user.UserRepository;

@Service
@RequiredArgsConstructor
public class AuthService {

	private final UserRepository userRepository;
	private final JwtService jwtService;

	public AuthResponse login(LoginRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public AuthResponse register(RegisterRequest request) {
		User user =  User.builder()
	            .username(request.getUsername())
	            .password(request.getPassword())
	            .firstname(request.getFirstname())
	            .lastname(request.getLastname())
	            .country(request.getCountry())
	            .role(Role.USER)
	            .build();

		userRepository.save(user);
		return AuthResponse.builder()
				.token(jwtService.getToken(user))
				.build();
	}

}
