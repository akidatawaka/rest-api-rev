package com.belajar.restapirev.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity //untuk memberikan identitas data yang mengakses ke database
public class Hardware {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
		@Column(name = "tipe")
		private String tipe;
		
		@Column(name = "merk")
		private String merk;
		
		@Column(name = "harga")
		private long harga;
		
		@Column (name = "jenis_garansi")
		private String jenis_garansi;
}
