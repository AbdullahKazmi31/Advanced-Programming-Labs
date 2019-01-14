package lab04;


public class EncryptorTest {
    public static void main(String[] args) throws Exception{
            testEncrypt();
    }
    
    
    static void testEncrypt() throws Exception {
      EncryptionStrategy aesStrategy=new AesEncryptionStrategy();
      Encryptor aesEncryptor=new Encryptor(aesStrategy);
      aesEncryptor.setPlainText("My name is Abdullah Kazmi.");
      aesEncryptor.encrypt();
      System.out.println();

        EncryptionStrategy blowfishStrategy=new BlowfishEncryptionStrategy();
        Encryptor blowfishEncryptor=new Encryptor(blowfishStrategy);
        blowfishEncryptor.setPlainText("My name is Abdullah Kazmi.");
        blowfishEncryptor.encrypt();
        System.out.println();
        
        EncryptionStrategy TripleDESStrategy=new TripleDESEncryptionStrategy();
        Encryptor TripleDESEncryptor = new Encryptor(TripleDESStrategy);
        TripleDESEncryptor.setPlainText("My name is Abdullah Kazmi.");
        TripleDESEncryptor.encrypt();
        System.out.println();
    }
}
