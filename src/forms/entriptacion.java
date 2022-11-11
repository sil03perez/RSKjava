package forms;

import java.util.Base64;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class entriptacion {
    
     //GENERAR CLAVE
    public SecretKeySpec crearclave(String llave){
       try{
           byte [] cadena = llave.getBytes("UTF-8");
           MessageDigest md = MessageDigest.getInstance("SHA-1");
           cadena = md.digest(cadena);
           cadena = Arrays.copyOf(cadena, 16);
           SecretKeySpec secretKeySpec = new SecretKeySpec(cadena, "AES");
           return secretKeySpec;
       }catch(Exception ex){
           return null;
       }
        
    }
    
    //ENCRIPTAR
    public String Encriptar(String encriptar, String llave){
         try{
          SecretKeySpec secretKeySpec = this.crearclave(llave);
          Cipher cipher = Cipher.getInstance("AES");
          cipher.init(cipher.ENCRYPT_MODE, secretKeySpec);
          
          byte [] cadena = encriptar.getBytes("UTF-8");
          byte [] encriptada = cipher.doFinal(cadena);
          String cadena_encriptada = Base64.getEncoder().encodeToString(encriptada);
          return cadena_encriptada;
       }catch(Exception ex){
           return "";
       }
    }
    
    //DESENCRIPTAR
     public String Desencriptar(String desencriptar, String llave){
         try{
          SecretKeySpec secretKeySpec = this.crearclave(llave);
          Cipher cipher = Cipher.getInstance("AES");
          cipher.init(cipher.DECRYPT_MODE, secretKeySpec);
          byte [] cadena = Base64.getDecoder().decode(desencriptar);
          byte [] desencriptacion = cipher.doFinal(cadena);
          String cadena_desencriptada = new String(desencriptacion);
          return cadena_desencriptada;
       }catch(Exception ex){
           return "";
       }
    }
    
}
