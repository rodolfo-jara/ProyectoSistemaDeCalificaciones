/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiUsuarios.entity;

import lombok.Data;

/**
 *
 * @author rjara
 */
@Data
public class Calificacion {
    private Long calificacionId;
    private String usuarioId;
    private String cafeterialId;
    private int calificacion;
    private String observaciones;

    private Cafeteria cafeteria;
}
