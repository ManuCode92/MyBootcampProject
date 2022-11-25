package com.bootcamp.MYBOOTCAPPROJECT.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.MYBOOTCAPPROJECT.persistence.Equipo;

@RestController
@RequestMapping("/equipo")
public class Controller {

	static List<Equipo> listaEquipo = new ArrayList<Equipo>();
	
	static {
		listaEquipo.add(new Equipo("España", 3));
		listaEquipo.add(new Equipo("Alemania", 0));

	}
	
	@GetMapping(path="/ObtenerTodo")
	public List<Equipo> searchAll(){
		return listaEquipo;
	}
	@GetMapping(path="/ObtenerEspaña")
	public Equipo getSpain(){
		return listaEquipo.get(0);
	}
	@GetMapping(path="/Alemania")
	public Equipo getGermany(){
		return listaEquipo.get(1);
	}
}
