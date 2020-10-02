package com.devsuperior.dsClient.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsClient.entities.Client;
import com.devsuperior.dsClient.services.ClientService;

@RestController
@RequestMapping(value = "/client")
public class ClientResource {
	
	@Autowired
	private ClientService service;
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		//List<Client> list = service.findAll();
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Maria", "9999", 999.99, 2));
		list.add(new Client(2L, "Carla", "9999", 999.99, 2));
		return ResponseEntity.ok().body(list);
	}
	
}
