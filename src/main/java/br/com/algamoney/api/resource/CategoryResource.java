package br.com.algamoney.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.algamoney.api.entity.Category;
import br.com.algamoney.api.repository.CategoryRepository;

@RestController
@RequestMapping(path = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryRepository categoryRepository;

	@GetMapping
	public List<Category> list() {
		return categoryRepository.findAll();
	}

}
