package fvs.edu.br.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fvs.edu.br.domain.Fruta;
import fvs.edu.br.repository.FrutaRepository;

@Service
public class FrutaService {

	@Autowired
	private FrutaRepository repository;
	
	public Fruta buscar(Integer id) {
		Optional<Fruta> obj = repository.findById(id);
		return obj.orElse(null);
	}
}
