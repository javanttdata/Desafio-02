package trilha.back.financys.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.DTO.CategoryDTO;
import trilha.back.financys.entities.Category;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoryController {
    private List<Category> list = new ArrayList<Category>();


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoryDTO create(@RequestBody Category category) {
        list.add(category);
        return new CategoryDTO(list.indexOf(category));
    }

    @GetMapping
    public List<Category> read (Category category){
        return list;
    }

}
