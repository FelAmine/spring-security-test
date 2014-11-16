package dz.sonelgaz.repositories;

import dz.sonelgaz.models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by apple eaten on 16/11/2014.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>{
    List<Customer> findByLastName(String lastName);
}
