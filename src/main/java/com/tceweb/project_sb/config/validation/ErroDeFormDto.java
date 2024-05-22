package com.tceweb.project_sb.config.validation;

public class ErroDeFormDto {
    private String campo;
    private String erro;

    public ErroDeFormDto(){
    }

    public ErroDeFormDto(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }
}
