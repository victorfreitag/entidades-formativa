package com.boxblue.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dependente")
public class Dependente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_dep", nullable = false, length = 100)
	private Long id_dep;
	
	private String cpf;
	
	private String nome;
	
	private String telefone;
	
	
	@ManyToOne
	@JoinColumn(name = "id_func")
	private Funcionario funcionario;
}
