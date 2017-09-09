package com.fabiofv.repository;

import com.fabiofv.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by fabioferreras on 9/9/17.
 */
@Repository
public interface RecordRepository extends JpaRepository<Record,Long>
{

}
