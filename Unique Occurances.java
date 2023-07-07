public static boolean isFrequencyUnique(int n, int[] arr) {

        if ( n < 2 ){return true ; }
        Map <Integer , Integer> m1 = new HashMap<>();
        boolean result = false ;

        for (int i : arr ){

        if(m1.containsKey(i)){ m1.put(i , m1.get(i) + 1); }
        else{m1.put(i , 1 ); } }

        Collection<Integer> values = m1.values();

        // Print the values
        HashSet<Integer> uniqueValues = new HashSet<>(values);

        return result = (uniqueValues.size() == values.size()) ? true : false ;

        }