import javax.lang.model.type.NullType;

class GarCol{

    public static void main(String args[]){

        Runtime gfg = Runtime.getRuntime();
        long mem1,mem2;

        int[] Numbers=new int[10000];

        System.out.println("The Total Memory Available is: "+gfg.totalMemory());

        mem1=gfg.freeMemory();//Checking the free memory 
        System.out.println("The Memory available is: "+mem1);

        gfg.gc();//Calling Garbage Collector on Demand

        mem1=gfg.freeMemory();
        System.out.println("The Memory Available after Garbage Collection: "+mem1);

        int i;
        for(i=0;i<10000;i++){
            Numbers[i]=i;
        }//Allocating Numbers 

        mem2=gfg.freeMemory();
        System.out.println("The Free Memory after Allocation of Numbers"+mem2);
        System.out.println("The Memory used :"+(mem1-mem2));

        //Deallocating Memory
        for(i=0;i<10000;i++){
            Numbers[i]=null;
        } 

        gfg.gc();

        mem1=gfg.freeMemory();
        System.out.println("The Free Memory after Deallocation is: "+mem1);

    }

}