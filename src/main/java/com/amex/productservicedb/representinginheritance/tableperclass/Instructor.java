package com.amex.productservicedb.representinginheritance.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tableperclass_Instructor")
public class Instructor extends User {
    private String specialiation;
   
}
