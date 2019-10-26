package com.dto.springbootmapstruct.service.mapper;

import com.dto.springbootmapstruct.model.Product;
import com.dto.springbootmapstruct.service.dto.ProductDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    ProductDTO toProductDTO(Product product);
    List<ProductDTO> toProductDTOs(List<Product> products);
    Product toProduct(ProductDTO productDTO);
}
