package com.Precious.MvcEndToEndApplication.registration;

import com.Precious.MvcEndToEndApplication.user.Role;
import lombok.Data;

import java.util.List;

/**
 * @author Sampson Alfred
 */
@Data
public class RegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private List<Role> roles;
}
