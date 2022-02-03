package  com.yourcar.rodizio.repositorio;//package repositorio;
//
//import com.yourcar.rodizio.usuario.Usuarioval;
//import org.springframework.data.repository.CrudRepository;
//
//public interface Usuariorepositorio extends CrudRepository<Usuarioval, Integer> {
//
//}

import com.yourcar.rodizio.usuario.Usuarioval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



     @Repository
     public interface Usuariorepositorio extends JpaRepository <Usuarioval, Integer> {
}