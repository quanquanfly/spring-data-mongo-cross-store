/**
 * 
 */
package br.com.spring.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.data.model.User;

/**
 * @author cad_rfirmino
 *
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long>{
}
