package edu.wary.despacho.service;
import java.util.List;

import javax.management.RuntimeErrorException;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


import edu.wary.model.Almacen;
import edu.wary.model.Destinatario;
import edu.wary.model.Encomienda;
import edu.wary.model.Cliente;
import edu.wary.model.Incidencia;
import edu.wary.model.Pago;
import edu.wary.model.Remitente;
import edu.wary.model.repository.AlmacenRepository;
import edu.wary.model.repository.DestinatarioRepository;
import edu.wary.model.repository.EncomiendaRepository;

import edu.wary.model.repository.ClienteRepository;
import edu.wary.model.repository.IncidenciaRepository;
import edu.wary.model.repository.PagoRepository;
import edu.wary.model.repository.RemitenteRepository;
import edu.wary.util.Utilitario;

@SuppressWarnings("unused")
public class EncomiendaService {

	private EncomiendaRepository encomiendaRepository;
	private EntityManager em;
	public  EncomiendaService() {
		
		em=Utilitario.getInstance().getEntityManager();
		
	}
	public Encomienda buscarEncomienda(Encomienda e)throws RuntimeException{
		EncomiendaRepository encomiendaRepository=new EncomiendaRepository(em);
		Encomienda encomiendabd=encomiendaRepository.findById(e.getIdEnco());
		if (encomiendabd.getIdEnco()!=e.getIdEnco()) {
			throw new RuntimeException("Cliente no encontrado");
		}
		return encomiendabd;
	}
}
