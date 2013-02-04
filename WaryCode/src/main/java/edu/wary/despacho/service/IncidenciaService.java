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
public class IncidenciaService {
private IncidenciaRepository incidenciaRepository;
	
	private EntityManager em;
	
	public IncidenciaService() {
		em=Utilitario.getInstance().getEntityManager();
		incidenciaRepository= new IncidenciaRepository(em);
		
		
	}
	public void registrarIncidencia(Incidencia i) throws RuntimeException{
		EntityTransaction tx=em.getTransaction();
		try {
		tx.begin();
		incidenciaRepository.insert(i);
		tx.commit();
		} catch (Exception e2) {
		// TODO: handle exception
		e2.printStackTrace();
		tx.rollback();
		throw new RuntimeException("No se pudo registrar encomienda");
		}
	}	
	public List<Incidencia> listarIncidencia(){
		return incidenciaRepository.listAll();
	}
	
	
		public void eliminarInc(Incidencia e){
			EntityTransaction tx=em.getTransaction();
			try {
				tx.begin();
				incidenciaRepository.delete(e);
				tx.commit();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
				tx.rollback();
				throw new RuntimeException("no se pudo registrar la entrega");
			}
		
		}
	
}
