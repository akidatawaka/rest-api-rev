package com.belajar.restapirev.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belajar.restapirev.entity.Hardware;
import com.belajar.restapirev.repository.HardwareRepository;
import com.belajar.restapirev.service.HardwareService;

@Service
public class HardwareServiceImpl implements HardwareService {
	
	@Autowired
	HardwareRepository hardwareRepository;
	
	public List<Hardware> findAll() {
		return hardwareRepository.findAll();
	}
	
	public Hardware findById(Long id) {
		return hardwareRepository.getOne(id);
	}
	
	public Hardware update(Long id, Hardware hardware) {
		return hardwareRepository.save(hardware);
	}
	
	public Hardware create(Hardware hardware) {
		return hardwareRepository.save(hardware);
	}
	
	public void delete(Long id) {
		hardwareRepository.deleteById(id);
	}

}
