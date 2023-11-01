package com.massawe.repository;

import com.massawe.dto.CategoryDto;
import com.massawe.models.Category;
import com.massawe.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
   //List<Category> findAllByActivated();


    /*Customer*/
    @Query("select new com.massawe.dto.CategoryDto(c.id, c.name, count(p.category.id)) from Category c inner join Product p on p.category.id = c.id " +
            " group by c.id")
    List<CategoryDto> getCategoryAndProduct();
}
