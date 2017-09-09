package com.fabiofv.repository;

import com.fabiofv.model.RecordList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by fabioferreras on 9/9/17.
 */
@Repository
public interface RecordListRepository extends JpaRepository<RecordList, Long>
{

}
