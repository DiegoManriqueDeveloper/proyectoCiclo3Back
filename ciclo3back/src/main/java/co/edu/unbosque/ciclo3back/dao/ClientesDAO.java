package co.edu.unbosque.ciclo3back.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.unbosque.ciclo3back.model.Clientes;


public interface ClientesDAO extends JpaRepository<Clientes, Integer>
{
	
}