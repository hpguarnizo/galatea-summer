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
public class AdmEncomiendaService {
	private DestinatarioRepository destinatarioRepository;
	private EncomiendaRepository encomiendaRepository;	
	private RemitenteRepository remiRepository;
	private PagoRepository pagoRepository;
	private EntityManager em;
	
	public AdmEncomiendaService(){
		em=Utilitario.getInstance().getEntityManager();
		encomiendaRepository=new EncomiendaRepository(em);
		
	}
	public void registrarEncomienda(Destinatario d, Encomienda e,Pago p) throws RuntimeException{
			EntityTransaction tx=em.getTransaction();
			try {
				tx.begin();
				destinatarioRepository.insert(d);
				encomiendaRepository.insert(e);
				pagoRepository.insert(p);
				tx.commit();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
				tx.rollback();
				throw new RuntimeException("No se pudo registrar encomienda");
			}

	}

	
}
