/* write a program in java to convert:
 * i. Decinimal to Hexadecimal Number
 * ii. Decimal to Octal Number
 * iii. Binary to Decimal Number
 * iv. Octal to DEcimal Number
 */
import java.util.Scanner;
public class qst12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        qst12 DECobj= new qst12();
        System.out.println("Enter Decimal number: ");
        int dec=sc.nextInt();
        int DeCiMaL= DECobj.Binary(dec);
        System.out.println("The binary of the decimal is: "+DeCiMaL);

        System.out.println("Enter Binary number: ");
        int bin=sc.nextInt();
        int BiNaRy= DECobj.DECIMAL(bin);
        System.out.println("The decimal of binary no. is: "+ BiNaRy);

        System.out.println("Enter Decimal number: ");
        int dec2=sc.nextInt();
        int OcTaL= DECobj.OCTAL(dec2);
        System.out.println("The Octal of Decimal no. is: "+ OcTaL);

        System.out.println("Enter Octal number: ");
        int oct=sc.nextInt();
        int DeCiMaL2= DECobj.DECIMAL2(oct);
        System.out.println("The Octal of Decimal no. is: "+ DeCiMaL2);  
        
        System.out.println("Enter Decimal number: ");
        int dec3=sc.nextInt();
        String HeXaDeCiMaL= DECobj.HEXADECIMAL(dec3);
        System.out.println("The Hexadecimal of the decimal is: "+HeXaDeCiMaL);
        
        
    }

    // Decimal to binary
    int Binary(int dec){
        int rem;
        String bin="";
        while(dec>0){
            rem=dec%2;
            bin=bin+rem;
            dec=dec/2;
        }
        
        int len= bin.length();
        String bin1="";
        for(int i=(len-1); i>=0; i--){
            bin1=bin1+bin.charAt(i);
        }
        
        int Binint=Integer.parseInt(bin1);
        return Binint;
    }

    // Binary to decimal
    int DECIMAL(int bin){
        int var;
        String str2;
        int calculation=0;
        int power;
        String str= String.valueOf(bin);
        int len= str.length();
        char ch;
        for(int i=(len-1); i>=0; i--){
            ch=str.charAt(i);
            if(ch!='1' && ch!='0'){
                System.out.println("Enter the Valid Number");
                return 0;
                
            }
            str2=String.valueOf(str.charAt((len-1)-i));// yaha character lai string ma convert gardai xu. so ysha string.valueof() lagyo
            var=Integer.parseInt(str2);
            power=(int) Math.pow(2, i);// Math.pow() ko return value double ma hunxa;
            calculation= calculation+( var*power);
        }
        return calculation;
    }

    // Decimal to octal
    int OCTAL(int dec){
        int rem;
        String bin="";
        while(dec>0){
            rem=dec%8;
            bin=bin+rem;
            dec=dec/8;
        }
        
        int len= bin.length();
        String bin1="";
        for(int i=(len-1); i>=0; i--){
            bin1=bin1+bin.charAt(i);
        }
        
        int Binint=Integer.parseInt(bin1);
        return Binint;
    }

    // octal to decimal
    int DECIMAL2(int bin){
        int var;
        String str2;
        int calculation=0;
        int power;
        String str= String.valueOf(bin);
        int len= str.length();
        for(int i=(len-1); i>=0; i--){

            if((int)str.charAt(i)<0 || (int)str.charAt(i)>7){
                System.out.println("Enter the Valid Number");
                return 0;
            }
            str2=String.valueOf(str.charAt((len-1)-i));// yaha character lai string ma convert gardai xu. so ysha string.valueof() lagyo
            var=Integer.parseInt(str2);
            power=(int) Math.pow(8, i);// Math.pow() ko return value double ma hunxa;
            calculation= calculation+( var*power);
        }
        return calculation;
    }

    // Decimal to HexaDecimal
    String HEXADECIMAL(int dec){
        int rem;
        String rem1;
        String bin="";
        while(dec>0){
            rem=dec%16;
            rem1=String.valueOf(rem);
            if(rem==10){
                rem1="A";
            }
            if(rem==11){
                rem1="B";
            }
            if(rem==12){
                rem1="C";
            }
            if(rem==13){
                rem1="D";
            }
            if(rem==14){
                rem1="E";
            }
            if(rem==15){
                rem1="F";
                
            }
            
            bin=bin+rem1;
            dec=dec/16;
        }
        int len= bin.length();
        String bin1="";
        for(int i=(len-1); i>=0; i--){
            bin1=bin1+bin.charAt(i);
        }
        return bin1;
    }

}
