package conversordemoeda.model;

import java.math.BigDecimal;

public record MoedaDTO(String base_code, String target_code, BigDecimal conversion_rate, BigDecimal conversion_result) {
    
    public MoedaDTO() {
	this(null, null, null, null);
    }
}
