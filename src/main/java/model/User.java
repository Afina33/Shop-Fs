package model;

import java.time.LocalDateTime;

public class User {
    private  Long id;
    private  String email;
    private  String password;
    private  String fullName;
    private Role role;
    private LocalDateTime localDateTime;

    public User() {

    }

    public User(String email, String password, String fullName, Role role, LocalDateTime localDateTime) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.role = role;
        this.localDateTime = localDateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
