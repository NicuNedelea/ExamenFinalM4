package ro.tefacprogramator.m4.greeting.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.tefacprogramator.m4.greeting.entity.Greeting;
import ro.tefacprogramator.m4.greeting.repository.GreetingRepository;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository repo;

    public boolean verifyForEmptyFields(Greeting g1){
        if (g1.getDescription().equals("") || g1.getPrice() == 0 || g1.getTypeID() == 0 || g1.getCategoryID() == 0){
            return false;
        }
        return true;
    }

    public Object getAll(){
        List<Greeting> greetings = repo.getAll();
        if (greetings == null){
            return Collections.singletonMap("There are no greetings in the database.", true);
        }
        return greetings;
    }
}
