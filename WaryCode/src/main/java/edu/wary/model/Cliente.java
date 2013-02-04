package edu.wary.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="t_cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int nrodoc;
	private String nombre;
	private String apellido;
	private String sexo;
	private String codigocliente;
	private String tipo;
	private String direccion;
	private String telefono_fijo;
	private String telefono_celular;
	private String fecha_nacimiento;
	private String email;
	private String provincia;
	private String distrito;
	private String nombrecontacto;
	private String apellidocontacto;
	private String dnicontacto;
	private String cargocontacto;
	private String sexocontacto;
	
	
	public int getNrodoc() {
		return nrodoc;
	}
	public void setNrodoc(int nrodoc) {
		this.nrodoc = nrodoc;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCodigocliente() {
		return codigocliente;
	}
	public void setCodigocliente(String codigocliente) {
		this.codigocliente = codigocliente;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono_fijo() {
		return telefono_fijo;
	}
	public void setTelefono_fijo(String telefono_fijo) {
		this.telefono_fijo = telefono_fijo;
	}
	public String getTelefono_celular() {
		return telefono_celular;
	}
	public void setTelefono_celular(String telefono_celular) {
		this.telefono_celular = telefono_celular;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getNombrecontacto() {
		return nombrecontacto;
	}
	public void setNombrecontacto(String nombrecontacto) {
		this.nombrecontacto = nombrecontacto;
	}
	public String getApellidocontacto() {
		return apellidocontacto;
	}
	public void setApellidocontacto(String apellidocontacto) {
		this.apellidocontacto = apellidocontacto;
	}
	public String getDnicontacto() {
		return dnicontacto;
	}
	public void setDnicontacto(String dnicontacto) {
		this.dnicontacto = dnicontacto;
	}
	public String getCargocontacto() {
		return cargocontacto;
	}
	public void setCargocontacto(String cargocontacto) {
		this.cargocontacto = cargocontacto;
	}
	public String getSexocontacto() {
		return sexocontacto;
	}
	public void setSexocontacto(String sexocontacto) {
		this.sexocontacto = sexocontacto;
	}
	


	

}



