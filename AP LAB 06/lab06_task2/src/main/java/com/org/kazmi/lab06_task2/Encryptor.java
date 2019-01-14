package com.org.kazmi.lab06_task2;

public class Encryptor {

	   private EncryptionStrategy strategy;
	    private String plainText;
	    public Encryptor(EncryptionStrategy strategy){
	        this.strategy=strategy;
	    }
	    public int encrypt(){
	        strategy.encryptData(plainText);
	        return 1;
	    }
	    public String getPlainText() {
	        return plainText;
	    }

	    public void setPlainText(String plainText) {
	        this.plainText = plainText;
	    }
	}
