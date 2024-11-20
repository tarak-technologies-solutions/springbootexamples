package com.taraktech.springbootapp21.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taraktech.springbootapp21.modal.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
