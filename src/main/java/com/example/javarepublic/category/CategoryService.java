package com.example.javarepublic.category;

import com.example.javarepublic.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;
    public List<Category> getList() {
        return this.categoryRepository.findAll();
    }

    public Category getCategory(String categoryName) {
        Optional<Category> category = this.categoryRepository.findByName(categoryName);
        if(category.isPresent()){
            return category.get();
        }else{
            throw new DataNotFoundException("category Not Found");
        }
    }
}
