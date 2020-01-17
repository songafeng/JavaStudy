import org.apache.commons.codec.digest.DigestUtils;

public class Pwd {

    public static void main(String[] args) {

        String pwd= DigestUtils.md5Hex("afeng111111");

        System.out.println(pwd);
    }
}
