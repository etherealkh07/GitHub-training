package com.Bank.bankApplication.Service;

import com.Bank.bankApplication.Model.BankUser;
import com.Bank.bankApplication.Repository.BankUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@RestControllerAdvice
public class BankUserServices {
    @Autowired
    private BankUserRepository bankUserRepository;

    public BankUser saveBankUser(BankUser bankUser)
    {
        return bankUserRepository.save(bankUser);
    }
    public List<BankUser> getAllBankUser()
    {
        return bankUserRepository.findAll();
    }
    public BankUser getBankUserById(Long id)
    {
        return  bankUserRepository.findById(id).orElseThrow(()->new RuntimeException("user id is not found "+ id));
    }
//    public  BankUser updateBankUser(Long id, BankUser newData)
//    {
//        BankUser user = getBankUserById(id);
//        user.setName(newData.getName());
//        user.setBranchId(newData.getBranchId());
//        return bankUserRepository.save(user);
//    }

    public void deleteBankUser(Long id)
    {
        BankUser user = getBankUserById(id);
        bankUserRepository.delete(user);
    }

}
