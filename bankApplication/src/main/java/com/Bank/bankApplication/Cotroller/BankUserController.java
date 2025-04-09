package com.Bank.bankApplication.Cotroller;

import com.Bank.bankApplication.Model.BankUser;
import com.Bank.bankApplication.Repository.BankUserRepository;
import com.Bank.bankApplication.Service.BankUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class BankUserController {
    @Autowired
    private  BankUserServices bankUserServices;

//    @PostMapping("/save")
//    public ResponseEntity<BankUser> createBankUser(@RequestBody BankUser user)
//    {
//        return ResponseEntity.ok(bankUserServices.saveBankUser(user));
//    }


    @PostMapping("/save")
    public ResponseEntity<BankUser> createUser(@RequestBody BankUser user) {

        bankUserServices.saveBankUser(user);
        return ResponseEntity.ok(user);
    }
    @GetMapping("/all")
    public ResponseEntity<List<BankUser>>getAllBAnkUser()
    {
        return ResponseEntity.ok(bankUserServices.getAllBankUser());
    }
    @GetMapping("/{id}")
    public ResponseEntity<BankUser>getBankUser(@PathVariable Long id)
    {
        return ResponseEntity.ok(bankUserServices.getBankUserById(id));
    }
//    @PutMapping("/update/{id}")
//    public ResponseEntity<BankUser>updateBankUser(@PathVariable Long id,@RequestBody BankUser user)
//    {
//        return ResponseEntity.ok(bankUserServices.updateBankUser(id,user));
//    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBankUser(@PathVariable Long id)
    {
        bankUserServices.deleteBankUser(id);
        return ResponseEntity.ok("User deleted successfully");
    }

}
