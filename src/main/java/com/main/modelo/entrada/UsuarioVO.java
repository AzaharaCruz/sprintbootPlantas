/**
 * 
 */
package com.main.modelo.entrada;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Clase borrable: Es una clase de ejemplo, se debe borrar<br />
 *  
 * Value Object de Usuario. Se corresponde con la entidad Usuario.<br />
 * Los Value Object parsean datos de entrada y salida del servio. <br />
 * En algunas ocasiones (como en este ejemplo), estos objetos tienen su correspondencia
 * en el Modelo real del aplicativo. (En este caso, con Usuario)<br />
 * Resulta una mala práctica exponer el dominio, pues aportan información de nuestro sistema
 * y hacen que el API sea muy sensible a cambios.<br />
 * 
 * @author mvelazquezm
 *
 */ 
@ApiModel(value = "UsuarioAplicacion", description = "Datos de un usuario con sus valores")

public class UsuarioVO extends AbstractVO {

	public UsuarioVO(int id, String nombre, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public UsuarioVO() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	/**
	 * ID
	 */
	private static final long serialVersionUID = 1692459380418075186L;

	/**
	 * Identificador del usuario
	 */
	@ApiModelProperty(value = "Identificador único de usuario", required = true)
	private int id;
	
	/**
	 * Nombre del usuario
	 */
	@ApiModelProperty(value = "Nombre de usuario", required = false)
	private String nombre;
	
	/**
	 * Apellido del usuario
	 */
	@ApiModelProperty(value = "Apellido o apellidos de usuario", required = false)
	private String apellido;
	
} //UsuarioVO
