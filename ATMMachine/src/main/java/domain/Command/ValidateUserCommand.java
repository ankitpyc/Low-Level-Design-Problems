package domain.Command;

import domain.User;

public class ValidateUserCommand implements Command {

    User user;

    ValidationService service;

    public ValidateUserCommand() {
        this.service = new ValidationService();
    }


    @Override
    public void execute(User user) {
        boolean isValidated = service.validateUser(user);
        user.setIsAuthenticate(isValidated);
    }
}
