package com.example.currencies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CurrenciesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrenciesApplication.class, args);
	}

	@GetMapping("/exchangerates_data/latest")
	public Object hello(@RequestParam(value = "symbols", defaultValue = "USD") String symbols,
						@RequestParam(value = "base", defaultValue = "USD") String base,
						@RequestHeader("apikey") String apikey) {
		if (!apikey.equals("Zw6i9UPopxHUGV8yXMdH8s1dKz4Xj5qi"))
			return new ResponseEntity("Apikey is wrong", HttpStatus.NOT_FOUND);

		System.out.println("symbols - " + symbols);
		System.out.println("base - " + base);
//		return String.format("Hello %s!", base);
		return ResponseEntity.ok(DataStorage.usd);
	}
}
