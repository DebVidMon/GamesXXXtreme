package com.gxxx.GamesXXXtreme.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gxxx.GamesXXXtreme.model.Categoria;

@Repository
public interface CaregoriaRepository extends JpaRepository<Categoria,Long>{
	public List<Categoria> findAllByNomeContainingIgnoreCase (String nome);
}
