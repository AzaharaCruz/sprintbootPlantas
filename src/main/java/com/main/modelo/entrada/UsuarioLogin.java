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


public class UsuarioLogin extends AbstractVO {

	public UsuarioLogin(int id, String nombre, String contrasenia) {
		super();
		this.nombre = nombre;
		this.contrasenia = contrasenia;
	}
	
	public UsuarioLogin() {
	}

	
	/**
	 * Nombre del usuario
	 */
	@ApiModelProperty(value = "Nombre de usuario", required = false)
	private String nombre;
	
	/**
	 * Apellido del usuario
	 */
	@ApiModelProperty(value = "contraseña de usuario", required = false)
	private String contrasenia;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
} //UsuarioVO
