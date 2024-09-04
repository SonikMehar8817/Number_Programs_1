// 44.	WAP to convert Hexadecimal to Decimal

public class Q44 {
    static String HexadecimalToDecimal(String num){
        int  count = 0;
        
        int  result=0;

        for(int i=num.length()-1;i>=0;i--){
            int res = 0;
            int k = 0;
            int power =0;
           String s = num.substring(i, i+1);
           if(s.equals("A")||s.equals("B")||s.equals("C")||s.equals("D")||s.equals("E")||s.equals("F")){

           switch (s) {
            case "A":
                power = (int)Math.pow(16, count);
                k = 10*power;
                res=res+k;
                break;
            case "B":
                power = (int)Math.pow(16, count);
                k = 11*power;
                res=res+k;
                break;
            case "C":
                power = (int)Math.pow(16, count);
                k = 12*power;
                res=res+k;
                break;
            case "D":
                power = (int)Math.pow(16, count);
                k = 13*power;
                res=res+k;
                break;
            case "E":
                power = (int)Math.pow(16, count);
                k = 14*power;
                res=res+k;
                break;
            case "F":
                power = (int)Math.pow(16, count);
                k = 15*power;
                res=res+k;
                break;
           
            default:
                break;
           }
        }
        else{
            int intVal = Integer.parseInt(s);
            power = (int)Math.pow(16, count);
            k = intVal *power;
            res = res +k;

        }
        result = result + res;

        count++;
           
        }
        
        // while (num>0) {
        //     int rem = num %10;
        //     int power = (int)Math.pow(8, count);
        //     int k = rem*power;
        //     res = res +k;
        //     num=num/10;
        //     count ++;
        // }
        // return res;
        System.out.println(result);
        return "";
    }

    public static void main(String[] args) {
        
        HexadecimalToDecimal("AB9A879AB");
    }
    
}
