package com.faseuno.app.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faseuno.app.interfaceService.INotaService;
import com.faseuno.app.modelo.Nota;

@RestController
@RequestMapping("/nota")
public class Controlador {

	@Autowired
	private INotaService serviceNota;

	// Crear nota
	@PostMapping("/crearNota")
	public Nota agregarNota(@RequestBody Nota nota) {
		return serviceNota.save(nota);
	}

	// Listar notas
	@GetMapping("/listarNota")
	public List<Nota> listarNotas() {
		return serviceNota.listarNotas();
	}
	
	@GetMapping("/lista")
	public Optional<Nota> listarNota() {
		return Optional.of(serviceNota.listarNotas().get(0));
	}

	// Editar valor de nota
	@PutMapping(path = { "/editarNota/{nota}/{id}" })
	public void editarNota(@PathVariable("nota") Double valor, @PathVariable("id") Integer id) {
		Nota nota = serviceNota.buscarPorId(id);
		nota.setValor(valor);
		serviceNota.editarNota(nota);
	}

	// Eliminar nota
	@DeleteMapping(path = { "/eliminarNota/{id}" })
	public Nota eliminarNota(@PathVariable("id") Integer id) {
		return serviceNota.eliminarNota(id);
	}
}
