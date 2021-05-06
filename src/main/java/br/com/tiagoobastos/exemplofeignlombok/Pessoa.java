package br.com.tiagoobastos.exemplofeignlombok;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pessoa {

		private String nome;
		private String email;
		private int idade;
}
