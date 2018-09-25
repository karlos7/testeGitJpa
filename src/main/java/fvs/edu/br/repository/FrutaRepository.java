package fvs.edu.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fvs.edu.br.domain.Fruta;

@Repository
public interface FrutaRepository extends JpaRepository<Fruta, Integer>{

}
