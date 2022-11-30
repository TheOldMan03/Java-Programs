import java.util.Scanner;


class Binary_Search{

    public static void Sort(int Array[]){
        int temp;
        int i,j;

        for(i=0;i<(Array.length)-1;i++){

            for(j=0;j<(Array.length)-1-i;j++){

                if (Array[j]>Array[j+1]){

                    temp=Array[j];
                    Array[j]=Array[j+1];
                    Array[j+1]=temp;
                }
            }
        }
    }

    int binary_Search(int Array[],int Elem){

        int beg=0,end=(Array.length)-1;
        int mid;

        while(beg<=end){
            mid=(beg+end)/2;

            if (Array[mid]==Elem){
                return mid;
            }

            else if (Array[mid]<Elem){
                beg=mid+1;
            }

            else{
                end=mid-1;
            }
        }

        return -1;
    }


    public static void main(String[] args){
        Scanner r=new Scanner(System.in);

        System.out.print("Enter the Number of elements in the Array: ");
        int n=r.nextInt();

        int Array[]=new int[n];

        int i;

        for(i=0;i<n;i++){
            System.out.print("Enter Element: ");
            Array[i]=r.nextInt();
                                                                               
        }

        System.out.print("Enter the element you want to Search: ");
        int e=r.nextInt();

        Binary_Search b=new Binary_Search();
        Sort(Array);

        int result=b.binary_Search(Array, e);

        if (result==-1){
            System.out.println("Element "+e+" is not there");
        }

        else{
            System.out.println("Element "+e+" is there in position "+result);
        }

    }
    
} 