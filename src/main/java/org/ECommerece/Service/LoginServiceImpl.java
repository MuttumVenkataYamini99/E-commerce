package org.ECommerece.Service;

import org.ECommerece.DAO.LoginDAO;
import org.ECommerece.Dto.LoginRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDAO loginDAO;


    @Override
    public ResponseEntity<?> login(LoginRequestDTO loginRequest) {
        return null;
    }
}
