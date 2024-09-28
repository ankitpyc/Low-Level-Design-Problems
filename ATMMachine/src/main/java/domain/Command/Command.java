package domain.Command;

import domain.User;

public interface Command {

    void execute(User user);

}
