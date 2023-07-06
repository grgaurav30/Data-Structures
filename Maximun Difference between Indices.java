int maxIndexDiff(int arr[], int n) {



        int pos[] = new int[n];
        int maxI = -1;
        for(int i = n - 1 ; i >= 0 ; i--){
        pos[i] = maxI;
        if(maxI == -1 || arr[maxI] < arr[i]) maxI = i;
        }
        int res = 0;
        for(int i = 0; i < n ;i++){
        int j = i;
        while(pos[j] != -1 && arr[pos[j]] >= arr[i]){
        res = Math.max(res , pos[j] - i);
        j = pos[j];
        }
        }
        return res;



        }