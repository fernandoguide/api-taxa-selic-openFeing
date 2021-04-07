package br.com.fernando.apiviavarejo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import br.com.fernando.apiviavarejo.client.SelicService;
import br.com.fernando.apiviavarejo.client.model.Selic;
import lombok.extern.slf4j.Slf4j;

@EnableFeignClients
@SpringBootApplication
@Slf4j
public class ApiViavarejoApplication {

	private static final Logger log = LoggerFactory.getLogger(ApiViavarejoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ApiViavarejoApplication.class, args);

	}

	@Bean
	public CommandLineRunner run(SelicService serviceSelic) {
		return args -> {
			if (args.length > 0) {
				Integer quantidadeDeRegistros = 1;
				List<Selic> listaTaxaSelic = serviceSelic.buscarTaxaSelic(quantidadeDeRegistros);
				log.info("Quantidade de retornos {}", quantidadeDeRegistros);
				log.info("Lista da Taxa Selic {}", listaTaxaSelic);
			}
		};
	}
}
