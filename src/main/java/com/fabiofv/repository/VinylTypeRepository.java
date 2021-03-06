package com.fabiofv.repository;

import com.fabiofv.model.VinylType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by fabioferreras on 9/9/17.
 */
@Repository
public interface VinylTypeRepository extends JpaRepository<VinylType, Long>
{

}
