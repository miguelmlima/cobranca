package com.condominio.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.condominio.cobranca.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long>{

}
