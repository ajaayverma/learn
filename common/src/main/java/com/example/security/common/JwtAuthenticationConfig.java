package com.example.security.common;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;


@Getter
@ToString
public class JwtAuthenticationConfig {

    @Value("${com.security.jwt.url:/login}")
    private String url;

    @Value("${com.security.jwt.header:Authorization}")
    private String header;

    @Value("${com.security.jwt.prefix:Bearer}")
    private String prefix;

    @Value("${com.security.jwt.expiration:#{24*60*60}}")
    private int expiration; // default 24 hours

    @Value("${com.security.jwt.secret}")
    private String secret;
}
