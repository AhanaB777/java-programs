/*
Q10.  Extract Domain from URL 
Problem Statement: 
A digital marketing company wants to extract the domain name from a given URL. 
Write a Java program that: 
 Accepts a URL. 
 Extracts and displays only the domain name. 

Example Input/Output: 
Input: 
Enter URL: https://www.google.com/search?q=java 
Output: 
Domain: google.com 
*/

import java.util.Scanner;

class Dom {
    String getDomain(String s) {
        String[] arr = s.split("/");
        String res;
        System.out.println(arr[2]);
        if (arr[2].startsWith("www.")) {
            res = arr[2].substring(4);
        } else {
            res = arr[2];
        }
        return res;
    }

}

public class extractDomain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter URL: ");
        String s = sc.next();

        Dom obj = new Dom();

        String res = obj.getDomain(s);
        System.out.println("Domain: " + res);

        sc.close();
    }
}
