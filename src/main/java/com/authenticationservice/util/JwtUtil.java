package com.authenticationservice.util;

import com.authenticationservice.constants.JwtConstants;
import com.authenticationservice.model.CustomUserDetails;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil {
  @Value("${jwt.secret}")
  private String SECRET;
  public String extractUsername(String token){
    return extractAllClaims(token).getSubject();
  }
  public String extractUserId(String token){
    return extractAllClaims(token).get(JwtConstants.USER_ID,String.class);
  }

  public Date extractExpiration(String token){
    return extractAllClaims(token).getExpiration();
  }

  private Claims extractAllClaims(String token) {
    return Jwts.parser().setSigningKey(SECRET)
        .parseClaimsJws(token)
        .getBody();
  }

  public String generateJwtToken(CustomUserDetails userDetails){
    return Jwts.builder()
        .setSubject(userDetails.getUsername())
        .setIssuedAt(new Date(System.currentTimeMillis()))
        .setExpiration(new Date(System.currentTimeMillis()+ JwtConstants.EXPIRY_TIME))
        .claim(JwtConstants.USER_ID,userDetails.getId())
        .signWith(SignatureAlgorithm.HS512,SECRET)
        .compact();
  }
  public Boolean validateJwtToken(String token,CustomUserDetails userDetails){
    final String username = extractUsername(token);
    final Boolean isTokenExpired = extractExpiration(token).before(new Date());
    return (username.equals(userDetails.getUsername()) && !isTokenExpired);
  }
}
