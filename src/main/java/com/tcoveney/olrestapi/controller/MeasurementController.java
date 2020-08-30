package com.tcoveney.olrestapi.controller;

import com.tcoveney.olrestapi.model.Measurement;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:9000"})
public class MeasurementController {
	@GetMapping("/measurements")
	public ArrayList<Measurement> getMeasurements() {
		// [[ 'one': 120, 'uom': 'ft2'], ['two': 90, 'uom': 'ft2'], ['three': 110, 'uom': 'ft2']]
		ArrayList<Measurement> measurements = new ArrayList<Measurement>();
		measurements.add(new Measurement(1, 120));
		measurements.add(new Measurement(2, 90));
		measurements.add(new Measurement(3, 110));
		
		return measurements;
	}
}
