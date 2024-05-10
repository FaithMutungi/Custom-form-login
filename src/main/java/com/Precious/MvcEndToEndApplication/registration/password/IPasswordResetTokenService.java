package com.Precious.MvcEndToEndApplication.registration.password;

import com.Precious.MvcEndToEndApplication.user.User;

import java.util.Optional;

/**
 * @author Sampson Alfred
 */

public interface IPasswordResetTokenService {
    String validatePasswordResetToken(String theToken);

    Optional<User> findUserByPasswordResetToken(String theToken);

    void resetPassword(User theUser, String password);

    void createPasswordResetTokenForUser(User user, String passwordResetToken);
}
