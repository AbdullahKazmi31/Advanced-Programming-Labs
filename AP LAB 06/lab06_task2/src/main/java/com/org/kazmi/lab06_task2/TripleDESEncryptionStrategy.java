package com.org.kazmi.lab06_task2;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author mkazmi.bscs16seecs
 */
public class TripleDESEncryptionStrategy implements EncryptionStrategy {

    public void encryptData(String plaintext) {
        System.out.println("\n-------Encrypting data using TripleDES algorithm-------");
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("TripleDES");
            keyGenerator.init(168);
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] plaintTextByteArray = plaintext.getBytes("UTF8");

            Cipher cipher = Cipher.getInstance("TripleDES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] cipherText = cipher.doFinal(plaintTextByteArray);

            System.out.println("Original data: " + plaintext);
            System.out.println("Encrypted data:");
            for (int i = 0; i < cipherText.length; i++) {
                System.out.print(cipherText[i] + " ");

            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
