package conversordemoeda.service;

import java.io.IOException;

import conversordemoeda.model.MoedaDTO;

public class MoedaService {
    
    private ApiService apiService = new ApiService();
    
    public MoedaDTO moedaDTO(String base_code, String target_code, Double amount) throws IOException, InterruptedException {
	return apiService.responseMoedaDTO(base_code, target_code, amount);
    }
    
    public void saidaFormatada(String base_code, String target_code, Double amount) throws IOException, InterruptedException {
	MoedaDTO moedaDTO = moedaDTO(base_code, target_code, amount);
	System.out.printf("O Valor de %.2f %s para %s será de -> %s %s\n", amount, moedaDTO.base_code(), moedaDTO.target_code(),
		moedaDTO.conversion_result().stripTrailingZeros().toString(), moedaDTO.target_code());
    }
}
