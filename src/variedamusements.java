import java.math.BigInteger;
import java.util.Objects;
import java.util.Scanner;

public class variedamusements {

    static BigInteger n, a, b, c;
    static BigInteger one = new BigInteger("1");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = new BigInteger(scanner.next());
        a = new BigInteger(scanner.next());
        b = new BigInteger(scanner.next());
        c = new BigInteger(scanner.next());

        BigInteger output = a.multiply(A(n.subtract(one))).add(b.multiply(B(n.subtract(one)))).add(c.multiply(C(n.subtract(one))));
        System.out.println(output.remainder(new BigInteger("10").pow(9).add(new BigInteger("7"))));

    }

    public static BigInteger A(BigInteger num) {
        if (Objects.equals(num.toString(), "0"))
            return new BigInteger("1");

        return b.multiply(B(num.subtract(one))).add(c.multiply(C(num.subtract(one))));
    }

    public static BigInteger B(BigInteger num) {
        if (Objects.equals(num.toString(), "0"))
            return new BigInteger("1");

        return a.multiply(A(num.subtract(one))).add(c.multiply(C(num.subtract(one))));

    }

    public static BigInteger C(BigInteger num) {
        if (Objects.equals(num.toString(), "0"))
            return new BigInteger("1");

        return a.multiply(A(num.subtract(one))).add(b.multiply(B(num.subtract(one))));
    }

}
