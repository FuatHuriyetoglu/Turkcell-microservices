package com.turkcell.productservice.services;

import com.turkcell.productservice.dto.requests.CreateProductRequest;
import com.turkcell.productservice.dto.responses.CreatedProductResponse;

public interface ProductService {
    CreatedProductResponse add(CreateProductRequest request);
    Boolean getByInventoryCode(String code, int requiredStock);

    Integer getByStock(String code);
}

