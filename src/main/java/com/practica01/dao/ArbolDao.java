/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.dao;

import com.practica01.domain.Arbol;

 
import org.springframework.data.jpa.repository.JpaRepository;



public interface ArbolDao extends JpaRepository <Arbol,Long> {
  
}
