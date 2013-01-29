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
public class DespachoService {
	private DestinatarioRepository destinatarioRepository;
	private EncomiendaRepository encomiendaRepository;
	private PagoRepository pagoRepository;
	private RemitenteRepository remiRepository;
	private AlmacenRepository almacenRepository;
	private IncidenciaRepository incidenciaRepository;
	
	private EntityManager em;
	
	
	
	public DespachoService() {
		em=Utilitario.getInstance().getEntityManager();
		destinatarioRepository=new DestinatarioRepository(em);
		encomiendaRepository=new EncomiendaRepository(em);
		pagoRepository=new PagoRepository(em);
		remiRepository=new RemitenteRepository(em);
		almacenRepository=new AlmacenRepository(em);
		incidenciaRepository= new IncidenciaRepository(em);
	}

	public void registrarEncomienda(Destinatario d, Encomienda e,
									Pago p) throws RuntimeException{
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
	
	public Almacen registrarIngreso(Almacen a) throws RuntimeException{
		EntityTransaction tx=em.getTransaction();
		try {
			tx.begin();
			almacenRepository.insert(a);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			tx.rollback();
			throw new RuntimeException("no se pudo registrar ingreso");
		}
		return a;
	}
	
	public void registrarRemitente(Remitente r) throws RuntimeException{
		EntityTransaction tx=em.getTransaction();
		try {
			tx.begin();
			remiRepository.insert(r);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			tx.rollback();
			throw new RuntimeException("No se pudo registrar remitente");
		}
	}
	
	
	//--------------INCIDENCIA----------------------------
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
			
	public Remitente buscarRemitente(Remitente r) throws RuntimeException{
		RemitenteRepository remitenteRepository=new RemitenteRepository(em);
		Remitente remitentebd=remitenteRepository.findById(r.getIdRemi());
		if (remitentebd.getIdRemi()!=r.getIdRemi()) {
			throw new RuntimeException("remitente no encontrado");
		}
		return remitentebd;
	}
	
	public void actualizarEstado(Encomienda e) throws RuntimeException{
		EntityTransaction tx=em.getTransaction();
		try {
			tx.begin();
			Encomienda encomiendaupd=encomiendaRepository.findById(e.getIdEnco());
			encomiendaupd.setEstado(e.getEstado());
			encomiendaRepository.update(encomiendaupd);
			tx.commit();
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
			tx.rollback();
			throw new RuntimeException("Error al actualizar");
		}
	}
	
	public Encomienda buscarEncomienda(Encomienda e)throws RuntimeException{
		EncomiendaRepository encomiendaRepository=new EncomiendaRepository(em);
		Encomienda encomiendabd=encomiendaRepository.findById(e.getIdEnco());
		if (encomiendabd.getIdEnco()!=e.getIdEnco()) {
			throw new RuntimeException("Encomienda no encontrada");
		}
		return encomiendabd;
	}
	
	public Cliente buscarCliente(Cliente e)throws RuntimeException{
		ClienteRepository clienteRepository=new ClienteRepository(em);
		Cliente clientebd=clienteRepository.findById(e.getIdCod());
		if (clientebd.getIdCod()!=e.getIdCod()) {
			throw new RuntimeException("Cliente no encontrado");
		}
		return clientebd;
	}
	
	public Destinatario buscarDestinatario(Destinatario e)throws RuntimeException{
		DestinatarioRepository destinatarioRepository=new DestinatarioRepository(em);
		Destinatario destinatariobd=destinatarioRepository.findById(e.getIdDest());
		if (destinatariobd.getIdDest()!=e.getIdDest()) {
			throw new RuntimeException("destinatario no encontrado");
		}
		return destinatariobd;
	}
	
	public Almacen buscarUbicacion(Almacen a) throws RuntimeException{
		AlmacenRepository almacenRepository=new AlmacenRepository(em);
		Almacen almacenbd=almacenRepository.findById(a.getIdEnco());
		if (almacenbd.getIdEnco()!=a.getIdEnco()) {
			throw new RuntimeException("Encomienda no encontrada");
		}
		return almacenbd;
	}
	
	public List<Encomienda> listarEncomienda(){
		return encomiendaRepository.listAll();
	}
	
	public List<Encomienda> listarDespachos(){
		return encomiendaRepository.listDesp();
	}
	
	public void eliminarEnco(Encomienda e){
		EntityTransaction tx=em.getTransaction();
		try {
			tx.begin();
			encomiendaRepository.delete(e);
			tx.commit();
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
			tx.rollback();
			throw new RuntimeException("no se pudo registrar la entrega");
		}
	}
	
}
