package com.authenticationservice.util;

import com.authenticationservice.constants.TimeConstants;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil {
  @Value("${jwt.secret}")
  private String SECRET;
  public String generateJwtToken(UserDetails userDetails){
    final Map<String,Object>claims=new HashMap<>();
    return Jwts.builder().setClaims(claims)
        .setSubject(userDetails.getUsername())
        .setIssuedAt(new Date(System.currentTimeMillis()))
        .setExpiration(new Date(System.currentTimeMillis()+ TimeConstants.EXPIRY_TIME))
        .signWith(SignatureAlgorithm.HS512,SECRET)
        .compact();
  }
  public Boolean validateJwtToken(String token,UserDetails userDetails){
    final String username = getUsernameFromToken(token);
    final Claims claims = Jwts.parser()
        .setSigningKey(SECRET)
        .parseClaimsJws(token)
        .getBody();
    final Boolean isTokenExpired = claims.getExpiration().before(new Date());
    return (username.equals(userDetails.getUsername()) && !isTokenExpired);
  }
  public String getUsernameFromToken(String token) {
    final Claims claims = Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody();
    return claims.getSubject();
  }
}
