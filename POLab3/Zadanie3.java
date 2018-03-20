package zadanie.pkg3;
import java.util.Scanner;
public class Zadanie3 
{

    static void zad1()
    {
    //zad 1.7
    int y;
    do{
      System.out.println("1.NOT");
      System.out.println("2.XOR");
      System.out.println("0.KONIEC");
     
      Scanner kontrola= new Scanner(System.in);
      y=kontrola.nextInt();
      System.out.println(y);
        switch(y){
        case 1:{
        int a,b;
        
        System.out.println("Podaj a i b:");
        Scanner in= new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        if(a>b)
        {
        System.out.println("A > B");
        }        
        else
        {
        System.out.println("B >= A");
        }
        if(!(a>b))
        {
        System.out.println("NOT-B > A");
        }        
        else
        {
        System.out.println(" NOT A >= B");
        }
        break;}
         
        case 2:{
        int c,d;
        System.out.println("Podaj c i d:");
        Scanner xor= new Scanner(System.in);
        c=xor.nextInt();
        d=xor.nextInt();
        if(c%2==0|| d%2==0)
        {
            System.out.println("Jedna z nich lub obie sa parzyste");
        }
        else
        {
            System.out.println("Zadna nie jest parzysta");
        }
        if(!(c%2==0|| d%2==0))
        {
            System.out.println("Zadna badz jedna jest parzysta");
        }
        else
        {
            System.out.println("Obie sa parzyste");
        }
        break;}
         
            
    }}
    while(y!=0);
       
    } 
    
    static void zad2(){
        int z2; 
    //zad 1.4
    do{
      System.out.println("1.Dzialanie >>");
      System.out.println("2.Dzialanie <<");
      System.out.println("3.Dzialanie >>>");
      System.out.println("0.Koniec");
      Scanner op= new Scanner(System.in);
      z2=op.nextInt();
      switch(z2){
          case 1:
              int a,b;
              System.out.println("Podaj a:");
              Scanner opa=new Scanner(System.in);
              a= opa.nextInt();
              System.out.println("Ta zmienna to: "+a);
              b= a>>1;
              System.out.println("po przesunieciu o 1 bit w lewo to:"+b);
              break;
           case 2:
              int c,d;
              System.out.println("Podaj b:");
              Scanner opc=new Scanner(System.in);
              c= opc.nextInt();
              System.out.println("Ta zmienna to: "+c);
              d= c<<1;
              System.out.println("po przesunieciu o 1 bit w lewo to:"+d);
              break;
           case 3:
              int e,f;
              System.out.println("Podaj c:");
              Scanner ope=new Scanner(System.in);
              e= ope.nextInt();
              System.out.println("Ta zmienna to: "+e);
              f= e>>>3;
              System.out.println("po przesunieciu o 1 bit w lewo to:"+f);
              break;  
          }
    }while(z2!=0);
    
    
    }
    
    //zad 2.2
    static void zad3(){
        String str = "Pies";
    char[] tab = str.toCharArray();
    for(int i=0;i<tab.length;i++)
    {
        System.out.println(i+"."+tab[i] );
    }
    
   byte[] byt= str.getBytes();
   for(int i=0;i<byt.length;i++)
    {
        System.out.println(tab[i]+"="+byt[i]);
    }
   
     String str2="tekst";
     boolean c;
     c=str.equals(str2);
     System.out.println(c);
   
     c=str.equalsIgnoreCase(str2);
     System.out.println(c);
    
     int i;

     i=str.compareTo(str2);
     System.out.println(i);
     
     
     i=str.compareToIgnoreCase(str2);
     System.out.println(i);
     

     i=str2.indexOf("e");
     System.out.println(i);
     
     i=str2.indexOf("k",2);
     System.out.println(i);
     
     i=str2.lastIndexOf("k");
     System.out.println(i);
     
     i=str2.lastIndexOf("t",4);
     System.out.println(i);
     
    String str3;
    str3=str.substring(2);
    System.out.println(str3);
     
    str3=str.substring(1,3);
    System.out.println(str3);
     
    String str4="Pies";
    str3=str4.replace("P","s");
    System.out.println(str3);
    
    String str5="But bez szewca";
    String str6=str5.trim();
    System.out.println(str5);
    System.out.println(str6);
    
    
    str5=str.toLowerCase();
    System.out.println(str5);
    
    str5=str2.toUpperCase();
    System.out.println(str5);
    
    String str8="trytytka";  
    String str7[]=str8.split("t",2);
    for(i=0;i<str7.length;i++)
        {
            System.out.println(str7[i]);
        }
    String str9[]=str8.split("-");
    for(i=0;i<str9.length;i++)
        {
            System.out.println(str9[i]);
        }
    } 
    static void zad4(){
    //zad 3.3
    int z4;
    do{
    System.out.println("1.Potegowanie for");
    System.out.println("2.Potegowanie rekurencja");
    System.out.println("0.Koniec");
    Scanner odczyt= new Scanner(System.in);
     z4=odczyt.nextInt();
      switch(z4){
          case 1:
              int k,n;
              int w=1;
              System.out.println("Podaj podstawe i wykladnik:");
              Scanner p= new Scanner(System.in);
              k=p.nextInt();
              n=p.nextInt();
              for(int i=1;i<=n;i++){
              w=w*k;
              }
              System.out.println(w);
              break;
          case 2:
              Scanner sc = new Scanner(System.in);
              System.out.print("Podaj liczbę oraz wykladnik: " ); 
              int liczba = sc.nextInt(); 
              int wykladnik=sc.nextInt();
              System.out.println(liczba + " ^ "+ wykladnik + "=" + potegi(liczba,wykladnik));
              break;                 
      }
    }while(z4!=0);
}
public static int potegi(int podstawa, int wykladnik) {
if(wykladnik == 0) return 1;
else return podstawa * potegi(podstawa,wykladnik-1);
}
    static void zad5(){
        //Zadanie 3.4
        System.out.println("Podaj n ciagu");
        Scanner fib=new Scanner(System.in);
        int n=fib.nextInt();
        System.out.println("Suma ciagu: "+ciag(n));         
     } 
public static int ciag(int n){
   if(n==1 ||n==2) return 1;
   else return ciag(n-1)+ciag(n-2);
}
    public static void main(String[] args) {
        int k;
    do
    {
    System.out.println("Menu:");
    System.out.println("Zadanie 1. -- 1");
    System.out.println("Zadanie 2. -- 2");
    System.out.println("Zadanie 3. -- 3");
    System.out.println("Zadanie 4. -- 4");
    System.out.println("Zadanie 5. -- 5");
    System.out.println("Koniec -- 0.");
    Scanner menu= new Scanner(System.in);
    k=menu.nextInt();
    
        switch(k){
            case 1:
                Zadanie3.zad1();
                break;
            case 2:
                Zadanie3.zad2();
                break;
            case 3:
                Zadanie3.zad3();
                break;
            case 4:    
                Zadanie3.zad4();
                break;
            case 5:
                Zadanie3.zad5();
                break; 
    }}while (k!=0);
    }}