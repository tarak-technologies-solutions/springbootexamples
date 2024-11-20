package com.taraktech.restapi.reporitory;

import com.taraktech.restapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    /*@Query
    public List<User> findUsersByLast_name(String last_name);
    @Query
    public void deleteUsersByLast_name(String last_name);*/
}
