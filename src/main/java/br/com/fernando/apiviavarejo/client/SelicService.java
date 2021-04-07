package br.com.fernando.apiviavarejo.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.fernando.apiviavarejo.client.model.Selic;

@FeignClient(name = "SelicService", url="https://api.bcb.gov.br/dados/serie/bcdata.sgs.11/dados/ultimos/") 
public interface SelicService {
	
	@GetMapping("{qtd}?formato=json")
	List<Selic> buscarTaxaSelic(@PathVariable("qtd") Integer quantidade);
}
