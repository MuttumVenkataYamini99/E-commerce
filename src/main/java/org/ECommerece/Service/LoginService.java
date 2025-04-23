package org.ECommerece.Service;

import org.ECommerece.Dto.LoginRequestDTO;
import org.springframework.http.ResponseEntity;

public interface LoginService {
    ResponseEntity<?> login(LoginRequestDTO loginRequest);
}
