package com.amex.productservicedb.representinginheritance.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tableperclass_Mentor")
public class Mentor extends User {
    private double mentorrating;
}
