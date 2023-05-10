package com.example.exerciciossb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.exerciciossb.models.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@GetMapping("/qualquer")
	public Cliente obterCliente() {
		return new Cliente(25,"Pedro","123.456.789-00");
	}
	
	@GetMapping("/{id}")
	public Cliente obterCliente1(@PathVariable int id) {
		return new Cliente(id,"Maria","987.654.321-22");
	}
	
	@GetMapping
	public Cliente obterCliente2(@RequestParam(name="id")int id) {
		return new Cliente(id,"Gustavo","111.644.888-22");
	}
}
