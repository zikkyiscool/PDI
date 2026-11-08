class Exercise_1{
    public static void main(String[] args){
        int sum = 0;
        int num;
        for(int i = 1 ; i<=100 ;i++){
            if(i%2 == 0){
                num = i ;
                sum += num; 
            }
        }
        System.out.println("The sum of even number from 1-100 is " + sum );
    }
}


