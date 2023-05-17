import java.util.Arrays;

public class SecondTest {
    public static void main(String[] args) {
        //exs.1

        int[] nums1=new int[15];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i]=(int) (Math.random()*10);
        }
        int[]nums2=new int[15];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i]=(int) (Math.random()*10);
        }
        //exs.2
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        //exs.3
        int max=0;
        int temp;
        for (int i = 0; i < nums1.length-2; ) {
            temp=nums1[i]*100+nums1[i+1]*10+nums1[i+2];
            if (temp>max)
                max=temp;
            i++;
        }
        System.out.println("\n"+" The biggest number is: "+max);
        //exs.4
        int[]distinct=new int[10];
        for (int i = 0; i < distinct.length; i++) {
            distinct[i]=(-1);
        }
        System.out.println(Arrays.toString(distinct));//The print is for me...
        int countDistinct=0;
        for (int i = 0; i < nums1.length; i++) {
            boolean isEqual=false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i]==nums2[j]){
                    isEqual=true;
                    break;}
            }
            if (isEqual==false){
                for (int j = 0; j <=countDistinct; j++) {
                    if (nums1[i]!=distinct[j]){
                        isEqual=false;
                    }else{ isEqual=true;
                        break;}
                }if (isEqual==false){
                    distinct[countDistinct]=nums1[i];
                    System.out.print(distinct[countDistinct]);//the print is for me...
                    countDistinct++;
                }

            }
        }
        for (int i = 0; i < nums2.length; i++) {
            boolean isEqual=false;
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i]==nums1[j]){
                    isEqual=true;
                    break;}

            }
            if (isEqual==false){
                for (int j = 0; j <=countDistinct; j++) {
                    if (nums2[i]!=distinct[j]){
                        isEqual=false;
                    }else{ isEqual=true;
                        break;}
                }if (isEqual==false){
                    distinct[countDistinct]=nums2[i];
                    System.out.print(distinct[countDistinct]);//The print is for me...
                    countDistinct++;
                }
            }
        }
        //exs.5
        System.out.println("\n"+Arrays.toString(distinct));
        //ex.6 לכתוב ישר, למרות שבטופס המבחן המספר רשום הפןך
        int newNum=0;
        for (int i =0; i<=countDistinct-1; i++) {
            newNum=newNum*10+distinct[i];

        }
        System.out.println("-----");
        if (countDistinct==0)
            System.out.println("Dear Nir,there are no unique numbers, so that there is no positive number in distinct array ");
        else if (newNum==0) {
            System.out.println("Dear Nir,  I am sorry, the number is 0");

        } else
            System.out.println("The new number is:"+newNum);
    }
}
