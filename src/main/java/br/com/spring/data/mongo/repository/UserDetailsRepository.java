/**
 * 
 */
package br.com.spring.data.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.data.model.User;

/**
 * @author cad_rfirmino
 *
 */
@Repository
public interface UserDetailsRepository extends MongoRepository<User, Long> {
	
	@Override
	public User save(User user);
}
