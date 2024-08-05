package com.tesla59.dismanisinnoconditiontofuckasheep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tesla59.dismanisinnoconditiontofuckasheep.model.ProductModel;

@Repository
public interface ProductRepo extends JpaRepository<ProductModel, Integer> {

}
