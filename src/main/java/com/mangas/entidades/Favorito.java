package com.mangas.entidades;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Favorito {
	
	private Usuario usuario_id;
	private Manga manga_id;
	
}
