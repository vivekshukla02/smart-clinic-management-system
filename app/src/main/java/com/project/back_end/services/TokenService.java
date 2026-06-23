package com.project.back_end.services;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;

@Service
public class TokenService {

    private final String SECRET_KEY =
            "SmartClinicSecretKeySmartClinicSecretKey123";

    public String generateToken(String email) {

        return Jwts.builder()
                .setSubject(email)
                .signWith(getSigningKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    private Key getSigningKey() {

        return Keys.hmacShaKeyFor(
                SECRET_KEY.getBytes()
        );
    }
}
