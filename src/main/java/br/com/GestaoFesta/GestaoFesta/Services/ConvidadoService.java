package br.com.GestaoFesta.GestaoFesta.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.GestaoFesta.GestaoFesta.Repositoryes.ConvidadoRepository;
import br.com.GestaoFesta.GestaoFesta.entities.Convidado;

@org.springframework.stereotype.Service
public class ConvidadoService {

	@Autowired
	private ConvidadoRepository repository;

	public List<Convidado> listar() {
		return repository.findAll();
	}
	
	

}
