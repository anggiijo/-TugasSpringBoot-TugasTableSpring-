/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas.tugas2.services;

import com.tugas.tugas2.interfaces.TodoInterfaces.TodoInterface;
import com.tugas.tugas2.models.Todo;
import com.tugas.tugas2.repositories.TodoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sendy.dr
 */
@Service
public class TodoServices implements TodoInterface {

    @Autowired
    private TodoRepository todoRepository;
    
    public List<Todo> getAll() {
        return todoRepository.findAll();
    }

    public void store(Todo todo) {
        this.todoRepository.save(todo);
    }

    public Todo getById(long id) {
      Optional < Todo > optional = todoRepository.findById(id);

      if (!optional.isPresent()) {
        throw new RuntimeException(" Todo not found for id :: " + id);
      }

      Todo todo = optional.get();
      return todo;
    }

    public void delete(long id) {
      this.todoRepository.deleteById(id);
    }
}
