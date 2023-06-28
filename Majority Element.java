static int majorityElement(int a[], int size)
        {
        if(size == 1){return a[0];}
        Map <Integer,Integer> m1 = new HashMap<>();
        for(int i = 0 ; i < size ; i ++){
        if(m1.containsKey(a[i])){
        m1.put(a[i], m1.get(a[i]) + 1 );
        if(m1.get(a[i]) > (size/2) ){
        return a[i] ;
        }

        }
        else{
        m1.put(a[i] , 1);
        }
        }





        return -1;
        }