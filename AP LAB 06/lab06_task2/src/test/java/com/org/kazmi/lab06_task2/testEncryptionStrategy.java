package com.org.kazmi.lab06_task2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testEncryptionStrategy {
	EncryptionStrategy aesStrategy=new AesEncryptionStrategy();
    Encryptor aesEncryptor=new Encryptor(aesStrategy);
    
    @Test
    public void test() {
        aesEncryptor.setPlainText("This is plain text");
        assertEquals(1,aesEncryptor.encrypt());
//        fail("Not yet implemented");
    }
}
