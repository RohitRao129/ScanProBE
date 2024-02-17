package com.mavericks.scanpro.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Scanned_files {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(nullable = false,unique = true)
    private String sha;

    @Column(nullable = false)
    private Long invoice_number;

    @Column(nullable = false)
    private Long subtotal;

    @Column(nullable = false)
    private Long tax;

    @Column(nullable = false)
    private Long total_amount;

    @Column(nullable = false)
    private Date date;

    @ManyToOne
    private Address address;

}
