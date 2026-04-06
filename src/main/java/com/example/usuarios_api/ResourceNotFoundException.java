package com.example.usuarios_api;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String menssagem){
        super(menssagem);
    }
}
