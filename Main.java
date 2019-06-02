package cn.com.agree.aweb.sm4;

public class Main {

    public Main() {
    }
    
    private static String key = "1234567812345678";
    
    public static void main(String[] args) {
        String password = new String(AES.encryptToBase64("root", key));
        System.out.println(password);
        System.out.println(new String(AES.decryptFromBase64(password, key)));
    }

}
