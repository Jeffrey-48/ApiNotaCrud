package com.faseuno.app.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faseuno.app.modelo.Nota;

@Repository
public interface INota extends CrudRepository<Nota, Integer>{

}
