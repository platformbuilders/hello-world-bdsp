package com.example.demo.dto;

public class HelloResponse {
    private String secretValue;
    private String envVarTest;
    private String envDataValue;
    private String mensagem;
  
    // Construtor
    public HelloResponse(String mensagem, String envDataValue, String envVarTest, String secretValue) {
        this.secretValue =  secretValue;
        this.envVarTest = envVarTest;
        this.envDataValue = envDataValue;
        this.mensagem = mensagem;
    }

    // Getters e Setters
    public String getMensagem() {
        return mensagem;
    }
    

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getsecretValue() {
        return secretValue;
    }

    public void setsecretValue(String secretValue) {
        this.secretValue = secretValue;
    }


    public String getenvVarTest() {
        return envVarTest;
    }

    public void setenvVarTest(String envVarTest) {
        this.envVarTest = envVarTest;
    }
    
    public String getenvDataValue() {
        return envDataValue;
    }

    public void setenvDataValue(String envDataValue) {
        this.envDataValue = envDataValue;
    }


}
