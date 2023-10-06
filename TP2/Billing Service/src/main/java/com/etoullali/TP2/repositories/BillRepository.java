package com.etoullali.TP2.repositories;

import com.etoullali.TP2.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RepositoryRestResource
public interface BillRepository extends JpaRepository<Bill,Long> {
    /*=> ça marche pas
    @RestResource(path = "/getByCustomerId")
    List<Bill> getByCustomerId(@Param("customerId") Long customerId);
     */
    List<Bill> findByCustomerId(Long customerId);
}
