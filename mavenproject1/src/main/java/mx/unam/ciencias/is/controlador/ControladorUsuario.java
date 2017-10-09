/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.controlador;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import mx.unam.ciencias.is.mapeobd.Marcador;
import mx.unam.ciencias.is.mapeobd.Usuario;
import mx.unam.ciencias.is.modelo.UsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author hectorsama
 */
@Controller
public class ControladorUsuario {
    @Autowired
    private UsuarioDAO usuario_bd;
       
    
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String nuevoInicio(){
return "agregarUsuario";
}
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String login(){
    return"";
    }
    
    
       
    @RequestMapping(value="/login", method = RequestMethod.POST)   
    public String guardarUsuario(HttpServletRequest request){
    String nickname=request.getParameter("nickname");
    String correo=request.getParameter("correo");
    String contrasenia =request.getParameter("contrasenia");
    Usuario u=usuario_bd.getUsuario(correo);
    if(u==null){
    u= new Usuario();
    u.setNickname(nickname);
    u.setContrasena(contrasenia);
    u.setCorreo(correo);
    usuario_bd.guardar(u);
    }
    return "inicio";
    }
    
}
