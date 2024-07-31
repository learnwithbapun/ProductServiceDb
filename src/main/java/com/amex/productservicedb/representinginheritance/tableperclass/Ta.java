package com.amex.productservicedb.representinginheritance.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tableperclass_Ta")
public class Ta extends User {
    private int  numbersOfSession;
    private  double averageRatings;
}
