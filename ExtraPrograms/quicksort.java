import java.util.Scanner;

class Sort{

    static void quicksort(int Arr[],int low,int high){ //that is [0,n-1]

        if (low>=high){ //if the element has only 1 number
            return;
        }

        int pivot=Arr[high]; //Selecting the Pivot

        //Doing the Partition in the below code 

        int lp=low;
        int rp=high;

        while(lp<rp){

            while(Arr[lp]<=pivot && lp<rp){
                lp++;
            }//Here we are traversing the array until we find an element larger
            //than pivot


            while(Arr[rp]>=pivot && lp<rp){
                rp--;
            }//Here we are traversing the array until we find an element
            //smaller than pivot

            Swap(Arr,lp,rp);
        }

        Swap(Arr,lp,high);

        quicksort(Arr, low, lp-1); //For the left arr
        quicksort(Arr, rp+1, high); //For the right Arr

    }

    static void Swap(int Array[],int index1,int index2){
        int temp;

        temp=Array[index1];
        Array[index1]=Array[index2];
        Array[index2]=temp;
    }
}

class Demo{
    public static void main(String[] args) {

        Scanner r=new Scanner(System.in);

        System.out.print("Enter the Number of terms in the array: ");
        int n=r.nextInt();

        int Arr[] =new int[n];

        int i;

        for(i=0;i<n;i++){
            System.out.print("Enter the elements: ");
            Arr[i]=r.nextInt();
        }

        Sort.quicksort(Arr,0,n-1);

        for(i=0;i<n;i++){
            System.out.println(Arr[i]);
        }
        
        
    }
}