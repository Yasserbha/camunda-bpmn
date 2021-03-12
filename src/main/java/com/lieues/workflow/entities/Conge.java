package com.lieues.workflow.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Conge implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    TypeConge typeConge;

    @Temporal(TemporalType.DATE)
    private Date datedebutconge;

    @Temporal(TemporalType.DATE)
    private Date datefinconge;

    @ManyToOne
    private Employe employe;


}
