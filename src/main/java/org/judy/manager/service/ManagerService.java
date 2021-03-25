package org.judy.manager.service;

import java.util.List;

import org.judy.common.util.PageDTO;
import org.judy.manager.domain.Manager;
import org.judy.manager.dto.ManagerDTO;

public interface ManagerService {

	List<ManagerDTO> getManagerList(PageDTO pageDTO);
	
	ManagerDTO selectOne(String mid);
	
	int totalMan();
	
	default ManagerDTO toDTO(Manager manager) {
		ManagerDTO dto = ManagerDTO.builder()
								.mid(manager.getMid())
								.mpw(manager.getMpw())
								.email(manager.getEmail())
								.logoImg(manager.getLogoImg())
								.phone(manager.getPhone())
								.enabled(manager.getEnabled())
								.approval(manager.getApproval())
								.regdate(manager.getRegdate())
								.updatedate(manager.getUpdatedate())
								.build();
		return dto;
	}
	
	default Manager toDomain(ManagerDTO dto) {
		Manager manager = Manager.builder()
							.mid(dto.getMid())
							.mpw(dto.getMpw())
							.email(dto.getEmail())
							.logoImg(dto.getLogoImg())
							.phone(dto.getPhone())
							.enabled(dto.getEnabled())
							.approval(dto.getApproval())
							.regdate(dto.getRegdate())
							.updatedate(dto.getUpdatedate())
							.build();
	return manager;
	}
	
}
