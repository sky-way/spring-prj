package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by aizbavitelev on 1/6/18.
 */
@Repository
public interface VisitsRepository extends CrudRepository<Visit, Long>{

}
