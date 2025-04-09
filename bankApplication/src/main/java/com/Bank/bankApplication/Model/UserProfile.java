package com.Bank.bankApplication.Model;

import jakarta.persistence.*;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "UserProfile")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

//    @NotNull(message = "account number is required")
    @Column(nullable = false,unique = true)
    private String accountNumber;

//    @NotBlank(message = "user name is required ")
    @Column(nullable = false)
    private String username;

//    @NotNull(message = "branch id is required")
//    @Column(nullable = false)
//    private Integer branchId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "accId",referencedColumnName = "userId")
    private BankUser bankUser;
}
