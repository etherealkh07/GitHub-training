package com.Bank.bankApplication.Exception;

public class ResourcesNotFoundException extends RuntimeException{
    public ResourcesNotFoundException(String message)
    {
        super(message);
    }
}
