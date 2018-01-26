package com.sd.dao;

import com.sd.Entity.RegisterEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;

@Transactional
public interface UserDAO extends PagingAndSortingRepository<RegisterEntity, Integer> {

}
