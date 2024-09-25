package keza.ngara.banking_app.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "accounts")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "account_holder_name")
    private String accountHolderName;
    private double balance;


}
