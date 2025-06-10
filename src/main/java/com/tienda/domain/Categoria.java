package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "id_categoria")
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id_categoria;
    private String descripcion;
    @Column(name = "ruta_imagen")
    private String ruta_imagen;
    private boolean activo;

    public Categoria() {
        
    }
    
    public Categoria(Long id_categoria) {
        this.id_categoria = id_categoria;
    }

}
