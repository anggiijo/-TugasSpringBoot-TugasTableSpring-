/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas.tugas2.repositories;

import com.tugas.tugas2.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sendy.dr
 */

    
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
