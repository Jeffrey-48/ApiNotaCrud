package com.faseuno.app.interfaceService;

import java.util.List;

import com.faseuno.app.modelo.Nota;

public interface INotaService {
	
	public List<Nota> listarNotas();
	public Nota save(Nota nota);
	public void editarNota(Nota nota);
	public Nota eliminarNota(Integer id);
	public Nota buscarPorId(Integer id);
}
