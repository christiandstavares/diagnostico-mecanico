package com.jcl.diagmecanico.entity.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class LoginDTO implements Serializable {

    private String email;
    private String senha;
}
