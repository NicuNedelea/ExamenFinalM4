package ro.tefacprogramator.m4.greeting.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ro.tefacprogramator.m4.greeting.entity.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting, Integer>{
    
    /*
    Nu vrea sa mearga !!!
    @Query(value = "SELECT g.GreetingID, g.Description, g.Price, t.TypeName, c.CategoryName FROM Greeting g INNER JOIN Type t INNER JOIN Category c WHERE g.TypeID = t.TypeID AND g.CategoryID = c.CategoryID ORDER BY g.GreetingID;", nativeQuery = true)
    public List<Greeting> getAll();*/

     @Query(value = "SELECT * FROM Greeting;", nativeQuery = true)
    public List<Greeting> getAll();
}
