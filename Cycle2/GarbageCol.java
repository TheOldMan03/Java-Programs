class GarCol{

    public static void main(String args[]){

        Runtime garbage = Runtime.getRuntime();
        long mem1,mem2;

        int[] Numbers=new int[1000];

        System.out.println("The Total Memory Available is: "+garbage.totalMemory());

        mem1=garbage.freeMemory();//Checking the free memory 
        System.out.println("The Memory available is: "+mem1);

        garbage.gc();//Calling Garbage Collector on Demand

        mem1=garbage.freeMemory();
        System.out.println("The Memory Available after Garbage Collection: "+mem1);

        int i;
        for(i=0;i<1000;i++){
            Numbers[i]=i;
        }//Allocating Numbers 

        mem2=garbage.freeMemory();
        System.out.println("The Free Memory after Allocation of Numbers"+mem2);
        System.out.println("The Memory used :"+(mem1-mem2));

        //Deallocating Memory
        Numbers=null;

        garbage.gc();

        mem1=garbage.freeMemory();
        System.out.println("The Free Memory after Deallocation is: "+mem1);

    }

}