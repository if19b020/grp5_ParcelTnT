package at.fhtw.swen3.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Error {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private String errorMessage = null;
}