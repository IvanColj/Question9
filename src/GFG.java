import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;

public class GFG {
    public static void main(String[] args)
            throws UnknownHostException
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите IP-адрес: ");
        // Разделяем строку по точкам
        String[] input = in.nextLine().split("\\.");
        byte[] addr = new byte[input.length];

        // Преобразуем каждую часть в байт с проверкой диапазона
        for (int i = 0; i < input.length; i++) {
            int part = Integer.parseInt(input[i]);
            if (part < 0 || part > 255) {
                throw new IllegalArgumentException("Часть IP-адреса должна быть в диапазоне от 0 до 255: " + part);
            }
            addr[i] = (byte) part; // Приведение к типу byte
        }

        InetAddress ip = Inet4Address.getByAddress(addr);


        // getAddress() метод
        // Возвращает IP-адрес, связанный с объектом InetAddress, в виде массива байтов в сетевом порядке.
        System.out.println("Address : " + Arrays.toString(ip.getAddress()));

        // getHostAddress() метод
        // Возвращает строковое представление IP-адреса, связанного с объектом InetAddress.
        System.out.println("Host Address : " + ip.getHostAddress());

        // isAnyLocalAddress() метод
        // Проверяет, является ли IP-адрес локальным адресом (например, 0.0.0.0).
        System.out.println("isAnyLocalAddress : " + ip.isAnyLocalAddress());

        // isLinkLocalAddress() метод
        // Проверяет, является ли IP-адрес адресом локальной связи (например, 169.254.x.x).
        System.out.println("isLinkLocalAddress : " + ip.isLinkLocalAddress());

        // isLoopbackAddress() метод
        // Проверяет, является ли IP-адрес адресом обратной связи (например, 127.0.0.1).
        System.out.println("isLoopbackAddress : " + ip.isLoopbackAddress());

        // isMCGlobal() метод
        // Проверяет, является ли IP-адрес глобальным многоадресным адресом.
        System.out.println("isMCGlobal : " + ip.isMCGlobal());

        // isMCLinkLocal() метод
        // Проверяет, является ли IP-адрес многоадресным адресом локальной связи.
        System.out.println("isMCLinkLocal : " + ip.isMCLinkLocal());

        // isMCNodeLocal() метод
        // Проверяет, является ли IP-адрес многоадресным адресом узла локальной сети.
        System.out.println("isMCNodeLocal : " + ip.isMCNodeLocal());

        // isMCOrgLocal() метод
        // Проверяет, является ли IP-адрес многоадресным адресом организационного уровня.
        System.out.println("isMCOrgLocal : " + ip.isMCOrgLocal());

        // isMCSiteLocal() метод
        // Проверяет, является ли IP-адрес многоадресным адресом локальной сети.
        System.out.println("isMCSiteLocal : " + ip.isMCSiteLocal());

        // isMulticastAddress() метод
        // Проверяет, является ли IP-адрес многоадресным адресом.
        System.out.println("isMulticastAddress : " + ip.isMulticastAddress());

        // isSiteLocalAddress() метод
        // Проверяет, является ли IP-адрес адресом локальной сети (например, 10.x.x.x, 172.16.x.x - 172.31.x.x, 192.168.x.x).
        System.out.println("isSiteLocalAddress : " + ip.isSiteLocalAddress());

        // hashCode() метод
        System.out.println("hashCode : " + ip.hashCode());
    }
}
