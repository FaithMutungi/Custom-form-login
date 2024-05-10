package com.Precious.MvcEndToEndApplication.event;

import com.Precious.MvcEndToEndApplication.user.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * @author Sampson Alfred
 */

@Getter
@Setter
public class RegistrationCompleteEvent extends ApplicationEvent {
    private  User user;
    private String confirmationUrl;
    public RegistrationCompleteEvent(User user, String confirmationUrl) {
        super(user);
        this.user = user;
        this.confirmationUrl = confirmationUrl;
    }
}
