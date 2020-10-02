package com.devsuperior.dsClient.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsClient.dto.ClientDTO;
import com.devsuperior.dsClient.entities.Client;
import com.devsuperior.dsClient.services.ClientService;

@RestController
@RequestMapping(value = "/client")
public class ClientResource {
	
	@Autowired
	private ClientService service;
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = service.findAll();
//		List<Client> list = new ArrayList<>();
//		list.add(new Client(1L, "Maria", "9999", 999.99, "TIMESTAMP WITH TIME ZONE '2020-07-14T10:00:00Z'", 2));
//		list.add(new Client(2L, "Carla", "9999", 999.99, 2));
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ClientDTO> findByID(@PathVariable Long id) {
		ClientDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
}
