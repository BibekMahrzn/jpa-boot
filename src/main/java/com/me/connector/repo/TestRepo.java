package com.me.connector.repo;

import com.me.connector.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Just Me on 12/30/2017.
 */
public interface TestRepo extends JpaRepository<Test,Integer> {
}
