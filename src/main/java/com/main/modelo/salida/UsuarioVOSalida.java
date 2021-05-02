/**
 * 
 */
package com.main.modelo.salida;

import com.main.modelo.entrada.AbstractVO;
import com.main.modelo.entrada.UsuarioVO;

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

public class UsuarioVOSalida extends AbstractVO {

	public UsuarioVOSalida(UsuarioVO usuario, Boolean creado) {
		super();
		this.usuario = usuario;
		this.creado = creado;
	}
	
	public UsuarioVOSalida() {
	}
	UsuarioVO usuario;
	Boolean creado;
	public UsuarioVO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioVO usuario) {
		this.usuario = usuario;
	}

	public Boolean getCreado() {
		return creado;
	}

	public void setCreado(Boolean creado) {
		this.creado = creado;
	}
	
	
	
} //UsuarioVO
