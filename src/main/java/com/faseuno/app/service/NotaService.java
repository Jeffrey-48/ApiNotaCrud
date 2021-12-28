package com.faseuno.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faseuno.app.interfaceService.INotaService;
import com.faseuno.app.interfaces.INota;
import com.faseuno.app.modelo.Nota;

@Service
public class NotaService implements INotaService{
	
	@Autowired
	private INota data;
	
	@Override
	public List<Nota> listarNotas() {
		return (List<Nota>) data.findAll();
	}

	@Override
	public Nota save(Nota nota) {
		return data.save(nota);
	}

	@Override
	public void editarNota(Nota nota) {
		data.save(nota);		
	}

	@Override
	public Nota eliminarNota(Integer id) {
		Nota nota = data.findById(id).get();
		if (nota!=null) {
			data.delete(nota);
		}
		return nota;
	}

	@Override
	public Nota buscarPorId(Integer id) {
		Nota nota = data.findById(id).get();
		if (nota!=null) {
			data.delete(nota);
		}
		return nota;
	}

}
