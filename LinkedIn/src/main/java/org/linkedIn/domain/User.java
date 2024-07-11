package org.linkedIn.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends Account {
    private Messages messages;
    private List<User> connections;
}
