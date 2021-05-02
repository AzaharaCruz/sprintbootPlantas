package com.main.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.main.modelo.entrada.LoginUsuarioSalida;
import com.main.modelo.entrada.UsuarioLogin;
import com.main.modelo.entrada.UsuarioVO;
import com.main.modelo.salida.UsuarioVOSalida;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class LoginUsuarioFinal {

	/**
	 * Realiza el alta de un usuario que se pasa como parámetro
	 * @param usuario json con el usuario a dar de alta
	 * @return retorna códido http
	 * @throws JsonProcessingException 
	 */
	@ApiOperation(value = "Alta de usuario",
			notes = "Da de alta un usuario en el sistema")
	@RequestMapping(value="/loginUsuario", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses({
        @ApiResponse(code = 201, message = "El usuario dado de alta correctamente"),
        @ApiResponse(code = 400, message = "Error no controlado")
	})
	@ResponseBody public ResponseEntity<String> loginUsuario(@RequestBody UsuarioLogin usuario) throws JsonProcessingException {
		System.out.println("hola");
		//return new ResponseEntity<>(Boolean.TRUE, HttpStatus.CREATED);
		ObjectMapper mapper = new ObjectMapper();
		

		try {
			if(usuario.getNombre().equals("pepe") && usuario.getContrasenia().equals("jimenez")) {
			LoginUsuarioSalida loginrespuesta = new LoginUsuarioSalida("Login correcto", true);

			return new ResponseEntity<String>(
			mapper.writeValueAsString(loginrespuesta),
			HttpStatus.OK);
			} else {
				LoginUsuarioSalida loginrespuesta = new LoginUsuarioSalida("La constraseña no es correcta", false);

				return new ResponseEntity<String>(
				mapper.writeValueAsString(loginrespuesta),
				HttpStatus.OK);
			}
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<String>(
					mapper.writeValueAsString("ERROR GENERICO"),
					HttpStatus.BAD_REQUEST);		}
		
		
		
	} 	
}
