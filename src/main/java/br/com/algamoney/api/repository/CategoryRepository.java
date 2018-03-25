package br.com.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.algamoney.api.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
