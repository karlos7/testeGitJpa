package fvs.edu.br.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fvs.edu.br.domain.Fruta;
import fvs.edu.br.service.FrutaService;

@RestController
@RequestMapping(value="/fruta")
public class FrutaResource {

	@Autowired
	private FrutaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer id){
		Fruta fruta = service.buscar(id);
		return ResponseEntity.ok().body(fruta);
	}
}
