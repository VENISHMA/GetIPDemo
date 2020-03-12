import java.net.*;
import java.util.Scanner;
public class GetIpTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        Scanner s;
        s=new Scanner(System.in);
        String str;
        System.out.println("Enter website url");
        str=s.next();
		InetAddress hostIP=InetAddress.getByName(str);

		System.out.println("\nHost Name\t:\t"+hostIP.getHostName());
		
		System.out.println("\nHost IP Address\t:\t"+hostIP.getHostAddress());
		
		System.out.println("\nHash Code\t:\t"+hostIP.hashCode());
	}

}
