package utils;

import java.util.Random;

public class creaNombreUsuario {
    public static String NombreUsuario(){
        //creamos un usuario aleatorio
        char[] chars = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
        int tamanio = chars.length;
        Random random =new Random();
        StringBuffer buffer =new StringBuffer();
        for(int i=0;i<10;i++){
            buffer.append(chars[random.nextInt(tamanio)]);
        }
        return buffer.toString();
    }
}
