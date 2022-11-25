package com.bootcamp.MYBOOTCAPPROJECT.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Measurement;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
public class TestController {

	private Counter counter;
	
	public TestController(MeterRegistry registry) {
		this.counter = Counter.builder("Invocaciones.hello").description("Invocaciones totales").register(registry);
	}
	
	@GetMapping(path="/helloworld")
	public String helloWorld() {
		counter.increment();
		return "Hello World";
	}
	
	@GetMapping(path="/ConsultaHelloWorld")
	public Iterable<Measurement> consultaHelloWorld() {
		return counter.measure();
	}
	
}
