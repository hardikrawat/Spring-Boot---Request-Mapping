package com.springboot.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.springboot.dao.PatientDAO;
import com.springboot.domain.Patient;

@RestController
public class PatientController {

	PatientDAO dao = new PatientDAO();

	@RequestMapping("/patient/list")
	public List<Patient> listPatients() {
		return this.dao.getPatients();
	}

	@RequestMapping("/patient/create")
	public List<Patient> createPatient(@RequestBody Patient patient) {
		return this.dao.createPatient(patient);
	}

}
