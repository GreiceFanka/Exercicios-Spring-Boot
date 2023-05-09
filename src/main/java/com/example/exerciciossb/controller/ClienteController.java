package com.example.exerciciossb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciossb.models.Cliente;
@RestController
public class ClienteController {
	@GetMapping(path = "/clientes")
	public Cliente obterCliente() {
		return new Cliente(25,"Pedro","123.456.789.00");
	}
}
