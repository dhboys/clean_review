package org.judy.manager.service;

import java.util.List;
import java.util.stream.Collectors;

import org.judy.common.util.PageDTO;
import org.judy.manager.dto.ManagerDTO;
import org.judy.manager.mapper.ManagerMapper;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@RequiredArgsConstructor
public class ManagerServiceImpl implements ManagerService {

	private final ManagerMapper mapper;
	
	

	@Override
	public ManagerDTO selectOne(String mid) {
		
	
		return toDTO(mapper.selectOne(mid));
		
	
	}

	@Override
	public List<ManagerDTO> getManagerList(PageDTO pageDTO) {
		return mapper.getManagerList(pageDTO).stream().map(manager -> {
			return toDTO(manager);
		}).collect(Collectors.toList());
	}

	@Override
	public int totalMan() {
		log.info("totalMan..........");
		return mapper.totalMan();
	}
	

	

}
