package com.binyomincode.quarters;

import com.binyomincode.quarters.QuarterEvent;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by seanc on 03/09/17.
 */
public interface QuarterEventRepository extends CrudRepository<QuarterEvent, Long> {
    @Override
    List<QuarterEvent> findAll();
}
