package com.Bank.bankApplication.Model;

import jakarta.persistence.*;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Bank")
public class BankUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accId;

//    @NotBlank(message = "name is required")
    @Column(nullable = false)
    private String bankName;

//    @NotNull(message = "branch number is required")
    @Column(nullable = false)
    private Integer branchId;

    @OneToOne(cascade = CascadeType.ALL)
    private List<UserProfile> profiles;


}
