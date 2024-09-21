package com.company.solid.singleresp;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.databind.ObjectMapper;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {
	//Store used by controller
    private UserPersistenceService service = new UserPersistenceService();
    private UserValidator validUser = new UserValidator();

    //Create a new user
    public String createUser(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        
        User user = mapper.readValue(userJson, User.class);

        if(!validUser.validateUser(user)) {
            return "ERROR";
        }

        service.persistenceUser(user);
        
        return "SUCCESS";
    }
}