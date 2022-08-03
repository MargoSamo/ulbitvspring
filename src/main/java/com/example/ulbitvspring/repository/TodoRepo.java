package com.example.ulbitvspring.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.ulbitvspring.entity.TodoEntity;



public interface TodoRepo extends CrudRepository<TodoEntity, Long>  {
}
