public class equal_or_unequal { 

  //Question no : 5

        public static void main(String[] args) {
            checkString("abcdefg");
        }
    
        public static void checkString(String str) {
            int len  = (int) Math.ceil(str.length()/2)+1;
            Character arr[] = new Character[len];
            Character arr2[] = new Character[len];
            for (int i = 0;i<len;i++){
                arr[i]=str.charAt(i);
    
            }
            String str2 = str;
            StringBuffer sbr = new StringBuffer(str);
            str2= String.valueOf(sbr.reverse());
            for (int i = 0;i<len;i++){
                arr2[i] = str2.charAt(i);
            }
            int count = 0;
            for (int k = 0;k<arr.length;k++){
                if(k<arr.length-1) {
                    int temp1 =Math.abs(arr[k + 1] - arr[k]);
                    int temp2 =Math.abs(arr2[k + 1] - arr2[k]);
                    if(temp1 !=temp2){
                        count++;
                        System.out.println("Unequal difference");
                    }
                }
    
            }
            if(count !=1)
            System.out.println("Equal difference");
                }
        }

