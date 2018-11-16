package com.example.media.repository;

import java.util.List;
import java.util.Optional;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.example.media.domain.User;
@Component
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    
    User findByUsernameOrEmail(String username, String email);

    List<User> findAll();
    
 	 @Query(nativeQuery = true, value = "SELECT a.*,b.* FROM orders a RIGHT  JOIN  user b  ON a.uid= b.id where b.id =:id")
 	 List<User> findUserAndOrdersByHQL(@Param("id") Long id);
    
    /*Optional<User> findById(Long id );
    public T findById1(Long id ) {
    	
    }*/
	/*Optional<User> findById = userRepository.findById(Long.parseLong("1"));
	System.out.println(findById);*/
}