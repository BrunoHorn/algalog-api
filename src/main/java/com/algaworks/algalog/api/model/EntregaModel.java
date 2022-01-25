package com.algaworks.algalog.api.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import lombok.Getter;
import lombok.Setter;
import com.algaworks.algalog.domain.model.StatusEntrega;


@Getter
@Setter
public class EntregaModel {

	
	private Long id;
	private ClienteResumoModel cliente;
	private DestinatarioModel destinatario;
	private BigDecimal taxa;
	private StatusEntrega status;
	private OffsetDateTime dataPedido;
	private OffsetDateTime dataFinalizacao;
	
	
	
	
	
}
