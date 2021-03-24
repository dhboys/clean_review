package org.judy.manager.controller;

import java.util.List;

import org.judy.manager.dto.ManagerDTO;
import org.judy.manager.service.ManagerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/manager")
@CrossOrigin("*")
@RequiredArgsConstructor
@Log4j
public class ManagerRestController {

	private final ManagerService service;
	
	@GetMapping(value = "/listJson" , produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<ManagerDTO>> getList(){
		
		
		
		return new ResponseEntity<List<ManagerDTO>> ( service.getMemberList(), HttpStatus.OK);
	}
	
	
	
	@GetMapping(value = "/read/{mid}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<ManagerDTO> getRead(@PathVariable("mid") String mid) {
		
		
		log.info("REST");
		
		return new ResponseEntity<ManagerDTO>(service.selectOne(mid) , HttpStatus.OK);
	}

}
