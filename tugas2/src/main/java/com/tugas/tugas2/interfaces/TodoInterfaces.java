/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas.tugas2.interfaces;

import com.tugas.tugas2.models.Todo;
import java.util.List;

/**
 *
 * @author Sendy.dr
 */
public interface TodoInterfaces {
    
public interface TodoInterface {
    List<Todo> getAll();
    void store(Todo todo);
    Todo getById(long id);
    void delete(long id);
}
}
