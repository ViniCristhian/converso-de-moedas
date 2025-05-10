package conversordemoeda.controller;

import java.io.IOException;

import conversordemoeda.model.MoedaDTO;
import conversordemoeda.service.MoedaService;

public class MoedaController {
    
    private MoedaService moedaService = new MoedaService();


    public MoedaDTO getMeadaDTO(String base_code, String target_code, Double amount) throws IOException, InterruptedException {
	return moedaService.moedaDTO(base_code, target_code, amount);
    }
    
    public void getSaidaFormatada(String base_code, String target_code, Double amount) throws IOException, InterruptedException {
	moedaService.saidaFormatada(base_code, target_code, amount);
    }
}
