package com.main.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.modelo.entrada.UsuarioVO;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class LoginUsuario {

	
	/**
	 * Realiza el alta de un usuario que se pasa como parámetro
	 * @param usuario json con el usuario a dar de alta
	 * @return retorna códido http
	 */
	@ApiOperation(value = "Alta de usuario",
			notes = "Da de alta un usuario en el sistema")
	@RequestMapping(value="/LoginUsuario", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses({
        @ApiResponse(code = 201, message = "El usuario dado de alta correctamente"),
        @ApiResponse(code = 300, message = "El usuario ya existe en la aplicación"),
        @ApiResponse(code = 400, message = "Error no controlado")
	})
	@ResponseBody public ResponseEntity<Boolean> loginUsuario(@RequestBody UsuarioVO usuario) {
		System.out.println("hola");
		return new ResponseEntity<>(Boolean.TRUE, HttpStatus.CREATED);
		
	} //altaUsuario	
}
