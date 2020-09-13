package com.example.sweater.repos;

import com.example.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MessageRepo  extends CrudRepository<Message, Integer> {
   List<Message> findByEmail(String tag);
}